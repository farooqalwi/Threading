/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading;

/**
 *
 * @author ALWI
 */
public class Threading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        thread1 obj1 = new thread1();
        thread2 obj2 = new thread2();
        obj1.start();
        Thread obj = new Thread(obj2);
        obj.start();
    }
}

class thread1 extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("^");
            }
            System.out.println();
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e.getCause());
            }
        }
    }
}

class thread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e.getCause());
            }
        }
    }
}
