package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PenguinTest {

    @Test
    public void speak() {
        String expected = "honk";
        Penguin penguin = new Penguin();

        String actual = penguin.speak();

        Assert.assertEquals(expected, actual);
    }
}