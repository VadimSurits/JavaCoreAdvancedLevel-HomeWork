package homeWork3;

import java.util.*;

public class MainHW3 {
    public static void main(String[] args) {

                                        //*** Задание 1 ***//

        String[] colors = {"Белый", "Черный", "Красный", "Синий", "Оранжевый", "Черный", "Розовый", "Белый",
                "Коричневый", "Синий", "Розовый", "Желтый", "Белый", "Синий", "Зеленый"};
        System.out.println("Стартовый массив: " + Arrays.asList(colors));

        Set<String> colorsUnique = new HashSet<>(Arrays.asList(colors));
        System.out.println("Список уникальных слов стартового массива: " + colorsUnique);

        Map<String, Integer> colorsRepeat = new HashMap<>();
        for (String i : Arrays.asList(colors)) {
            if(colorsRepeat.containsKey(i)) {
                colorsRepeat.put(i, colorsRepeat.get(i) + 1);
            } else {
                colorsRepeat.put(i, 1);
            }
        }
        System.out.println("Количество повторений каждого слова: " + colorsRepeat + "\n");

                                        //*** Задание 2 ***//

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

        telephoneDirectory.add("Алексеев", "8-999-555-55-55");
        telephoneDirectory.add("Петров", "8-999-111-11-11");
        telephoneDirectory.add("Иванов", "8-999-222-22-22");
        telephoneDirectory.add("Попов", "8-999-888-88-88");
        telephoneDirectory.add("Алексеев", "8-999-333-33-33");
        telephoneDirectory.add("Алексеев", "8-999-444-44-44");
        telephoneDirectory.add("Попов", "8-999-999-99-99");

        telephoneDirectory.get("Алексеев");
        telephoneDirectory.get("Иванов");
        telephoneDirectory.get("Попов");
    }
}
