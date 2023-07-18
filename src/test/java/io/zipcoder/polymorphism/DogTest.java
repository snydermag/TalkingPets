package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void speak() {
        String expected = "boof";
        Dog dog = new Dog();

        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }
}