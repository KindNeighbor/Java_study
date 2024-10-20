package thread.start;

public class HelloRunnableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloRunnable runnable = new HelloRunnable();
        Thread thread = new Thread(runnable); // Runnable 구현 한 경우에는, 이렇게 Thread 객체 생성시 값을 넣어줘야 함.
        thread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
