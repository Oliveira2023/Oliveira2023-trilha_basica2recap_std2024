package collections_api2023.list.ordenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    public void addPessoa(String nome, int idade, double altura) {
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        pessoasPorIdade.sort(Pessoa::compareTo);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        pessoasPorAltura.sort(new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }
}
