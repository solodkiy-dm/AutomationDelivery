package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings{

    @Test
    public void firstTest() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Delivery Club — Доставка еды и продуктов");
    }
    @Test
    public void firstTest2() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Delivery Club — Доставка еды и продуктов");
    }

}
