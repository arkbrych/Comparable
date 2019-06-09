package app;

import java.util.Arrays;
import java.util.Random;

class Logic {
    void start() {
        Random random = new Random();
        Integer[] table = new Integer[20];

        for (int i = 0; i < 20; i++) {
            table[i] = random.nextInt();
        }
        Arrays.sort(table, new Sort());
        for (int p :
                table) {
            System.out.println(p);
        }

        Arrays.sort(table, new Sort().reversed());
        for (int p :
                table) {
            System.out.println(p);
        }
    }
}