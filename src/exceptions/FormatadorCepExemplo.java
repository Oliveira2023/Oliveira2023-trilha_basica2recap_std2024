package exceptions;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepformatado = formatarCep("2376506");
            System.out.println(cepformatado);
        } catch (CepInvalidException e) {
            System.out.println(e.getMessage());
        }
    }
    static String formatarCep(String cep) throws CepInvalidException {
        if (cep == null || cep.isEmpty() || cep.length() != 8) {
            throw new CepInvalidException("valor do cep incorreto");
        }
        return "23.765-064";
    }
}
