package br.com.alura.exemplos;

public class Main01 {

    public static void main(String[] args) {
        Contador01 contador = new Contador01();
        Thread thread = new Thread(contador);
        thread.start();
    }
}
