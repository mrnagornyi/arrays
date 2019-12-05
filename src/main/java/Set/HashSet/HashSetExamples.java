package Set.HashSet;

import java.util.*;

public class HashSetExamples {

    private static String parameter1 = new String("QWERTY");


    public static void main(String[] args)
    {

    Set<String> set = new HashSet<String>();
    set.add("Mama");
    set.add("Mila");
    set.add("Ramu");
    set.add(parameter1);



//        set.addAll(parameter2);

    //Receiving of the iterator for array
    Iterator<String> iterator = set.iterator();

    while (iterator.hasNext())     //check presence of the next elements
    {
        //receiving of current element and moving to the next one
        String text = iterator.next();

        System.out.println(text);
    }

    }
}
