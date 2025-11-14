package br.com.alura;

import java.math.BigDecimal;

public class AppBanco {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");
        Conta conta = new Conta(cliente, new BigDecimal(150));
        OperacaoSaque operacao = new OperacaoSaque(conta, new BigDecimal(150));
        // Saque João
        operacao.executa();
        // Saque Maria
        operacao.executa();
    }
}
