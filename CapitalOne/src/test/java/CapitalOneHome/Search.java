package CapitalOneHome;


import Config.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by smhoque on 5/15/17.
 */
public class Search extends CommonAPI {
    @Test
    public void loadWeb(){
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath(".//*[@id='personal-nav']/div/div/ul[2]/li[1]/ul/li[2]/a")).click();
    }
    @Test
    public void load(){
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath(".//*[@id='personal-nav']/div/div/ul[2]/li[1]/ul/li[3]/a")).click();
    }

}
