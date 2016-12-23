package com.javarush.my1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        Collection<Integer> l = new ArrayList<Integer>();

        for (int i = 0; i < 10; ++i) {
            l.add(new Integer(4));
            l.add(new Integer(5));
            l.add(new Integer(6));
        }

//        for (Integer i : l)
//            System.out.println(i);

        for (Integer i : l) {
            if (i.intValue() == 5) {
                l.remove(i);
            }
        }

        System.out.println(l);

        List<String> list = new ArrayList<>();

// This is a clever way to create the iterator and call iterator.hasNext() like
// you would do in a while-loop. It would be the same as doing:
//     Iterator<String> iterator = list.iterator();
//     while (iterator.hasNext()) {
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
            String string = iterator.next();
            if (string.isEmpty()) {
                // Remove the current element from the iterator and the list.
                iterator.remove();
            }
        }
    }
}
