package homeWork2;

public class MainHW2 {
    public static void main(String[] args) throws MySizeArrayException, MyArrayDataException {
        String[][] arrayNums = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongArrayNums = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "asd", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongArrayNums2 = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        System.out.println("Массив arrayNums:");
        changeToIntAndSum(arrayNums);

        System.out.println("Массив wrongArrayNums:");
        try {
            changeToIntAndSum(wrongArrayNums);
        } catch (MyArrayDataException e) {
            System.out.println("MyArrayDataException! " + e.getMessage());
        }

        System.out.println("Массив wrongArrayNums2:");
        try {
            changeToIntAndSum(wrongArrayNums2);
        } catch (MySizeArrayException e) {
            System.out.println("MySizeArrayException! " + e.getMessage());
        }

    }

    private static void changeToIntAndSum (String[][]array) throws MySizeArrayException, MyArrayDataException {
        int arrayNumsSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length != 4 && array[i].length != 4) {
                    throw new MySizeArrayException("Размер массива отличается от правильного размера:[4][4]. Текущий " +
                            "размер массива:[" + array.length + "][" + array[i].length + "].");
                }
                try {
                    Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В строке " + i + ", в столбце " + j + " находится не число.\n");
                }
                arrayNumsSum += Integer.parseInt(array[i][j]);
            }
        }
        System.out.println("Сумма всех чисел массива = " + arrayNumsSum + "\n");
    }
}


