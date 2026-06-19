package javago;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Queue<Integer> queue =new  LinkedList<>();
        int maxSize = 3;
        //生产者（只生产20个）
        Thread producer = new Thread(() -> {
            int value = 0;
            while (value <=  20) {
                synchronized (queue) {
                    while (queue.size() == maxSize) {
                        try{
                            queue.wait(); //队列满了，释放锁，等待消费者拿取
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("生产:"+value);
                    queue.offer(value++); //value自加，可以认为是生产到第几个
                    queue.notifyAll();//通知消费者
                }
            }
        });
        Thread consumer = new Thread(() -> {
            while (true) {
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        try {
                            queue.wait();   // 队列空了，等待
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("消费: " + queue.poll());//出队
                    queue.notifyAll();      // 通知生产者
                }
            }
        });
        producer.start();
        consumer.start();
    }
}
