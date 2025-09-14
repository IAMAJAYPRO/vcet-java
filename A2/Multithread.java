// Q2: Printing & Scanning with Multithreading

class PrintTask extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) System.out.println("Printing doc " + i);
    }
}
class ScanTask extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) System.out.println("Scanning doc " + i);
    }
}

public class Multithread {
    public static void main(String[] args) {
        Thread t1 = new PrintTask();
        Thread t2 = new ScanTask();
        t1.start(); // runs independently
        t2.start(); // runs independently
    }
}
