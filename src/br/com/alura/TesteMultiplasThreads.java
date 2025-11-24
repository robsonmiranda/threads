package br.com.alura;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TesteMultiplasThreads {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor(); // Cria threads virtuais, que não serão mapeadas pelo sistema operacional
        Instant inicio = Instant.now();
        try (ExecutorService e = executor) {
            for (int i = 1; i <= 10000; i++) {
                var tarefa = new ExecutaTarefa();
                e.execute(tarefa);
            }
        }
        Instant fim = Instant.now();
        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Tempo gasto: " + duracao.getSeconds());
    }
}
