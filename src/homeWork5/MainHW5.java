package homeWork5;

import java.util.Arrays;

public class MainHW5{
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    static float[] arr1 = new float[h];
    static float[] arr2 = new float[h];

    public static void main(String[] args) {
        method1(arr);
        method2(arr);
    }

    private static void method1(float[] arr) {
        Arrays.fill(arr, 1);
        long start = System.currentTimeMillis();
        System.out.println("Время начала выполнения метода 1: " + start);
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long finish = System.currentTimeMillis();
        System.out.println("Время завершения выполнения метода 1: " + finish);
        System.out.println("Итоговое время выполнения метода 1: " + (finish - start) + " милисекунд\n");
    }

    private static void method2(float[] arr){
        Thread t1 = new Thread(new MyRunnable("t1"));
        Arrays.fill(arr, 1);
        long start = System.currentTimeMillis();
        System.out.println("Время начала выполнения метода 2: " + start);
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, 5000000, arr2, 0, h);
        t1.start();
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, 5000000, h);
        long finish = System.currentTimeMillis();
        System.out.println("Время завершения выполнения метода 2: " + finish);
        System.out.println("Итоговое время выполнения метода 2: " + (finish - start) + " милисекунд");
    }
}