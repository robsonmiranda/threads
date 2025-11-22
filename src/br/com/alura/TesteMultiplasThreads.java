package br.com.alura;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TesteMultiplasThreads {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10000); // Cria um pool com 10000 threads
        Instant inicio = Instant.now();
        for (int i = 1; i <= 10000; i++) {
            var tarefa = new ExecutaTarefa();
            executor.execute(tarefa);
        }
        executor.shutdown();
        // Opcional, aguarda as tarefas terminarem
        // Garante que o tempo calculado só seja medido após todas as tarefas terminarem.
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        Instant fim = Instant.now();
        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Tempo gasto: " + duracao.getSeconds());
    }
}
