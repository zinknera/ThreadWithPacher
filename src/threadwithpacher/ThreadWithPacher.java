/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadwithpacher;

/**
 *
 * @author alex
 */
public class ThreadWithPacher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadWithPacher obj = new ThreadWithPacher();
        obj.myFirstMethode();
    }

    private void myFirstMethode() {
        Producer prod = new Producer();
        Thread p1 = new Thread(prod);
        p1.start();
    }
    
}
