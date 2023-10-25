public class CafeTechAppliances{
        protected String category;
        protected String model;
        protected double price;
        protected int quantity; 

       public CafeTechAppliances(){
                System.out.println("\n=======================================================");
                System.out.println("Internet Cafe Appliances for Sale :");
        }
        public CafeTechAppliances(String category, String model, double price, int quantity) {
                this.category = category;
                this.model = model;
                this.price = price;
                this.quantity = quantity;
            }
        
        public void setCategory(String type)
            {
                this.category = type;
            }

        public String getCategory()
            {
                return category;
            }

        public void setModel(String model)
            {
                this.model = model;
            }

        public String getModel()
            {
                return model;
            }

        public void setPrice(double price)
            {
                this.price = price;
            }

        public double getPrice()
            {
                return price;
            }

        public void setQuantity(int quantity)
            {
                this.quantity = quantity;
            }

        public int getQuantity()
            {
                return quantity;
            }
        public double calculateTotalPrice() {
                return price * quantity;
            }
    }
