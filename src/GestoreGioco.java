public class GestoreGioco {
    private final int numeroVincente;
    private String vincitore;

    public GestoreGioco() {
        numeroVincente = 19;
        vincitore = null;

    }

    public GestoreGioco(GestoreGioco gg){
        numeroVincente = gg.numeroVincente;
        vincitore = gg.vincitore;
    }


    public synchronized void verifica(int num) {
        if(vincitore != null) {
            
            System.out.println("il gioco è già stato vinto da " + vincitore);
            return;
        }
        else if (num == numeroVincente) {
            //verifica num
            System.out.println("ho vinto bella freghiii gimo ai baracconiiii");
            vincitore = Thread.currentThread().getName();

        }else
            System.out.println("ho persooooooo adesso schiavizzo i paguri");
    }
}



