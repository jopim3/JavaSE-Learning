package javago;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>() ;
        //增
        list.add("苏轼");
        list.add("李白");
        list.add("杜甫");
        //查
        System.out.println("第1个是："+list.get(0));
        //改
        list.set(0,"张孝祥");
        //删
        list.remove("李白");
        //遍历
        for(String s:list) {
            System.out.println(s);
        }
        //长度
        System.out.println(list.size());
    }


}
