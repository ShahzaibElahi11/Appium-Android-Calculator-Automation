package com.pageObject;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    private AndroidDriver driver;

    @FindBy(id = "com.transsion.calculator:id/digit_0")
    public WebElement digitZero;

    @FindBy(id = "com.transsion.calculator:id/digit_1")
    public WebElement digitOne;

    @FindBy(id = "com.transsion.calculator:id/digit_2")
    public WebElement digitTwo;

    @FindBy(id = "com.transsion.calculator:id/digit_3")
    public WebElement digitThree;

    @FindBy(id = "com.transsion.calculator:id/digit_4")
    public WebElement digitFour;

    @FindBy(id = "com.transsion.calculator:id/digit_5")
    public WebElement digitFive;

    @FindBy(id = "com.transsion.calculator:id/digit_6")
    public WebElement digitSix;

    @FindBy(id = "com.transsion.calculator:id/digit_7")
    public WebElement digitSeven;

    @FindBy(id = "com.transsion.calculator:id/digit_8")
    public WebElement digitEight;

    @FindBy(id = "com.transsion.calculator:id/digit_9")
    public WebElement digitNine;

    @FindBy(id = "com.transsion.calculator:id/op_add")
    public WebElement plusButton;

    @FindBy(id = "com.transsion.calculator:id/op_sub")
    public WebElement minusButton;

    @FindBy(id = "com.transsion.calculator:id/op_mul")
    public WebElement multiplyButton;

    @FindBy(id = "com.transsion.calculator:id/op_div")
    public WebElement divideButton;

    @FindBy(id = "com.transsion.calculator:id/eq")
    public WebElement equalButton;

    @FindBy(id = "com.transsion.calculator:id/dec_point")
    public WebElement decimalButton;

    @FindBy(id = "com.transsion.calculator:id/op_pct")
    public WebElement percentageButton;

    @FindBy(id = "com.transsion.calculator:id/del")
    public WebElement backButton;

    @FindBy(id = "com.transsion.calculator:id/clr")
    public WebElement clearButton;

    @FindBy(id = "com.transsion.calculator:id/result")
    public WebElement resultScreen;

    public CalculatorPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public double getResult() {
        return Double.parseDouble(resultScreen.getText());
    }
}
