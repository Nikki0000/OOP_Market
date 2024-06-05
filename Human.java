public class Human extends Acthor {

    public Human(String name) {
        super(name);
    }

    //сеттер - готов ли сделать заказ
    @Override
    public void setMakeOrder(boolean flag) {
        this.isMakeOrder = flag;
    }

    //сеттер - получил ли заказ
    @Override
    public void setTakeOrder(boolean flag) {
        this.isTakeOrder = flag;
    }

    //возвращает, готов ли сделать заказ
    @Override
    public boolean isMakeOrder() {
        //System.out.println("Готов сделать заказ?: " + isMakeOrder);
        return isMakeOrder;
    }

    //возвращает, получил ли заказ
    @Override
    public boolean isTakeOrder() {
        //System.out.println("Получил заказ?:" + isTakeOrder);
        return isTakeOrder;
    }


    @Override
    public String getName() {
        return name;
    }
    
}
