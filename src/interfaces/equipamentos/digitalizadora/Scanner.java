package interfaces.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora {
    @Override
    public void Digitalizar() {
        System.out.println("Digitalizando documentos");
    }
    public void Resultado(){
        System.out.println("Resultado do documento");
    }
}
