package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class Oct12th {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.close();
    }
}
