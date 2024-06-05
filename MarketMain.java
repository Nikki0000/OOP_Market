import java.time.LocalDate;
import java.util.List;

public class MarketMain {
    public static void main(String[] args) {

        Acthor actor1 = new Human("Ivan");
        Acthor actor2 = new Human("Alex");
        Acthor actor3 = new Human("Geogry");

        Market market1 = new Market();

        Product p1 = new Product("Milk", 20, LocalDate.of(2024, 6, 5));
        Product p2 = new Product("Bread", 15, LocalDate.of(2024, 6, 4));
        Product p3 = new Product("Sugar", 18, LocalDate.of(2024, 6, 3));



        //заходят в магазин
        market1.acceptToMarket(actor1);
        market1.acceptToMarket(actor2);
        market1.acceptToMarket(actor3);
        //выводим тех кто в магазине
        System.out.println(market1.getActhors());


        // добавляем продукты
        market1.addProducts(List.of(p3, p1, p2));
        // выводим инфо
        market1.update();



        // помещаем в очередь
        //market1.takeInQueue(actor1);
        market1.takeInQueue(actor2);
        market1.takeInQueue(actor3);

        // делаем заказ
        market1.takeOrders(actor1, "Bread");
        market1.takeOrders(actor2, "Sugar");
        market1.takeOrders(actor3, "Milk");
        
        
        //забирает продукт
        market1.giveOrders(actor1, "Bread");
        market1.giveOrders(actor2, "Sugar");
        market1.giveOrders(actor3, "Milk");
        // выводим инфо
        market1.update();

        // Проверяем, получил ли заказ
        System.out.println(actor1.getName() + " получил заказ: " + actor1.isTakeOrder());
        System.out.println(actor2.getName() + " получил заказ: " + actor2.isTakeOrder());
        System.out.println(actor3.getName() + " получил заказ: " + actor3.isTakeOrder());

        //выходит из очереди
        market1.releaseFromQueue(actor1);
        market1.releaseFromQueue(actor2);
        market1.releaseFromQueue(actor3);

        //покидает магазин
        market1.releaseFromMarket(actor2);
        market1.releaseFromMarket(actor3);

        //выводим кто остался
        System.out.println(market1.getActhors());
        
        market1.update();


        market1.releaseFromMarket(actor1);
        System.out.println(market1.getActhors());
        market1.update();
        


    }
}
