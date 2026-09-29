package com.devops;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testApplicationMessage() {

        String expected = "Hello! End-to-End DevOps Pipeline is Running Successfully!";

        String actual = App.getMessage();

        assertEquals(expected, actual);
    }
}