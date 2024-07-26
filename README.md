# Android Automation Project

This project is designed to automate testing of an Android calculator application using Appium, Java, and the Page Object Model (POM) design pattern.

## Project Structure

The project is organized as follows:

- `src/main/java/com/pageObject/`: Contains the Page Object Model classes for different screens of the application.
- `src/test/java/`: Contains the test classes.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 21 or higher
- Maven
- Appium Server
- Android SDK
- An Android device or emulator

## Installation

1. **Clone the repository:**
    ```sh
    git clone https://github.com/yourusername/android-automation-project.git
    cd android-automation-project
    ```

2. **Install dependencies:**
    ```sh
    mvn clean install
    ```

3. **Start the Appium server:**
   Ensure the Appium server is running on the default URL (`http://127.0.0.1:4723/`).

4. **Connect your Android device:**
   Ensure your Android device or emulator is connected and accessible.

## Running Tests

1. **Navigate to the project directory:**
    ```sh
    cd android-automation-project
    ```

2. **Execute the tests:**
    ```sh
    mvn test
    ```

## Project Details

### Page Objects

The Page Object classes are located in the `com.pageObject` package. Each class represents a screen in the application and provides methods to interact with the UI elements.

### Test Classes

The test classes are located in the `src/test/java` directory and use TestNG for structuring and running the tests.

### Sample Test

Here is an example test from the `CalculatorTest` class:

```java
import com.pageObject.CalculatorPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseClass {
    private CalculatorPage calculatorPage;
    private int result;

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
}
