package javago;

//自定义异常
 class AgeOutofRangeException extends Exception {
     public AgeOutofRangeException( String message) {
         super(message);
     }
}
public class ExceptionDemo {
     //声明方法抛出异常
     public static void SetAge(int age) throws AgeOutofRangeException    {
         if (age < 0 || age >150) {
             throw new AgeOutofRangeException("年龄:"+age+" 超出范围");//添加异常信息
         }
         System.out.println("年龄:"+age + " 设置成功");
     }
    //使用方法并捕获异常
     public static void main(String[] args) {
         try {
             SetAge(200);
         } catch (AgeOutofRangeException e) {
             System.out.println("捕获异常"+e.getMessage()); //获取异常对象的详细描述信息
         } finally {
             System.out.println("finally总会执行");
         }
     }

}
