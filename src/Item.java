public class Item {
    private String type;
    private String name;
    private double price;
    private String size;



    public Item(String type, String drinktype, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public double getBasePrice(){return price;}
    public double getAdjustedPrice(){
        if (size == null) return getBasePrice();
        return switch (size){
            case "small"-> getBasePrice() - 0.5;
            case "large"-> getBasePrice() + 1;
            default->getBasePrice();
         };
    }
    public String  getname(){
        if (type.equals("side") || type.equals("drink")) {
        return size + " " + name;}
        return name;}

    public void setSize(String size) {
        this.size = size;
    }
    public static void printitem(String name,double price){
        System.out.printf("%20s:%6.2f%n",name,price);
    }
    public void printitem(){ printitem(getname(),getAdjustedPrice());};
}


