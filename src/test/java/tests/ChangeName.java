package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;

public class ChangeName extends TestBase {
    private HomePage homePage;
    private ProjectPage projectPage;
    private PlaygroundPage playgroundPage;
    private PeoplePage peoplePage;
    private CreateUserPage createUserPage;
    private EditUserPage editUserPage;


    @BeforeSuite
    public void openPage () {
        homePage = new HomePage (driver);
        homePage.open ();
        homePage.login ();

        projectPage = new ProjectPage (driver);

        projectPage.openProject ();

        playgroundPage = new PlaygroundPage (driver);

        playgroundPage.openPeople ();

    }



    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
    public void editPeople(String name, String Surname, String seniority, String technologies) throws InterruptedException {
        String user = name + " " + Surname;
        String user1 = Surname + " " + name;

        peoplePage = new PeoplePage(driver);
        peoplePage.openUser(user);
        editUserPage = new EditUserPage(driver);
        editUserPage.changeName(user1);

    }


}