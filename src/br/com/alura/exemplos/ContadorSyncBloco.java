package br.com.alura.exemplos;

public class ContadorSyncBloco {

    private int contagem = 0;

    public void incrementar() {
        synchronized (this) { // Qualquer objeto pode ser sincronizado. Neste caso o próprio ContadorSyncBloco foi sincronizado
            contagem++;
        }
        System.out.println("Incrementado com sucesso");
    }
}
