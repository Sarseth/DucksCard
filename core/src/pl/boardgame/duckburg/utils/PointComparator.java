package pl.boardgame.duckburg.utils;

import java.awt.Point;
import java.util.Comparator;

public class PointComparator {

    public static Comparator<Point> pointComparator() {
        return (o1, o2) -> {
            if(o1.equals(o2)) {
                return 0;
            }
            if(o1.x == o2.x) {
                return Integer.valueOf(o1.y).compareTo(o2.y);
            }
            return Integer.valueOf(o1.x).compareTo(o2.x);
        };
    }

}
