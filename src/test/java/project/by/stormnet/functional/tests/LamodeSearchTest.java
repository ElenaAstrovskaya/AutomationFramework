package project.by.stormnet.functional.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entenies.helpers.HomeHelper;

public class LamodeSearchTest {
    private HomeHelper homeHelper = new HomeHelper();
    private String searchKey = "jeans";

    @Test
    public void performSearch(){
        int countPerPage = homeHelper.search(searchKey).getSearchResultsCountPerPage();
        Assert.assertTrue(countPerPage > 0, "No results were found!");
//        если тест фэйлится, то включается RetryAnalyzer и прогонит все попытки, к последней даст резолюцию
//        Assert.assertFalse(countPerPage > 0, "No results were found!");
    }

    @AfterClass
    public  void tearDown(){
        homeHelper.quit();
    }
}
