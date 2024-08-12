package desafio_controle_fluxo;

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("Parametros invalidos, parametro 2 deve ser maior que parametro 1");
    }
}
