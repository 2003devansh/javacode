package randomjavaprograme;

import java.util.ArrayList;
import java.util.Collections;

public class swap {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        Collections.swap(list,1,3);
        System.out.println(list);
        
    }
}
