package br.com.alura.exemplos;

public class Main03 {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
            System.out.println("Valor: " + i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
