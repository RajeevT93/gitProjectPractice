package org.RajeevAcademy;

import org.testng.annotations.Test;

public class dayFour {


    @Test
    public void webLoginhomeloan(){
        System.out.println("Web login home");
    }


    @Test(groups = "smoke")
    public void mobileloginhome(){
        System.out.println("Mobile login home");
    }
}
