package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {

    @Test //(1)
    public void constructorTest() {

        //(2)
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (3)
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand, expectedSport, expectedQty, expectedPrice);

        // (4)
        Assertions.assertEquals(expectedId, testSneaker.getId());
        Assertions.assertEquals(expectedName, testSneaker.getName());
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
        Assertions.assertEquals(expectedSport, testSneaker.getSport());
        Assertions.assertEquals(expectedQty, testSneaker.getQty());
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice());
    }

    @Test
    public void setNameTest() {
        // given (1)
        String expected = "OZWEEGO";

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getName());
    }

    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Nike";

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setBrand(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getBrand());
    }

    @Test
    public void setSportTest() {
        // given (1)
        String expected = "Tennis";

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSport(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSport());
    }

    @Test
    public void setSizeTest() {
        // given
        int expected = 1;

        // when
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSize(expected);

        // then
        Assertions.assertEquals(expected, testSneaker.getSize());
    }
    @Test
    public void setQtyTest() {
        // given
        int expected = 1;

        // when
        Sneaker testSneaker = new Sneaker();
        testSneaker.setQty(expected);

        // then
        Assertions.assertEquals(expected, testSneaker.getQty());
    }

    @Test
    public void setPriceTest() {
        float expected = 5.00F;

        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);

        Assertions.assertEquals(expected, testSneaker.getPrice());
    }

    @Test
    public void setIdTest() {
        int expected = 0;

        Sneaker testSneaker = new Sneaker();
        testSneaker.setId(expected);

        Assertions.assertEquals(expected, testSneaker.getId());
    }



}
