package org.RajeevAcademy;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dayTwo {






    @Test(groups = "smoke")
    public void ploan(){
        System.out.println("I am good");
    }

    @BeforeTest
    public void bfsuite(){
        System.out.println("I will execute before Test");
    }
}
