package sistema_smarttv;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        if(ligada){
            volume++;
            System.out.println("Volume: " + volume );
        }else {
            System.out.println("A TV está desligada.");
        }
    }
    public void diminuirVolume(){
        if(ligada){
            volume--;
            System.out.println("Volume: " + volume );
        }else {
            System.out.println("A TV está desligada.");
        }
    }
    public void aumentarCanal(){
        if(ligada){
            canal++;
            System.out.println("Canal: " + canal );
        }else {
            System.out.println("A TV está desligada.");
        }
    }
    public void diminuirCanal(){
        if(ligada){
            canal--;
            System.out.println("Canal: " + canal );
        }else{
            System.out.println("A TV está desligada.");
        }
    }
    public void mudarCanal(int novoCanal) {
        if(ligada){
            this.canal = novoCanal;
            System.out.println("Canal: " + canal );
        }
    }

}
