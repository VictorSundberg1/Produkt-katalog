public class ElectronicProduct extends Product {

    private String quarantee;

    public ElectronicProduct(String name, int price, String quarantee) {
        super(name, price);
        this.quarantee = quarantee;
    }
}
