import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@Epic("Account.class")
@RunWith(Parameterized.class)
public class AccountTest {

    private final Account account;
    private final boolean expected;

    public AccountTest(String name, boolean expected) {
        this.account = new Account(name);
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
    @DisplayName("Проверка метода checkNameToEmboss")
    public void checkRulesForPrintName() {
        Allure.addAttachment("Проверяем строчку для печати (exp.res: " + expected + ")", account.getName());
        assertEquals(account.checkNameToEmboss(), expected);
    }
}
