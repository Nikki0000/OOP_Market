import java.time.LocalDate;
import java.util.List;

public class MarketMain {
    public static void main(String[] args) {

        Acthor actor1 = new Human("Ivan");
        Acthor actor2 = new Human("Alex");
        Acthor actor3 = new Human("Geogry");

        Market market1 = new Market();

        Product p1 = new Product("Milk", 20, LocalDate.of(2024, 6, 5));
        Product p2 = new Product("Bread", 20, LocalDate.of(2024, 6, 5));
        Product p3 = new Product("Sugar", 20, LocalDate.of(2024, 6, 5));



        //заходят в магазин
        market1.acceptToMarket(actor1);
        market1.acceptToMarket(actor2);
        market1.acceptToMarket(actor3);
        //выводим тех кто в магазине
        System.out.println(market1.getActhors());


        // добавляем продукты
        market1.addProducts(List.of(p3, p1, p2));
        // выводим продкуты
        market1.update();



        // помещаем в очередь
        //market1.takeInQueue(actor1);
        market1.takeInQueue(actor2);
        market1.takeInQueue(actor3);

        // делаем заказ
        market1.takeOrders(actor1, "Bread");
        market1.takeOrders(actor3, "Milk");

        //сделал заказ?
        //System.out.println(actor1.isMakeOrder());
        
        //забирает продукт
        market1.giveOrders(actor1, "Bread");
        market1.giveOrders(actor3, "Milk");
        // выводим продкуты
        market1.update();

        //получил заказ?
        //System.out.println(actor1.isTakeOrder());
        
        //покидает магазин
        market1.releaseFromMarket(actor3);

        //выводим кто остался
        System.out.println(market1.getActhors());
        



    }
}
