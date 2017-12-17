package helpers;
import org.testng.annotations.DataProvider;
public class DataProviderTest {

    @DataProvider(name = "key")
    public static Object[] key() {

        return new Object[]{"Врач", "учитель", "Энолог"};

    }
}
