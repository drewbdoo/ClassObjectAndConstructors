    public class Product {
        private double cost;
        private int quantity;
        private String name;

        public Product(double cost, int quantity, String name) {
            this.cost = cost;
            this.quantity = quantity;
            this.name = name;
        }
    public String printProduct(){
            return(name + " costs " + cost + " and " + quantity + " units were purchased");
        };
        public String totalCost(){
            return("Total cost is " + (cost*quantity));
        };

    };


