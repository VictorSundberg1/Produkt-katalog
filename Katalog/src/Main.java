public class Main {
    public static void main(String[] args) {

        Catalog catalog = new Catalog () ;

        Product product1 = new Product ("bananer", 25) ;

        catalog.AddProduct(product1);
        catalog.ListProducts();


    }
}