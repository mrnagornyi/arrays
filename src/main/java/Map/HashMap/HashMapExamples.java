package Map.HashMap;

import java.util.HashMap;

public class HashMapExamples {

    public static void main(String[] args) {

        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(1, "Text1");
        passportsAndNames.put(2, "Text2");
        passportsAndNames.put(3, "Text3");
        System.out.println("Just first HashMap : "+passportsAndNames);

        //override one value by KEY
        passportsAndNames.put(3, "Text3A"); //  Override  value
        System.out.println("HashMap after ovverided changes : " + passportsAndNames);

        //GET value BY ID
        String someName = passportsAndNames.get(2);
        System.out.println(someName);

        //REMOVE ELEMENT BY KEY
        passportsAndNames.remove(2);
        System.out.println("HashMap after removing : " + passportsAndNames);

    }

}
