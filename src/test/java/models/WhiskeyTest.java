package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhiskeyTest {
    @Test
    public void constructorTest() {
        int expectedId = 10;
        String expectedName = "Whiskyo";
        String expectedBrand = "Whisk";
        int expectedQty = 16;
        float expectedPrice = 120.00f;

        Whiskey testWhiskey = new Whiskey(expectedId, expectedName, expectedBrand, expectedQty, expectedPrice);

        Assertions.assertEquals(expectedId, testWhiskey.getId());
        Assertions.assertEquals(expectedName, testWhiskey.getName());
        Assertions.assertEquals(expectedBrand, testWhiskey.getBrand());
        Assertions.assertEquals(expectedQty, testWhiskey.getQty());
        Assertions.assertEquals(expectedPrice, testWhiskey.getPrice());
    }
    @Test
    public void setIdTest() {
        int expected = 0;

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setId(expected);

        Assertions.assertEquals(expected, testWhiskey.getId());
    }
    @Test
    public void setNameTest() {
        // given (1)
        String expected = "OZWEEGO";

        // when (2)
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getName());
    }
    @Test
    public void setBrandTest() {
        String expected = "Whisk";

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setBrand(expected);

        Assertions.assertEquals(expected, testWhiskey.getBrand());
    }
    @Test
    public void setSizeTest() {
        int expected = 16;

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setSize(expected);

        Assertions.assertEquals(expected, testWhiskey.getSize());
    }
    @Test
    public void setQtyTest() {
        // given
        int expected = 1;

        // when
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setQty(expected);

        // then
        Assertions.assertEquals(expected, testWhiskey.getQty());
    }
    @Test
    public void setPriceTest() {
        float expected = 20.00f;

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setPrice(expected);

        Assertions.assertEquals(expected, testWhiskey.getPrice());
    }
}
