package chapter11;

import java.util.concurrent.ConcurrentHashMap;

public class Starter {
    private static boolean stopped;
    private static int zaehler = 0;

    public static void main(String args[]) throws Exception {
        Runnable r = () -> {
            // endlos den Zähler ausgeben und hochzählen
            Thread thread = Thread.currentThread();
            System.out.println("Current Thread: " + thread.getId() + " " + thread.getName());
            
            while (zaehler < 20) {
//                if(stopped) {
//                    break;
//                }
                
                System.out.println(thread.getId() + ": " + zaehler++ + "(" + thread.getName() + ")");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Stoppe Thread!");
        };
        Thread t1 = new Thread(r, "T1");
        t1.setDaemon(true); // wenn true, stirbt der Thread, wenn der main-Thread zuende ist
        t1.start();
        Thread t2 = new Thread(r, "T2");
        t2.setDaemon(true);
        t2.start();
        
        // Wartet auf einen Thread
        t1.join();

        // irgendwann in der Zukunft
        //stopped = true;
    }
}
