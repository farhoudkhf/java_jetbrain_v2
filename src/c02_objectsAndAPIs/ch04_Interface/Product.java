package c02_objectsAndAPIs.ch04_Interface;

public interface Product {

    String getName();
    void setName(String name);

    default double getPrice() {return 50;}
    default void setPrice(double price){}
}
