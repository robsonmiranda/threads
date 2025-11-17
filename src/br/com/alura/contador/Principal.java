package br.com.alura.contador;

public class Principal {
    public static void main(String[] args) {
        Impressora impressora01 = new Impressora(1);
        Impressora impressora02 = new Impressora(2);
        Thread thread01 = new Thread(impressora01);
        Thread thread02 = new Thread(impressora02);
        /*
         setPriority() determina a prioridade de execução da Thread.
         As prioridades podem variar de 1 a 10. Sendo 10 a maior prioridade e 1 a menor prioridade.
         */
        thread01.setPriority(10);
        thread02.setPriority(5);
        thread01.start();
        thread02.start();
    }
}
