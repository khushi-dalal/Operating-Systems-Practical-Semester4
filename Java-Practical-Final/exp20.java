// Write a Java program that demonstrates multithreading by creating two threads: "ThreadA" and "ThreadB". Instruct students to implement the program to perform the following tasks:
// ThreadA should display the numbers from 1 to 5.
// ThreadB should display the numbers from 6 to 10.
// Ensure that both threads run concurrently and display their respective numbers without interleaving or overlapping.

public class exp20 {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();
    }

    private static class ThreadA extends Thread {
        public void run() {
            synchronized (System.out) {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("ThreadA: " + i);
                }
            }
        }
    }

    private static class ThreadB extends Thread {
        public void run() {
            synchronized (System.out) {
                for (int i = 6; i <= 10; i++) {
                    System.out.println("ThreadB: " + i);
                }
            }
        }
    }
}
