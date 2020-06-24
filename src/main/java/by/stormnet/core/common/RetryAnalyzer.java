package by.stormnet.core.common;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    // счетчик попыток перезапуска, маскимально 5
    private  int counter = 0;
    private int retryLimit = 4;

    public boolean retry(ITestResult iTestResult) {
        if(counter < retryLimit){
            counter++;
            return true;
        }
        return false;
    }
}
