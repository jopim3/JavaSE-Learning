package javago;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        //创建
        HashMap<String,Integer> map = new HashMap<>();

        //增/改 (相同key 的 push 会覆盖原来的值)
        map.put("语文",90);
        map.put("数学",88);
        map.put("语文",92);
        map.put("英语",80);
        //查
        System.out.println("数学成绩为："+map.get("数学"));
        //删
        map.remove("英语");
        //遍历
        for (String key : map.keySet()) {
            System.out.println(key + ": "  +map.get(key));
        }
        //长度
        System.out.println("科目数：" + map.size());
    }
}
