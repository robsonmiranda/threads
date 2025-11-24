package br.com.alura;

import java.math.BigDecimal;

public class AppBanco {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");
        Conta conta = new Conta(cliente, new BigDecimal(150));
        OperacaoSaque operacao = new OperacaoSaque(conta, new BigDecimal(150));
        Thread saqueJoao = Thread.startVirtualThread(operacao);
        Thread saqueMaria = Thread.startVirtualThread(operacao);
        System.out.println(Thread.currentThread().getName());
        // A thread onde o método join() foi chamado irá aguardar a finalização da thread que chamou o método.
        try {
            saqueJoao.join();
            saqueMaria.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
