public interface ActorBehavoir {
    
    void setMakeOrder(boolean flag); //устанавливаем готовность сделать заказ

    void setTakeOrder(boolean flag); //устанавливаем готовность получения заказа

    boolean isMakeOrder();//готов ли сделать заказ

    boolean isTakeOrder();//получили ли уже заказ

}
