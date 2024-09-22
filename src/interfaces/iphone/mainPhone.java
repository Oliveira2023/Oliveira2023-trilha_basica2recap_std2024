package interfaces.iphone;

public class mainPhone {
    public static void main(String[] args) {
        System.out.println("Hello from mainPhone");

        IPhone iphone10 = new IPhone();
        iphone10.ligar();
        iphone10.abrirPagina("www.google.com");
    }
}
