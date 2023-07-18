package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void petInheritanceTest(){
        Pet cat = new Cat();
        Assert.assertTrue(cat instanceof Pet);
    }

    @Test
    public void setName() {
        Cat c = new Cat();
        c.setName("Boots");

        String expected = "Boots";

        String actual = c.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        Cat c = new Cat();
        c.setName("Boots");

        String expected = "Boots";

        String actual = c.getName();

        Assert.assertEquals(expected, actual);
    }
}
