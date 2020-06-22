package homeWork3;

import java.util.*;

public class TelephoneDirectory {

    private Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        ArrayList phoneNumberList = new ArrayList();
        if (phoneBook.containsKey(surname)) {
            phoneNumberList = phoneBook.get(surname);
            phoneNumberList.add(phoneNumber);
            System.out.println("Для абонента (" + surname + ") добавлен дополнительный номер: " + phoneNumber);
        } else {
            phoneNumberList.add(phoneNumber);
            phoneBook.put(surname, phoneNumberList);
            System.out.println("В справочник внесен новый абонент. " + surname + ": " + phoneNumber);
        }
    }

    public void get(String surname){
        System.out.println("В справочнике абоненту " + surname + " принадлежат следующие номера: " +
                phoneBook.get(surname));
    }
}




