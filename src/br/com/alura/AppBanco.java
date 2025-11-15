package br.com.alura;

import java.math.BigDecimal;

public class AppBanco {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");
        Conta conta = new Conta(cliente, new BigDecimal(150));
        OperacaoSaque operacao = new OperacaoSaque(conta, new BigDecimal(150));
        Thread saqueJoao = new Thread(operacao);
        Thread saqueMaria = new Thread(operacao);
        System.out.println(Thread.currentThread().getName());
        saqueJoao.start();
        saqueMaria.start();
    }
}
