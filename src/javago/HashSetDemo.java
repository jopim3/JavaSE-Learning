package javago;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java") ;
        set.add("Python");
        set.add("java");
        System.out.println(set);
    }
}
