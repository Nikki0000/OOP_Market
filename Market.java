import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {


    protected List<Acthor> acthors = new ArrayList<>();

    protected List<Product> products = new ArrayList<>();

    //вошел в магазин
    @Override
    public void acceptToMarket(Acthor acthor) {
        acthors.add(acthor);
        System.err.println(acthor.name + ": Зашел в магазин");
        System.out.println("");
    }

    //вышел из магазина
    @Override
    public void releaseFromMarket(Acthor acthor) {
        acthors.remove(acthor);
        //System.out.println(acthors.);
    }

    //обновляем состояние магазина
    @Override
    public void update() {
        System.out.println("Продукты: ");
        System.out.println(products);
    }


    //поместить в очередь
    @Override
    public void takeInQueue(Acthor acthor) {
        // устанавливаем готовность сделать заказ - true
        acthor.setMakeOrder(true);
    }

    //покинуть очереь
    @Override
    public void releaseFromQueue(Acthor acthor) {
        acthor.setTakeOrder(true);
    }

    //сделать заказ
    @Override
    public void takeOrders(Acthor acthor, String name) {
        //берем первый продукт и удаляем его
        if (acthors.contains(acthor) && acthor.isMakeOrder == true) {
            System.out.println(acthor.getName() + " заказал " + name);
        } else {
            System.out.println(acthor.getName() + " не готов сделать");
        }
    }


    // забрать заказ
    @Override
    public void giveOrders(Acthor acthor, String name) {
        if (acthors.contains(acthor) && acthor.isMakeOrder == true) {
            for (Product product : products) {
                if (product.getName().equals(name)) {
                    // выводим параметры найденного продукта
                    System.out.println("Product have name " + name);
                    System.out.println("");
                    //удаляем найденный продукт из списка
                    products.remove(product);
                    acthor.isTakeOrder = true;
                    break;
                }
            }
        }
        
    }


    

    //выводим тех кто в магазине
    public List<Acthor> getActhors() {
        System.out.println("Люди в магазине:");
        return acthors;
    }

    //добавляем продукты
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }


}
