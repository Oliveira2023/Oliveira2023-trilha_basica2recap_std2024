package interfaces.equipamentos.multifuncional;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.impressora.Impressora;

public class EquipMultiFuncional implements Impressora, Digitalizadora, Copiadora {
    @Override
    public void copiar() {
        System.out.println("Copiando na multifuncional");
    }

    @Override
    public void Digitalizar() {
        System.out.println("Multifuncional Digitalizando");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo na multifuncional");
    }
}
