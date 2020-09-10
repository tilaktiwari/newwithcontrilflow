package constructor;

public class Burger {



    String nameOfBurger;
    char size;
    String topping;
    double priceOfBurger;
    int quantityOfBurger;
    double totalValue;
    boolean isBurgerAvailable;

    // default constructor
    public Burger() {

    }

    public Burger(String nameOfBurger) {
        String burgerName = this.nameOfBurger = nameOfBurger;
        System.out.println("Burger name is " + nameOfBurger);
//        System.out.println("Burger name is "+burgerName);
//        System.out.println("Burger name is "+this.nameOfBurger);
    }

    public Burger(String nameOfBurger, char size) {
        String burgerName = this.nameOfBurger = nameOfBurger;
        char burgerSize = this.size = size;
        System.out.println("Burger name is " + nameOfBurger + " " + "Size is " + burgerSize);
    }

    public Burger(String nameOfBurger, String topping, char size) {
        String burgerName = this.nameOfBurger = nameOfBurger;
        char burgerSize = this.size = size;
        String burgerTopping = this.topping = topping;
        System.out.println("Burger name is " + nameOfBurger + " " + "Size is " + burgerSize + " " + "Topping is " + burgerTopping);
    }

    public Burger(String nameOfBurger, String topping, char size, double priceOfBurger) {
        String burgerName = this.nameOfBurger = nameOfBurger;
        char burgerSize = this.size = size;
        String burgerTopping = this.topping = topping;
        double burgerPrice = this.priceOfBurger = priceOfBurger;
        System.out.println("Burger name is " + nameOfBurger + " " + "Size is " + burgerSize + " " + "Topping is " + burgerTopping + " " + "Burger Price " + burgerPrice);
    }

    public static void main(String[] args) {
        Burger aldrinOrder = new Burger("cheeseBurger");
        Burger roisOrder = new Burger("Corona Burger", 'L');
        Burger SadiaOrder = new Burger("Beef Burger", "Regular", 20.5, 2, 41, 'L');

    }
    public Burger(String nameOfBurger, String topping, char size, double priceOfBurger, int quantityOfBurger) {
        String burgerName = this.nameOfBurger = nameOfBurger;
        char burgerSize = this.size = size;
        String burgerTopping = this.topping = topping;
        double burgerPrice = this.priceOfBurger = priceOfBurger;
        double burgerQuantity = this.quantityOfBurger = quantityOfBurger;
        System.out.println("Burger name is " + nameOfBurger + " " + "Size is " + burgerSize + " "
                + "Topping is " + burgerTopping + " " + "Burger Price " + burgerPrice + " " + "Burger Quantity "
                + burgerQuantity);
    }

    public Burger(String nameOfBurger, String topping, double priceOfBurger, int quantityOfBurger, double totalValue, char size) {
        String burgerName = this.nameOfBurger = nameOfBurger;
        char burgerSize = this.size = size;
        String burgerTopping = this.topping = topping;
        double burgerPrice = this.priceOfBurger = priceOfBurger;
        double burgerQuantity = this.quantityOfBurger = quantityOfBurger;
        double burgerTotalValue = this.totalValue = totalValue;
        System.out.println("Burger name is " + nameOfBurger + " " + "Size is " + burgerSize + " "
                + "Topping is " + burgerTopping + " " + "Burger Price " + burgerPrice + " " + "Burger Quantity "
                + burgerQuantity + " " + "Burger Total value is " + burgerTotalValue);
    }

    public Burger(String nameOfBurger, boolean isBurgerAvailable) {
        String burgerName = this.nameOfBurger = nameOfBurger;
        boolean burgerIsAvailable = this.isBurgerAvailable = isBurgerAvailable;
        System.out.println("Burger name is " + nameOfBurger + " " + "Burger availability " + burgerIsAvailable);
    }






}
