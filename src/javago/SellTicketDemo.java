package javago;

public class SellTicketDemo {
    public static void main(String[] args) {
        //票数固定，三个窗口（线程）共享
    Ticket ticket  = new Ticket();
    Thread t1 =new  Thread(ticket,"窗口一");
    Thread t2 =new  Thread(ticket,"窗口二");
    Thread t3 =new  Thread(ticket,"窗口三");

    t1.start();
    t2.start();
    t3.start();

    }
}
//Ticket类，内部实现Rannable
class Ticket implements Runnable {
        private int tickets = 10;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (tickets <=0) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "卖出一张，剩余：" + --tickets);
            }
        }

    }
}
