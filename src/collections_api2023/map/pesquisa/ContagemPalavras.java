package collections_api2023.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra) {
        if(contagemPalavrasMap.containsKey(palavra)){
            contagemPalavrasMap.put(palavra, contagemPalavrasMap.get(palavra) + 1);
        } else {
            contagemPalavrasMap.put(palavra, 1);
        }
    }

    public void removerPalavra(String palavra) {
        if(contagemPalavrasMap.containsKey(palavra)){
            contagemPalavrasMap.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavrasMap);
    }

    public String encontrarPalavraMaisFrequente() {
        if(contagemPalavrasMap.isEmpty()){
            return null;
        }
        String palavraMaisFrequente = null;
        int frequencia = 0;
        for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
            if(entry.getValue() > frequencia){
                frequencia = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        System.out.println("\nPalavra mais Frequente: " + palavraMaisFrequente);
        System.out.println("Frequência: " + frequencia);

        for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
            if(palavraMaisFrequente == entry.getKey()) {
                continue;
            }else {
                if (entry.getValue() == frequencia) {
                    System.out.println("\nExiste outra palavra com a mesma frequência:");
                    System.out.println(entry.getKey());
                }
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Java");
        contagemPalavras.adicionarPalavra("Python");
        contagemPalavras.adicionarPalavra("Java");
        contagemPalavras.adicionarPalavra("JavaScript");
        contagemPalavras.adicionarPalavra("Python");
        contagemPalavras.adicionarPalavra("C");
        contagemPalavras.adicionarPalavra("Python");
        contagemPalavras.adicionarPalavra("Java");
        contagemPalavras.adicionarPalavra("C");
        contagemPalavras.adicionarPalavra("Java");
        contagemPalavras.adicionarPalavra("Python");
        contagemPalavras.adicionarPalavra("Java");
        contagemPalavras.adicionarPalavra("React");
        contagemPalavras.adicionarPalavra("JavaScript");
        contagemPalavras.adicionarPalavra("Python");
        contagemPalavras.adicionarPalavra("React");
        contagemPalavras.adicionarPalavra("Python");
        contagemPalavras.adicionarPalavra("Java");
        contagemPalavras.adicionarPalavra("Go");
        contagemPalavras.adicionarPalavra("Java");
        contagemPalavras.adicionarPalavra("Go");
        contagemPalavras.adicionarPalavra("Java");
        contagemPalavras.adicionarPalavra("Python");
        contagemPalavras.adicionarPalavra("JavaScript");
        contagemPalavras.adicionarPalavra("Python");

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.encontrarPalavraMaisFrequente();
    }
}
