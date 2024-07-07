public class Usuario {
    public static void main(String[] args) throws Exception {
        
        //Definindo o Ojecto:
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume ();
        smartTv.diminuirVolume ();
        smartTv.diminuirVolume ();
        smartTv.aumentarVolume ();
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        //Chamando os métodos para a SmartTV
        SmartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
    }
}
