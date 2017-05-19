package utility.ExtentReport;

/**
 * Created by ripon on 5/20/17.
 */
public class ApplicationLog {
    public static void epicLogger(String epic){
        TestLogger.log(epic);
        TestLogger.log("Launch local browser Instance");
    }
}
