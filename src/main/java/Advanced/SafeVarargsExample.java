package Advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SafeVarargsExample {
    public static void main(String[] args) {


        Object[] strs = pair("a");
        System.out.println(Arrays.toString(strs));
        System.out.println(strs.getClass());

        Integer[] pair = pair(1);
        System.out.println(Arrays.toString(pair));
        System.out.println(pair.getClass());
    }

    private static <T> T[] pair(T t) {
        return arrayOf(t, t);
    }

    // THIS IS NOT SAFE CODE!

    private static <T> T[] arrayOf(T ... values) {
        return values;
    }









    @SafeVarargs
    private static <T> List<T> combine(List<? extends T> ... lists) {
        List<T> combined = new ArrayList<>();
        for (List<? extends T> list : lists) {
            combined.addAll(list);
        }
        return combined;
    }
}
