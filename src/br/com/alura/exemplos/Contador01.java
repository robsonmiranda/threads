package br.com.alura.exemplos;

public class Contador01 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Valor: " + i);
        }
    }
}
