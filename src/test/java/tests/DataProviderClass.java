package tests;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider(name = "data-provider")
    public static Object[][] dataProviderMethod() {
        Object[][] data = new Object[2][4];
        data[0][0] = "Andjelka";
        data[0][1] = "Brkic";
        data[0][2] = "Intermediate";
        data[0][3] = "Java, C#";
        data[1][0] = "Jonh";
        data[1][1] = "Doe";
        data[1][2] = "Senior";
        data[1][3] = "Java, C#, Git";

        return data;
    }
}

