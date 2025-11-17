package br.com.alura.reservaLivro;

import java.time.LocalDate;

public class Livro{
    private String nome;
    private String autor;
    private LocalDate dataLancamento;
    private boolean reservado;

    public Livro(String nome, String autor, LocalDate dataLancamento) {
        this.nome = nome;
        this.autor = autor;
        this.dataLancamento = dataLancamento;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public boolean getReservado() {
        return reservado;
    }

    public synchronized void reservar() {
        System.out.println("Iniciando reserva");
        if (!this.getReservado()) {
            this.reservado = true;
            System.out.println("Reserva efetuada com sucesso! Aproveite a leitura, " + Thread.currentThread().getName());
        } else {
            System.out.println("O livro já foi reservado, " + Thread.currentThread().getName());
        }
    }
}