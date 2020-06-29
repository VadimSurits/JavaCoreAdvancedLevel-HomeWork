package homeWork5;

import static homeWork5.MainHW5.*;

public class MyRunnable implements Runnable{
    private String name;

    public String getName() {
        return name;
    }

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (float)(arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}