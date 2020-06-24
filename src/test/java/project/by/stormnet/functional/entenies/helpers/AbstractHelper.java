package project.by.stormnet.functional.entenies.helpers;

import project.by.stormnet.functional.entenies.pages.AbstractPage;

public class AbstractHelper {
    // хэлперы работают с пэйджами, пэйджи работают с кором. Нужен объект пейдж
    AbstractPage abstractPage = new AbstractPage();

    public void quit() {
        abstractPage.getDriver().quit();
    }
}
