package c03_ObjectOrientedProgramming.c3ch4_Polymorphism.ch4_Challenge_MySolution;

public class Contact {
    private String name;
    private PhoneNumber phoneNumber;
    private String emialAddress;

    public Contact(String name, PhoneNumber phoneNumber, String emialAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emialAddress = emialAddress;
    }

    public Contact(String name, PhoneNumber phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, String emialAddress) {
        this.name = name;
        this.emialAddress = emialAddress;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", emialAddress='" + emialAddress + '\'' +
                '}';
    }
}
