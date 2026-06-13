package javago;

public class Main {
    public static  void  main(String[] args) {
        Integer i = 6 ; //装箱
        int j = i; //拆箱
        System.out.println(j);

        Integer m = Integer.parseInt("66");
        System.out.println(m+1);
    }
}
