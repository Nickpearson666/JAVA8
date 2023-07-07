package LockRT;

class A {
    //synchronized 锁的是a对象
    public synchronized void foo(B b){
        System.out.println("curr Thread: "+ Thread.currentThread().getName() + " A :: foo()");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("curr Thread: "+ Thread.currentThread().getName() + "try to call b last()");
        b.last();
    }

    public synchronized void last(){
        System.out.println("curr Thread: "+ Thread.currentThread().getName() + "executed b last()");
    }
}

class B {
    public synchronized void bar(A a){
        System.out.println("curr Thread: "+ Thread.currentThread().getName() + " B :: bar()");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("curr Thread: "+ Thread.currentThread().getName() + "try to call a last()");
        a.last();
    }

    public synchronized void last(){
        System.out.println("curr Thread: "+ Thread.currentThread().getName() + "executed b last()");
    }
}
public class DeadLock implements Runnable{

    A a = new A();
    B b = new B();
    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        new Thread(deadLock).start();
        deadLock.init();
    }

    public void init(){
        Thread.currentThread().setName("Main Thread");
        a.foo(b);
        System.out.println("Main Thread Completed");
    }

    @Override
    public void run() {
        Thread.currentThread().setName("Second Thread");
        b.bar(a);
        System.out.println("Second Thread Completed");
    }
}
