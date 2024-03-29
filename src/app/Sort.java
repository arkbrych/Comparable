package app;

import java.util.Comparator;

public class Sort implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return -1;
        }
        if (o1.equals(o2)) {
            return 0;
        }
        return 1;
    }
}
