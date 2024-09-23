package collections_api2023.list.ordenacao;

public class MainOrdenacao {

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.addPessoa("Maria", 25, 1.70);
        ordenacaoPessoa.addPessoa("João", 30, 1.80);
        ordenacaoPessoa.addPessoa("Ana", 20, 1.60);
        ordenacaoPessoa.addPessoa("Pedro", 35, 1.75);
        ordenacaoPessoa.addPessoa("Carla", 40, 1.65);

        System.out.println("Lista de pessoas:");
        System.out.println(ordenacaoPessoa.getPessoaList());

        System.out.println("\nOrdenado por idade:");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        System.out.println("\nOrdenado por altura:");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
