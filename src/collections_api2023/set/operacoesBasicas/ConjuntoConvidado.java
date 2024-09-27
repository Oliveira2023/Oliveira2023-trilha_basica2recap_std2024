package collections_api2023.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidados;

    public ConjuntoConvidado() {
        this.convidados = new HashSet<>();
    }

    public void setConvidados(String nome, int codigoConvite) {
        this.convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidados) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidados.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        for (Convidado convidado : convidados) {
            System.out.println(convidado);
        }
//        System.out.println(convidados);
    }
}
