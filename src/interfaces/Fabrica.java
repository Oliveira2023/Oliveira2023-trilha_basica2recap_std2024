package interfaces;

import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.digitalizadora.Scanner;
import interfaces.equipamentos.impressora.Deskjet;
import interfaces.equipamentos.impressora.Impressora;
import interfaces.equipamentos.multifuncional.EquipMultiFuncional;

public class Fabrica {

    public static void main(String[] args) {
        Impressora impressora = new Deskjet();
        impressora.imprimir();
        Scanner scanner = new Scanner();
//        Poderia utilizar Digitalizadora, a interface do scanner, mas se houver um método
//        somente na classe Scanner, não poderia utilizar, como o metodo resultado testado abaixo
        scanner.Digitalizar();
        scanner.Resultado();

        EquipMultiFuncional em = new EquipMultiFuncional();
        Impressora impressoraMultif = em;
        impressoraMultif.imprimir();
        Digitalizadora scannerMultif = em;
        scannerMultif.Digitalizar();
    }
}
