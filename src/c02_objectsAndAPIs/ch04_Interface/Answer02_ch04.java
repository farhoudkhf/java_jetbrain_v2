package c02_objectsAndAPIs.ch04_Interface;

// Java code below
/*****************************************************
 Write your answer here, and then test your code.
 Update Shirt class to implement the Product interface.
 ******************************************************/
class Answer02_ch04 {

    /***************************************************
     Change these boolean values to control whether you see
     the expected result and/or hints.
     ****************************************************/
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Do not change this method
    static Shirt buyShirt(String name, double price, String size, String color) {
        return new Shirt(name, price, size, color);
    }
}

// Do not change this interface
interface Product2 {
    String getName();
    void setName(String name);
    double getPrice();
    void setPrice(double price);
}

/**********************************************************
 TODO: Update this class to implement the Product interface.
 ***********************************************************/
class Shirt implements Product2 {
    private String size;
    private String color;
    private String name;
    private double price;

    public Shirt(String name, double price, String size, String color){
        setSize(size);
        setColor(color);
        setName(name);
        setPrice(price);
    }

    public void setSize(String size){
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        /*****************************************************************
         This is how your code will be called.
         Your answer should be a Shirt with a name, price, color, and size.
         You can edit this code to try different testing cases.
         ******************************************************************/
        String name = "Golf Shirt";
        double price = 49.95;
        String color = "White";
        String size = "Medium";
        Shirt shirt = Answer02_ch04.buyShirt(name, price, size, color);
    }
}