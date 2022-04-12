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

        int spaces = (int) name.chars().filter(c -> c == ' ').count();
        if (name.length() >= 3 && name.length() <= 19) {
            if (spaces == 1 && !(name.startsWith(" ") || name.endsWith(" ")))
                    return true;
        }

        return false;
    }

    public String getName() {
        return name;
    }
}
