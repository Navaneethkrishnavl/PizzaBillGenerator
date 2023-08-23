public class pizza {
    private int price;
    private boolean veg;
    private int extraCheese = 100;
    private int extraToppings = 150;
    private int takeAwayCharge = 20;
    private int basePizza;
    private boolean isExtraCheese = false;
    private boolean isExtraToppings = false;
    private boolean isTakeAway = false;

    public pizza(boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizza = this.price;
    }
    public void getPizzaPrice() {
        System.out.println(this.price);
    }
    public void addExtraCheese() {
        isExtraCheese = true;
        this.price = this.price + extraCheese;
    }
    public void addExtraToppings() {
        isExtraToppings = true;
        this.price = this.price + extraToppings;
    }
    public void addTakeAway() {
        isTakeAway = true;
        this.price= this.price + takeAwayCharge;
    }
    public void getBill() {
        System.out.println("Pizza :"+basePizza);
        if(isExtraCheese) {
            System.out.println("Extra Cheese :"+extraCheese);
        }
        if(isExtraToppings) {
            System.out.println("Extra Toppings :"+extraToppings);
        }
        if(isTakeAway) {
            System.out.println("Take Away charge :"+takeAwayCharge);
        }
        System.out.println("Total Amount :"+this.price);
    }
}
