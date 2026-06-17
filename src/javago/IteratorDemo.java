package javago;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<> ();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");

       Iterator<String> it = list.iterator();
       while (it.hasNext()) {
           System.out.println(it.next());
       }
    }


}
