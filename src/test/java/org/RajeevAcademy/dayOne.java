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

   @Test
   public void demoTwo(){
       System.out.println("This is demo two");
   }



    @Test
    public void demoThree(){
        System.out.println("This is demo Three");
    }

    public void demoFour(){
        System.out.println("This is demo Four");
    }

    public void demoFive(){
        System.out.println("This is demo Five");
    }


    @Test
    public void getDataOne(){
        System.out.println("This is getDataOne");
    }
    

    @Test(groups = "smoke")
    public void secondTest(){
        System.out.println("bye");
    }
}
