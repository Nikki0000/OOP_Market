

public interface MarketBehaviour {

    //вошел в магазин
    void acceptToMarket(Acthor acthor);

    //выходит из магазина
    void releaseFromMarket(Acthor acthor);

    //обновляет состояние магазина
    void update();
}