import java.time.LocalDate;

public class Product {
    
    protected String name;

    protected int price;

    protected LocalDate releaseDate;

    public Product(String name, int price, LocalDate releaseDate) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }


    @Override
    public String toString() {
        return "{" + 
                "name = '" + name + '\'' + 
                ", price = " + price + 
                ", releaseDate = " + releaseDate + '}';
    }
    


}
