import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List <Product> foods;
    private List <Product> electronics;

    public Catalog () {
        foods = new ArrayList<>();
        electronics = new ArrayList<>();
    }

    public void AddProduct (Product product) {
        foods.add(product);
        electronics.add(product);
    }

    public void ListProducts () {
        for (Product a : products) {
            System.out.println(a);
        }
    }


}
