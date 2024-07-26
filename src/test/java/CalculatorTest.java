import com.pageObject.CalculatorPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CalculatorTest extends BaseClass {
    private CalculatorPage calculatorPage;
    private double result;

    @BeforeMethod
    public void setupPage() {
        calculatorPage = new CalculatorPage(driver);
    }

    @Test(description="Verify addition operation (2 + 8 = 10)")
    public void plusCalculation() {
        calculatorPage.digitTwo.click();
        calculatorPage.plusButton.click();
        calculatorPage.digitEight.click();
        calculatorPage.equalButton.click();
        result = calculatorPage.getResult();
        Assert.assertEquals(result, 10, "Addition result is incorrect");

    }

    @Test(description="Verify subtraction operation (13 - 7 = 6)")
    public void minusCalculation() {
        calculatorPage.digitOne.click();
        calculatorPage.digitThree.click();
        calculatorPage.minusButton.click();
        calculatorPage.digitSeven.click();
        calculatorPage.equalButton.click();
        result = calculatorPage.getResult();
        Assert.assertEquals(result, 6, "Subtraction result is incorrect");
    }

    @Test(description="Verify multiplication operation (4 * 5 = 20)")
    public void multiplyCalculation() {
        calculatorPage.digitFour.click();
        calculatorPage.multiplyButton.click();
        calculatorPage.digitFive.click();
        calculatorPage.equalButton.click();
        result = calculatorPage.getResult();
        Assert.assertEquals(result, 20, "Multiplication result is incorrect");
    }
    @Test(description="Verify division operation (60 / 5 = 12)")
    public void divideCalculation() {
        calculatorPage.digitSix.click();
        calculatorPage.digitZero.click();
        calculatorPage.divideButton.click();
        calculatorPage.digitFive.click();
        calculatorPage.equalButton.click();
        result = calculatorPage.getResult();
        Assert.assertEquals(result, 12, "Division result is incorrect");
    }

    @Test(description="Verify percentage operation (900% = 9)")
    public void percentageCalculation() {
        calculatorPage.digitNine.click();
        calculatorPage.digitZero.click();
        calculatorPage.digitZero.click();
        calculatorPage.percentageButton.click();
        calculatorPage.equalButton.click();
        result = calculatorPage.getResult();
        Assert.assertEquals(result, 9, "Percentage calculation result is incorrect");
    }

    @Test(description="Verify decimal addition operation (0.9 + 0.1 = 1.0)")
    public void decimalCalculation() {
        calculatorPage.digitZero.click();
        calculatorPage.decimalButton.click();
        calculatorPage.digitNine.click();
        calculatorPage.plusButton.click();
        calculatorPage.digitZero.click();
        calculatorPage.decimalButton.click();
        calculatorPage.digitOne.click();
        calculatorPage.backButton.click();
        calculatorPage.digitTwo.click();
        calculatorPage.equalButton.click();
        result = calculatorPage.getResult();
        Assert.assertEquals(result, 1.1, "Decimal addition result is incorrect");
    }

}
