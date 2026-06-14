package javago;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        for (int i = 1;i<5;i++) {
            str.append(i).append(" ");
        }
        System.out.println(str);
    }
}
