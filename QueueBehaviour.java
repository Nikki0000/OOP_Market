

public interface QueueBehaviour {
    
    //поместить в очередь
    void takeInQueue(Acthor acthor);

    //сделать заказ
    void takeOrders(Acthor acthor, String name);

    //забрать заказ
    void giveOrders(Acthor acthor, String name);

    //покинуть очередь
    void releaseFromQueue(Acthor acthor);


}
