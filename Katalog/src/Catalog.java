import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List <Product> products;

    public Catalog () {
        products = new ArrayList<>();
    }

    public void AddProduct (Product product) {
        products.add(product);
    }

    public void ListProducts () {
        for (Product a : products) {
            System.out.println(a);
        }
    }


}
