package com.lambdaTestApp.iOS;

import java.net.URL;
import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class iOS2 {
        public static String username = System.getenv("LT_USERNAME");
        public static String accessKey = System.getenv("LT_ACCESS_KEY");
        public static String iOS_appurl = System.getenv("iOS_appurl");

        @Test
        public void basicTest() throws MalformedURLException, InterruptedException {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("build", "iOSAppAutomation_LT");
                capabilities.setCapability("name", "iOS_Test");
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("deviceName", "iPhone 11");
                capabilities.setCapability("isRealMobile", true);
                capabilities.setCapability("platformVersion", "13.0");
                capabilities.setCapability("visual", true);
<<<<<<< HEAD
                capabilities.setCapability("devicelog",true);
                capabilities.setCapability("app", "lt://APP10020521642428466273822");
=======
                capabilities.setCapability("app", iOS_appurl);
>>>>>>> 910c5909aa17e911af691826394760ed9441f4c0

                IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(
                                new URL("https://" + username + ":" + accessKey + "@beta-hub.lambdatest.com/wd/hub"),
                                capabilities);

                IOSElement Checkbox = (IOSElement) new WebDriverWait(driver, 30).until(
                                ExpectedConditions.elementToBeClickable(MobileBy.xpath(
                                                "//XCUIElementTypeOther[@name=\"Sample page - lambdatest.com\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch")));
                Checkbox.click();

                IOSElement Checkbox1 = (IOSElement) new WebDriverWait(driver, 30).until(
                                ExpectedConditions.elementToBeClickable(MobileBy.xpath(
                                                "//XCUIElementTypeOther[@name=\"Sample page - lambdatest.com\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch")));
                Checkbox1.click();

                IOSElement Checkbox2 = (IOSElement) new WebDriverWait(driver, 30).until(
                                ExpectedConditions.elementToBeClickable(MobileBy.xpath(
                                                "//XCUIElementTypeOther[@name=\"Sample page - lambdatest.com\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[3]/XCUIElementTypeSwitch")));
                Checkbox2.click();

                IOSElement Checkbox3 = (IOSElement) new WebDriverWait(driver, 30).until(
                                ExpectedConditions.elementToBeClickable(MobileBy.xpath(
                                                "//XCUIElementTypeOther[@name=\"Sample page - lambdatest.com\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[4]/XCUIElementTypeSwitch")));
                Checkbox3.click();

                IOSElement Checkbox4 = (IOSElement) new WebDriverWait(driver, 30).until(
                                ExpectedConditions.elementToBeClickable(MobileBy.xpath(
                                                "//XCUIElementTypeOther[@name=\"Sample page - lambdatest.com\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[5]/XCUIElementTypeSwitch")));
                Checkbox4.click();

                IOSElement Checkbox5 = (IOSElement) new WebDriverWait(driver, 30).until(
                                ExpectedConditions.elementToBeClickable(MobileBy.xpath(
                                                "//XCUIElementTypeOther[@name=\"Sample page - lambdatest.com\"]/XCUIElementTypeOther[4]/XCUIElementTypeTextField")));
                Checkbox5.sendKeys("Sixth Item");

                Thread.sleep(5000);

                IOSElement Checkbox6 = (IOSElement) new WebDriverWait(driver, 30).until(
                                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("add")));
                Checkbox6.click();

                // The driver.quit statement is required, otherwise the test continues to
                // execute, leading to a timeout.
                driver.quit();
        }
}