// Write a Java program that demonstrates multithreading by creating two threads: "ThreadA" and "ThreadB". Instruct students to implement the program to perform the following tasks:
// ThreadA should display the message "Hello from ThreadA" five times.
// ThreadB should display the message "Hello from ThreadB" five times.
// Ensure that both threads run concurrently and display their respective messages in an interleaved manner without any delay between the messages.
public class exp19{
    public static void main(String Args[]){
        Thread t1 = new Thread(new t1());
        Thread t2 = new Thread(new t2());

        t1.start();
        t2.start();
    }
}
    class t1 implements Runnable{
        @Override
        public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello from ThreadA");
        }   
        }    
    }
    class t2 implements Runnable{
        @Override
        public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello from ThreadB");
        }    
        }   
    }