package HomePage;

import Config.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.ExtentReport.TestLogger;

/**
 * Created by smhoque on 5/19/17.
 */
public class CapitalOneHome extends CommonAPI{
    @FindBy(how = How.CSS, using = "#uhc-top-nav-menu li:nth-child(1)")
    public static WebElement CriditCards;
    @FindBy(how = How.CSS, using = "#uhc-top-nav-menu li:nth-child(2)")
    public static WebElement Bank;
    @FindBy(how = How.CSS, using = "#uhc-top-nav-menu li:nth-child(3)")
    public static WebElement Borrow;
    @FindBy(how = How.CSS, using = "#uhc-top-nav-menu li:nth-child(4)")
    public static WebElement Invest;
    @FindBy(how = How.CSS, using = "#uhc-top-nav-menu li:nth-child(4)")
    public static WebElement Learn;

    public static WebElement getCriditCards() {
        return CriditCards;
    }

    public static WebElement getBank() {
        return Bank;
    }

    public static WebElement getBorrow() {
        return Borrow;
    }

    public static WebElement getInvest() {
        return Invest;
    }

    public static WebElement getLearn() {
        return Learn;
    }
    public WebElement clickCreditCard() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getCriditCards();
    }


}
