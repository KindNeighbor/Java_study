package thread.start;

public class DaemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(false); // true 면 main 스레드를 데몬 스레드로 설정하면서 main 함수가 끝나면 자바 프로그램도 종료한다.
        daemonThread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

    static class DaemonThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run() start");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": run() end");
        }
    }
}