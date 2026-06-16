package javago;
//泛型类
class Box<T> {
    private T content;
    public void set(T content) {
        this.content = content;
    }
    public T get() {
        return content;
    }
}

public class GenericDemo {
    //泛型方法
     public static <E extends Number> void printNumbers(E[] arr) {
         for (E e:arr) System.out.print(e+" ");
         System.out.println();
     }

     public static void main(String[] args) {
         Box<String> box = new Box<>();
         box.set("Hello");


         Integer[] nums =  {1,2,3,4};
         printNumbers(nums);
     }
}
