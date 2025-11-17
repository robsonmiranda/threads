package br.com.alura.status;

public class Principal01 {
    public static void main(String[] args) throws InterruptedException {
        RealizaTarefa realizaTarefa = new RealizaTarefa();
        Thread thread = new Thread(realizaTarefa);
        System.out.println("Status: " + thread.isAlive());
        thread.start();
        System.out.println("Status: " + thread.isAlive());
    }
}
