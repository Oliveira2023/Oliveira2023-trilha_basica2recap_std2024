package collections_api2023.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String significado) {
        dicionarioMap.put(palavra, significado);
    }

    public void removerPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        if(dicionarioMap.isEmpty()){
            return null;
        }
        return dicionarioMap.get(palavra);
    }
}
