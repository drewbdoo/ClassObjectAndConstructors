public class ProductMain {

    public static void main(String[] args) {
        Product milk = new Product(4, 10, "Gallon of milk");
        System.out.println(milk.printProduct());
        System.out.println(milk.totalCost());

    }
}
