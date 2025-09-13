public class Main {
    public static void main(String[] args) {
        // quick checks
        Burger burger = new Burger("regular", 2.0);
        burger.addtoppings("bacon", "ham", "cheese");
        burger.printitem();

        // default meal
        MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        regularMeal.setDrinkSize("LARGE");
        regularMeal.printItemList();

        // second meal (explicit)
        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemList();
    }
}
