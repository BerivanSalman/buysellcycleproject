package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class ReusableMethods {


    public static void scrollToElement(WebElement element) {

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)Driver.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",element);
    }

    public static void wait(int second) {

        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> createStringList(List<WebElement> webElementList) {

        List<String> stringList = new ArrayList<>();

        for (WebElement eachElement : webElementList
        ) {

            stringList.add(eachElement.getText());
        }

        return stringList;
    }

    public static void changeWindowWithTitle(String targetTitle, WebDriver driver) {

        Set<String> whdSet = driver.getWindowHandles();

        for (String eachWhd : whdSet
        ) {
            driver.switchTo().window(eachWhd);

            String currentTitle = driver.getTitle();

            if (currentTitle.equals(targetTitle)) {

                break;
            }
        }
    }

    public static void tumSayfaSreenshot(WebDriver driver) {
        // 1- bir TakesScreenShot objesi olusturun ve deger olarak driver'i atayin

        TakesScreenshot tss = (TakesScreenshot) driver;

        // 2- screenshot'i kaydedecegimiz bir dosya olusturalim
        //    screenshot ismini unique yapabilmek icin, timestamp ekleyelim
        LocalDateTime ldt = LocalDateTime.now(); // 2024-01-24T19:01:05.777116
        DateTimeFormatter zamanFormati = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String timeStamp = ldt.format(zamanFormati); // 240124190341


        File tumSayfaScreenshot = new File("target/tumSayfaScreenshot/tumSayfa" + timeStamp + ".jpeg");

        // 3- tss objesini kullanarak screenshot alin ve bir File olarak kaydedin

        File geciciDosya = tss.getScreenshotAs(OutputType.FILE);

        // 4- gecici dosyayi deger olarak asil kaydedilecek File'a kopyalayin

        try {
            FileUtils.copyFile(geciciDosya, tumSayfaScreenshot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void tumSayfaSreenshot(WebDriver driver, String resimAdi) {
        // 1- bir TakesScreenShot objesi olusturun ve deger olarak driver'i atayin
        TakesScreenshot tss = (TakesScreenshot) driver;

        // 2- screenshot'i kaydedecegimiz bir dosya olusturalim
        File tumSayfaScreenshot = new File("target/tumSayfaScreenshot/" + resimAdi + ".jpeg");

        // 3- tss objesini kullanarak screenshot alin ve bir File olarak kaydedin
        File geciciDosya = tss.getScreenshotAs(OutputType.FILE);

        // 4- gecici dosyayi deger olarak asil kaydedilecek File'a kopyalayin
        try {
            FileUtils.copyFile(geciciDosya, tumSayfaScreenshot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void webElementScreenshot(WebElement webElement) {
        // 1- screenshot alacaginiz webelementi locate edip kaydedin
        // 2- screenshot'i kaydedecegimiz dosyayi olusturun
        //    screenshot ismini unique yapabilmek icin, timestamp ekleyelim
        LocalDateTime ldt = LocalDateTime.now(); // 2024-01-24T19:01:05.777116
        DateTimeFormatter zamanFormati = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String timeStamp = ldt.format(zamanFormati); // 240124190341

        File webelementSS = new File("target/webelementScreenshots/webElement" + timeStamp + ".jpg");
        // 3- webelementi kullanarak screeshot alin ve gecici dosyaya kaydedin
        File geciciScreenshot = webElement.getScreenshotAs(OutputType.FILE);
        // 4- gecici dosyayi asil dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciScreenshot, webelementSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void webelementScreenshot(WebElement webElement, String screenshotIsim) {
        // 1- screenshot alacaginiz webelementi locate edip kaydedin
        // 2- screenshot'i kaydedecegimiz dosyayi olusturun
        // screenshot ismini unique yapabilmek icin, timestamp ekleyelim
        LocalDateTime ldt = LocalDateTime.now(); // 2024-01-24T19:01:05.777116
        DateTimeFormatter zamanFormati = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String timeStamp = ldt.format(zamanFormati); // 240124190341

        File webelementSS = new File("target/webelementScreenshots/" + screenshotIsim + timeStamp + ".jpg");
        // 3- webelementi kullanarak screeshot alin ve gecici dosyaya kaydedin
        File geciciScreenshot = webElement.getScreenshotAs(OutputType.FILE);
        // 4- gecici dosyayi asil dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciScreenshot, webelementSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }


    public static WebElement iWaitForTheElementWithIdToBecomeVisible(String xpath) {
        iWaitForTheElementWithIdToBecomeVisible(xpath);
        return null;
    }



        // Waiting 30 seconds for an element to be present on the page, checking
        // for its presence once every 5 seconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("foo"));
            }
        });




}