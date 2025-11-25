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
            System.out.println("il gioco è già stato vinto da " + vincitore + " sara per la prossima volta");
            return;
        }
        
        if (num == numeroVincente) {
            vincitore = Thread.currentThread().getName();
            System.out.println("ho vinto bella freghiii gimo ai baracconiiii");
        } else {
            System.out.println("ho persooooooo adesso schiavizzo i paguri");
        }
      
    }
}



