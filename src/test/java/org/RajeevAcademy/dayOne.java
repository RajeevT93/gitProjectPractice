package org.RajeevAcademy;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class dayOne {


   @AfterTest
   public void lastExecution(){

       System.out.println("I will execute last");
   }

   @AfterSuite
   public void afSuite(){



       System.out.println("I will execute after suite");
   }

    @Test(groups = "smoke")



    public void demo(){
        System.out.println("Rahul Shetty");
        //Assert.assertTrue(false);
   }


    @Test(groups = "smoke")
    public void secondTest(){
        System.out.println("bye");
    }
}
