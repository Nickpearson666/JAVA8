package LockRT;

/**
 * 死锁的演示， 不同的线程分别占用对方线程的资源， 不放弃， 都在等待对方释放资源
 *
 *
 */
public class ThreadTest {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();

        //通过继承实现多线程
        new Thread(){
            @Override
            public void run(){
                synchronized (str1){
                    str1.append("a");
                    str2.append(1);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (str2){
                        str1.append("b");
                        str2.append(2);
                        System.out.println(str1);
                        System.out.println(str2);
                    }
                }
            }
        }.start();
        //runnable 接口实现多线程
        new Thread(() -> {
            synchronized (str2){
                str1.append("c");
                str2.append(3);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (str1){
                    str1.append("d");
                    str2.append(4);
                    System.out.println(str1);
                    System.out.println(str2);
                }
            }
        }).start();
    }
}
