public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super("burger", name, price);
    }

    @Override
    public String getname() {
        return super.getname() + " Burger";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice()
                + ((extra1 == null) ? 0 : extra1.getAdjustedPrice())
                + ((extra2 == null) ? 0 : extra2.getAdjustedPrice())
                + ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    private double getExtraprice(String toppingname) {
        if (toppingname == null) return 0;
        String t = toppingname.toLowerCase();
        return switch (t) {
            case "avocado", "cheese" -> 1.0;
            case "bacon", "ham" -> 2.0;
            default -> 0.0;
        };
    }

    public void addtoppings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item("topping", extra1, getExtraprice(extra1));
        this.extra2 = new Item("topping", extra2, getExtraprice(extra2));
        this.extra3 = new Item("topping", extra3, getExtraprice(extra3));
    }

    public void printItemList() {
        printitem("BASE BURGER", getBasePrice());
        if (extra1 != null) extra1.printitem();
        if (extra2 != null) extra2.printitem();
        if (extra3 != null) extra3.printitem();
    }

    @Override
    public void printitem() {
        printItemList();
        System.out.println("-".repeat(30));
        super.printitem();
    }
}
