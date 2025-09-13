public class MealOrder {
    private Item drink;
    private Burger burger;
    private Item side;

    public MealOrder() {
        // default: burger "regular", drink "coke", side "fries"
        this("regular", "coke", "fries");
    }

    // order: burgerType, drinkType, sideType
    public MealOrder(String burgerType, String drinkType, String sideType) {
        this.burger = new Burger(burgerType, 4.0);
        this.drink = new Item("drink", drinkType, 1.0);
        this.side = new Item("side", sideType, 1.5);
    }

    public double getTotalprice() {
        return burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
    }

    // print the individual items and the total
    public void printItemList() {
        burger.printitem();
        side.printitem();
        drink.printitem();
        Item.printitem("TOTAL", getTotalprice());
        System.out.println("=".repeat(30));
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addtoppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
