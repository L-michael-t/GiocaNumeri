import java.util.Scanner;

public class Giocatore extends Thread {
    int punteggio;
    String nome;
    GestoreGioco gg;
    int id;

@Override
public String toString(){    
    return nome;
}


    public Giocatore(String nome){
        this.nome = nome;
        punteggio = 0;
    }
    public Giocatore(String nome, GestoreGioco gestore) {

        this.nome = nome;
        gg = gestore;
    }

    public void comunica() {
        System.out.printf("Sono il giocatore %s !!!\n", nome);
    }


    private void gioca() {
        System.out.println("inserisci un numero: ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        //visualizzare il numero scelto
        System.out.println("Ho scelto il numero " + num);



       gg.verifica(num);
    }

    @Override
    public void run() {
        super.run();
        this.comunica();
        super.run();
        this.gioca();

        }
    }
