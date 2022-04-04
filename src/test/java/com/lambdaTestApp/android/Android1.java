package com.lambdaTestApp.android;

import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Android1 {

        String userName = System.getenv("LT_USERNAME") == null ? "Your LT Username" : System.getenv("LT_USERNAME");
        String accessKey = System.getenv("LT_ACCESS_KEY") == null ? "Your LT AccessKey" : System.getenv("LT_ACCESS_KEY");
        String android_appurl = System.getenv("android_appurl") == null ? "Your android appurl" : System.getenv("android_appurl");

        @Test
        public void basicTest() throws MalformedURLException,
                        InterruptedException {
                DesiredCapabilities caps = new DesiredCapabilities();

                // DesiredCapabilities capabilities = new DesiredCapabilities();
                //         Map<String,Object> caps = new HashMap<>();
                //         caps.put("app","lambda1");
                //         caps.put("isRealMobile",true);
                //         caps.put("deviceName","iPhone 11");
                //         caps.put("devicelog",true);
                //         caps.put("network",true);
                //         caps.put("visual",true);
                //         caps.put("platformName","ios");
                //         caps.put("eventTimings",true);
                //         caps.put("platformVersion","14");
                //         caps.put("w3c",true);
                //         capabilities.setCapability("lt:options",caps);

                caps.setCapability("platformName", "Android");
                caps.setCapability("deviceName", "Galaxy S9");
                caps.setCapability("platformVersion", "10");
                caps.setCapability("isRealMobile", true);
                caps.setCapability("project", "App Automation Demo");
                caps.setCapability("build", "Android");
                caps.setCapability("name", "Single Test");
<<<<<<< HEAD
	        caps.setCapability("visual",true);
                caps.setCapability("devicelog",true);
                caps.setCapability("app", "lambda1");
=======
                caps.setCapability("app", android_appurl );
>>>>>>> 910c5909aa17e911af691826394760ed9441f4c0

                AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                                new URL("https://" + userName + ":" + accessKey + "@beta-hub.lambdatest.com/wd/hub"),
                                caps);
                WebDriverWait wait = new WebDriverWait(driver, 10);
                AndroidElement searchElement = (AndroidElement) wait
                                .until(ExpectedConditions
                                                .elementToBeClickable(MobileBy.AccessibilityId("Search Wikipedia")));
                searchElement.click();
                AndroidElement insertTextElement = (AndroidElement) wait
                                .until(ExpectedConditions.elementToBeClickable(
                                                MobileBy.id("org.wikipedia.alpha:id/search_src_text")));
                insertTextElement.sendKeys("LambdaTest");
                Thread.sleep(5000);

                List<AndroidElement> allProductsName = driver.findElementsByClassName("android.widget.TextView");
                assert (allProductsName.size() > 0);

                // The driver.quit statement is required, otherwise the test continues to
                // execute, leading to a timeout.
                driver.quit();
        }
}
