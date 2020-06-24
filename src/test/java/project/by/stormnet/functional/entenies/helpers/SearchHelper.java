package project.by.stormnet.functional.entenies.helpers;

import project.by.stormnet.functional.entenies.pages.SearchPage;

public class SearchHelper extends AbstractHelper {
    private SearchPage searchPage = new SearchPage();

    public int getSearchResultsCountPerPage(){
        return searchPage.getResultsSizePerPage();
    }

    public int getAllResultsCount(){
        return Integer.parseInt(searchPage.getResultCount().split(" ")[0]);
    }
}
