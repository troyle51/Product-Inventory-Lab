package models;

public class Whiskey {
    //Constructor //vvvv
    public Whiskey() {

    }
    //Constructor //vvvv
    public Whiskey(int id, String name, String brand, int qty, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        //this.size = size;
        this.qty = qty;
        this.price = price;
    }

    // Getters and Setters //vvvv
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    //properties //vvvv
    private int id;
    private String name;
    private String brand;
    private int size;
    private float price;
    private int qty;
}
