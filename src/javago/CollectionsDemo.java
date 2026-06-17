package javago;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(8);
        list.add(3);
        list.add(6);
        System.out.println("排序前list"+ list);
        Collections.sort(list); //升序排序
        System.out.println("排序后list" + list);
    }
}
