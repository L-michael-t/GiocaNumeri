public class GestoreGioco {
    private final int numeroVincente;


    public GestoreGioco() {
        numeroVincente = 19;
    }

    public GestoreGioco(GestoreGioco gg){
        numeroVincente = gg.numeroVincente;
    }


    public void verifica(int num) {
        if (num == numeroVincente) {
            //verifica num
            System.out.println("ho vinto bella freghiii gimo ai baracconiiii");
        }else
            System.out.println("ho persooooooo adesso schiavizzo i paguri");
    }
}



