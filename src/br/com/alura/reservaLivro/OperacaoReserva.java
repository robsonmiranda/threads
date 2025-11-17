package br.com.alura.reservaLivro;

public class OperacaoReserva implements Runnable{

    private Livro livro;

    public OperacaoReserva(Livro livro) {
        this.livro = livro;
    }

    @Override
    public void run() {
        livro.reservar();
    }
}