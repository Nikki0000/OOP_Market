

public abstract class Acthor implements ActorBehavoir{
    
    protected String name;

    protected boolean isMakeOrder;//факт готовности сделать заказ

    protected boolean isTakeOrder;//факт получения заказа

    public Acthor(String name) {
        this.name = name;
    }

    public abstract String getName();

    @Override
    public String toString() {
        return "{" + 
                "name = '" + name + '\'' + '}';
    }

}
