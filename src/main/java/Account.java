import static java.util.Objects.isNull;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.

             Требования:
                в строке не меньше 3 и не больше 19 символов,
                в строке есть только один пробел,
                пробел стоит не в начале и не в конце строки.
         */

        // Замечание: Добавить проверку на null
        if (isNull(name)) return false;

        // Замечание: Заменить на регулярные выражения
        if (name.matches("^(?=.{3,19}$)(\\S+ \\S+)$")) return true;

        return false;
    }

    public String getName() {
        if (isNull(name)) return "null";
        return name;
    }
}
