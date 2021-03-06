package ru.sbt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils {

    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {

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


    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }


    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    //true если первый лист содержит все элементы второго
    public static <T> boolean containsAll(List<T> c1, List<T> c2) {
        return c1.containsAll(c2);
    }

    //true если первый лист содержит хотя-бы 1 второго
    public static <T> boolean containsAny(List<T> c1, List<T> c2) {
        for (T o : c2) {
            if (c1.contains(o)) {
                return true;
            }
        }
        return false;
    }


    //Нужно создать копию листа, отсортировать его, и вернуть sublist, в котором находятся элементы в диапазоне от min до max.
    // Элементы сравнивать через Comparable.
    // Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
    public static List range(List list, Object min, Object max) {

    }

    //Нужно создать копию листа, отсортировать его, и вернуть sublist, в котором находятся элементы в диапазоне от min до max.
    // Элементы сравнивать через Comparator.
    // Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
    public static List range(List list, Object min, Object max, Comparator comparator) {

    }

}

