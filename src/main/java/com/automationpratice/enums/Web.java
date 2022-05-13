package com.automationpratice.enums;

import com.automationpratice.Interface.AplicacaoWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



    public enum Web implements AplicacaoWeb {

        CHROME {
            @Override
            public WebDriver getDriver() {
                return new ChromeDriver();
            }
        }




}
