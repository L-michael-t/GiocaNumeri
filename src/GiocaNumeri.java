public class GiocaNumeri {
    public static void main(String[] args) throws Exception {
        System.out.println("INIZIO!");

        GestoreGioco gestore = new GestoreGioco();

        Giocatore g1 = new Giocatore("cicalone", gestore);
        Giocatore g2 = new Giocatore("franchino", gestore);

        g1.start();
        g1.join();
        g2.start();
        g2.join();

/* 
        try {
            g1.join();
            g2.join();
        } catch (InterruptedException e) {
            System.out.println("errore");
        }
            */

        System.out.println("FINE GIOCO!");
    }
}