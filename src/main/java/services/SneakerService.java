package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class SneakerService {
    private static Integer nextId = 0;
    private static ArrayList<Sneaker> inventory = new ArrayList<>();

    public static Sneaker create(String name, String brand, String sport, int size, int qty, float price) {
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, qty, price);
        inventory.add(createdSneaker);
        return createdSneaker;
    }

    public Sneaker findSneaker(Integer id) {
        return inventory.get(id);
    }

    public Sneaker[] findAll() {
        Sneaker[] findArr = new Sneaker[inventory.size()];
        for (int i = 0; i < findArr.length; i++) {
            findArr[i] = inventory.get(i);
        }
        return findArr;
    }

}
