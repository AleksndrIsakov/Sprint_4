import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private final Account account;
    private final boolean expected;

    public AccountTest(String name, boolean expected) {
        account = new Account(name);
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] setTestName() {
        return new Object[][]{
                {"Maxim Maximiliyanov", true},
                {"I M", true},
                {"Aleksy Maximiliyanov", false},
                {"IM", false},
                {"Иван  Иванов", false},
                {" IvanovMaxim", false},
                {"IvanovMaxim ", false},
        };
    }

    @Test
    public void checkRulesForPrintName() {
        assertEquals("Отличается ожидаемый и полученный результат", account.checkNameToEmboss(), expected);
    }
}
