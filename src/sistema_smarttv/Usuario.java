package sistema_smarttv;

public class Usuario {
    /**
     * classe que manipula o comportamento do usuário ao utilizar a tv
     * @param args
     */
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        smartTv.diminuirVolume();
        smartTv.ligar();
        System.out.println(smartTv.ligada);
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        smartTv.mudarCanal(13);
    }
}
