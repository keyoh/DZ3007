package ru.sbt;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtils {

    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {

        destination.addAll(source);

    }



    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }



    public static <T> int indexOf(List<? extends T> source, T o) {
        return source.indexOf(o);
    }



    public static List limit(List source, int size) {
        if (size < source.size()) {
            return source.subList(0, size);
        } else {
            return source;
        }
    }



    public static void add(List source, Object o) {
        source.add(o);
    }



    public static void removeAll(List removeFrom, List c2) {
        removeFrom.removeAll(c2);
    }



    public static <T> boolean containsAll(List<T> c1, List<T> c2) {
        for (T o : c2) {
            if (c1.contains(o)) {
                return true;
            }
        }
        return false;
    }



    public static boolean containsAny(List c1, List c2) {

    }



    public static List range(List list, Object min, Object max) {

    }
}
