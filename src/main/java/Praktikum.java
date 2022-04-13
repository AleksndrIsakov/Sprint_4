import java.awt.image.BandCombineOp;

public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */

        String nameToPrint = "Maxim Ivanov";
        Account account = new Account(nameToPrint);
        if (account.checkNameToEmboss())
            System.out.printf("Имя <%s> можно печатать на карте!", nameToPrint);
        else System.out.println("Имя не подходит для печати!");
    }

}