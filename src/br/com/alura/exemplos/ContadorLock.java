package br.com.alura.exemplos;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ContadorLock {

    private int contagem = 0;
    private final Lock lock = new ReentrantLock();

    public void incrementar() {
        // Atenção no uso de lock's para a possibilidade de criação de situações de deadlock
        lock.lock();
        try {
            contagem++;
        } finally {
            lock.unlock();
        }
    }
}
