package chapter11;

public class MyThread extends Thread {
    private int zaehler = 0;
    
    public void run() {
      // das, was der Thread tut...
      System.out.println(zaehler++);
    }
    
    public static void main(String args[]) {
      Thread t = new MyThread();
      // Thread starten, run wird ausgeführt
      t.start();
    }
  }