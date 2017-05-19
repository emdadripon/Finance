package CrediCard;

import Config.CommonAPI;
import HomePage.CapitalOneHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.ExtentReport.ApplicationLog;

/**
 * Created by smhoque on 5/19/17.
 */
public class creditcard extends CommonAPI {
    @Test
    public void CapitaloneCreditCard(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-8> GREEN-8 </a>");
        CapitalOneHome capitalOneHome = PageFactory.initElements(driver, CapitalOneHome.class);
        capitalOneHome.clickCreditCard();

    }
}
