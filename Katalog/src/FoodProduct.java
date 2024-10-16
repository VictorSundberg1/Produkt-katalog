public class FoodProduct extends Product{
    private String expiringDate;

    public FoodProduct(String name, int price, String expiringDate) {
        super(name, price);
        this.expiringDate = expiringDate;
    }
}
