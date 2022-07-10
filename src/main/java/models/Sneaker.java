package models;


//class /vvvv
public class Sneaker {

//properties //vvvv
    private int id;
    private String name;
    private String brand;
    private String sport;
    private int size;
    private float price;



    //Constructor //vvvv
    public Sneaker(){
    }
    //Constructor //vvvv
    public Sneaker(int id, String name, String brand, String sport, int size, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.sport = sport;
        this.size = size;
        this.price = price;
    }


//Getters and Setters //vvvv
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
    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public float getPrice() {
        return price;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setPrice(float price) {
        this.price = price;
    }

}
