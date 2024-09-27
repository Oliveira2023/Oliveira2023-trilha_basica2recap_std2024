package collections_api2023.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasunicas {

    Set<String> palavrasUnicas;

    public ConjuntoPalavrasunicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavrasUnicas.add(palavra);
    }
    public void removerPalavra(String palavra) {
        if (!this.palavrasUnicas.isEmpty()) {
            if (palavrasUnicas.contains(palavra)) {
                this.palavrasUnicas.remove(palavra);
            }else {
                System.out.println("Palavra não encontrada");
            }
        }else {
            System.out.println("Conjunto vazio");
        }
        this.palavrasUnicas.remove(palavra);
    }
    public int contarPalavras() {
        return this.palavrasUnicas.size();
    }
    public void exibirPalavras() {
        for (String palavra : this.palavrasUnicas) {
            System.out.println(palavra);
        }
    }
    public boolean verificarPalavra(String palavra) {
        return this.palavrasUnicas.contains(palavra);
    }


}
