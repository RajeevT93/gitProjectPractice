package org.RajeevAcademy;

import org.testng.annotations.*;

public class dayThree {


    @Parameters({"URL", "APIKey"})
    @Test
    public void webLogicCarloan(String urlname, String password){

        System.out.println("Web login car");

        System.out.println(urlname);
        System.out.println(password);
    }


    @BeforeClass
    public void beforclass(){
        System.out.println("I will execute before class");
    }


    @Test
    public void mobilelogincarloan(){
        System.out.println("Mobile login car");
    }



    @AfterClass
    public void afterclass(){
        System.out.println("I will execute after class");
    }


    @BeforeSuite
    public void beforesuite(){
        System.out.println("I am No. 1");
    }

    @Test
    public void mobilesignInCarloan(){
        System.out.println("Mobile sign in");
    }



    @BeforeMethod
    public void beforeevery(){

        System.out.println("I will execute before every method");
    }
    @AfterMethod
    public void afterevery(){

        System.out.println("I will execute after every method");
    }
    @Test(dependsOnMethods = "webLogicCarloan")
    public void Apicarloan(){
        System.out.println("api login car");
    }
}