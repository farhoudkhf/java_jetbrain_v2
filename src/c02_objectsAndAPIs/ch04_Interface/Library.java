package c02_objectsAndAPIs.ch04_Interface;

public class Library {

    public static void main(String[] args) {

        Product book = new Book();
        book.setName("In the Kitchen with H+ Sport");

        Book book2 = new Book();
        book2.getPrice();
    }
}
