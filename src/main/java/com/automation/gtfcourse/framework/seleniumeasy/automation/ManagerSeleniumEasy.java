package com.automation.gtfcourse.framework.seleniumeasy.automation;

import com.automation.gtfcourse.framework.seleniumeasy.automation.homepage.HomePage;
import com.automation.gtfcourse.framework.seleniumeasy.automation.inputformsubmitpage.InputFormSubmitPage;
import com.automation.gtfcourse.framework.seleniumeasy.automation.tools.ScreenShot;
import com.automation.gtfcourse.framework.seleniumeasy.automation.tools.SwitchWindows;
import com.automation.gtfcourse.framework.seleniumeasy.automation.tools.TestNGListeners;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

@Listeners(TestNGListeners.class)

public class ManagerSeleniumEasy {

    private String systemUnderTest;
    public String testUserOne;
    public String testUserTwo;
    public String passsword;
    private String pathToGlobalVariables = "src\\test\\resources\\globalvariables.properties";

    public WebDriver driver;
    private ChromeOptions chromeOptions;
    public HomePage homePage;
    public InputFormSubmitPage inputFormSubmitPage;
    public ScreenShot screenShot;
    public SoftAssert softAssert;
    public SwitchWindows switchWindows;
    public Logger logger;


    @BeforeSuite
    public void loadInGlobalVariables() throws IOException {
        logger = LogManager.getLogger(ManagerSeleniumEasy.class);
        logger.info("Logging started");
        logger.info("Loading global variables");
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(pathToGlobalVariables);
        properties.load(fileInputStream);
        systemUnderTest = properties.getProperty("url");
        testUserOne = properties.getProperty("testUserOne");
        testUserTwo = properties.getProperty("testUserTwo");
        passsword = properties.getProperty("password");
        logger.info("Global variables loaded");
    }

    @Parameters ({"browser"})
    @BeforeMethod
    public void prepareTests(@Optional("Chrome") String browser){
        //System.out.println(WebDriverManager.chromedriver().getDownloadedDriverVersion());
        //System.out.println(WebDriverManager.chromedriver().getDriverVersions());
        //WebDriverManager.chromeDriver().driverVersion("enter needed version").setup();
        logger = LogManager.getLogger(ManagerSeleniumEasy.class);
        logger.info("Initializing Web Driver");

        if(browser.equals("Chrome")){
            //System.out.println(WebDriverManager.chromedriver().getDownloadedDriverVersion());
            //System.out.println(WebDriverManager.chromedriver().getDriverVersions());
            //WebDriverManager.chromeDriver().driverVersion("enter needed version").setup();
            WebDriverManager.chromedriver().setup();
            chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("start-maximized");
            driver = new ChromeDriver(chromeOptions);
            logger.info("Chrome driver initialized");
        }

        if(browser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            logger.info("Firefox driver initialized");
        }

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(systemUnderTest);
        logger.info(systemUnderTest + " has been opened");

        homePage = new HomePage(driver);
        inputFormSubmitPage = new InputFormSubmitPage(driver);
        screenShot = new ScreenShot(driver);
        softAssert = new SoftAssert();
        switchWindows = new SwitchWindows(driver);

        logger = LogManager.getLogger(getClass());
    }

    @AfterMethod
    public void terminateDriver(){
        driver.quit();
    }

    @Test
    public void testDriver(){
    }
}
