package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("chromedriver.driver", "/home/dm/IdeaProjects/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.delivery-club.ru");
    }

    @After
    public void close() {
        driver.quit();

    }
}
