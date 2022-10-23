package Compatabillity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RawTypes {
    public static void main(String[] args) {
        List<Object> values = new ArrayList();
        values.add("abc");
        values.add("bef");
        values.add("dfg");

        List<Integer> integers = new ArrayList<>();
integers.add(1);
integers.add(2);

legacyMethod(integers);


        Iterator iterator = values.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }


    }
    public static void legacyMethod(List list){

    }
}
