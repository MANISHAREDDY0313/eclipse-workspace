package java8.Features.Theards.Sleep;
/*- How to make the thread to sleep:
Thread.sleep(5000); // sleeps for 5 seconds*/




public class MyThread5 extends Thread {

public void run() {
System.out.println("Thread stated:" + Thread.currentThread().getId() + " is running");
try {
Thread.sleep(5000);// wait for 5 seconds
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("Thread ended" + Thread.currentThread().getId() + " ended");
}

}


