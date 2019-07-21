package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;

public class CreateUser extends TestBase {

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
    public void creationPeople(String name, String Surname, String seniority, String technologies) throws InterruptedException {

        String user = name + " " + Surname;


        playgroundPage.openPeople();
        peoplePage = new PeoplePage(driver);
        peoplePage.creationPeople();
        createUserPage = new CreateUserPage(driver);
        createUserPage.CreationUser(user, seniority, technologies);

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
