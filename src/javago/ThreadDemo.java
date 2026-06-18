package javago;

public class ThreadDemo {
    public static void main(String[] args) {
        //线程t1（Rannable 写法)
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =1;i <= 3;i++) {
                    System.out.println("我是一号线程："+i);
                }
            }
        });
        t1.start();
        //线程t2（lambda 写法)
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("我是二号线程：" + i);
            }
        });
        t2.start();

        //主线程
        for (int i = 1; i <= 3; i++) {
            System.out.println("我是主线程："+i);
        }
    }
}
