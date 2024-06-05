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
        System.out.println(acthor.name + ": Вышел из магазина");
    }

    //обновляем состояние магазина
    @Override
    public void update() {
        System.out.println("Продукты: ");
        for (Product product : products) {
            System.out.println(product);
        }
        // System.out.println("Посетители: ");
        // for (Acthor acthor : acthors) {
        //     System.out.println(acthor);
        // }
    }


    //поместить в очередь
    @Override
    public void takeInQueue(Acthor acthor) {
        // устанавливаем готовность сделать заказ - true
        acthor.setMakeOrder(true);
        System.out.println(acthor.getName() + " встал в очередь для заказа");
    }

    //покинуть очереь
    @Override
    public void releaseFromQueue(Acthor acthor) {
        acthor.setMakeOrder(false);
        acthor.setTakeOrder(true);
        System.out.println(acthor.getName() + " покинул очередь");
        
    }

    //сделать заказ
    @Override
    public void takeOrders(Acthor acthor, String name) {
        //берем первый продукт и удаляем его
        if (acthors.contains(acthor) && acthor.isMakeOrder()) {
            System.out.println(acthor.getName() + " заказал " + name);
            acthor.setMakeOrder(true);
        } else {
            System.out.println(acthor.getName() + " не готов сделать");
        }
    }


    // забрать заказ
    @Override
    public void giveOrders(Acthor acthor, String name) {
        if (acthors.contains(acthor) && acthor.isTakeOrder == false && acthor.isMakeOrder == true) {
            Product productToRemove = null;
            for (Product product : products) {
                if (product.getName().equals(name)) {
                    productToRemove = product;
                    break;
                }
            }
            if(productToRemove != null) {
                products.remove(productToRemove);
                acthor.setTakeOrder(true);
                System.out.println(acthor.getName() + " получил заказ " + name);
            } else {
                System.out.println("Продукт " + name + " не найден");
            }
        } else {
            System.out.println(acthor.getName() + " не готов получить заказ");
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
