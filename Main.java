import java.util.Scanner;
import java.util.Random;

public class Main {

    public static boolean combattimento(Personaggio utente, Nemico nemico){

        Random rand = new Random();

        while (utente.getVita() > 0 && nemico.getVita() > 0) {
            // Attacco del personaggio
            int attaccoPersonaggio = rand.nextInt(utente.getAttacco()) + 1;
            int difesaNemico = rand.nextInt(nemico.getDifesa()) + 1;
            int dannoInflitto = Math.max(attaccoPersonaggio - difesaNemico, 0);

            System.out.print("\n");
            
            if (dannoInflitto > 0) {
                nemico.setVita(-dannoInflitto);
                System.out.println("Il personaggio colpisce il nemico infliggendo " + dannoInflitto + " danni.");
            } else {
                System.out.println("Il personaggio ha mancato il nemico.");
            }
            
            // Controlla se il nemico è ancora vivo dopo l'attacco
            if (nemico.getVita() <= 0) {
                System.out.println("\nIl nemico è stato sconfitto!");
                return true; // Esci dal ciclo se il nemico è morto
            }

            System.out.print("\n");
            
            // Attacco del nemico
            int attaccoNemico = rand.nextInt(nemico.getAttacco()) + 1;
            int difesaPersonaggio = rand.nextInt(utente.getDifesa()) + 1;
            int dannoSubito = Math.max(attaccoNemico - difesaPersonaggio, 0);
            
            if (dannoSubito > 0) {
                utente.setVita(-dannoSubito);
                System.out.println("Il nemico colpisce il personaggio infliggendo " + dannoSubito + " danni.");
            } else {
                System.out.println("Il nemico ha mancato il personaggio.");
            }
            
            // Controlla se il personaggio è ancora vivo dopo l'attacco del nemico
            if (utente.getVita() <= 0) {
                System.out.println("\nIl personaggio è stato sconfitto!");
                return false; // Esci dal ciclo se il personaggio è morto
            }

        }

        return false;

    }
    public static void main(String[] args) {

        Scanner myObjN = new Scanner(System.in);
        Scanner myObjS = new Scanner(System.in);

        Random rand = new Random();

        System.out.println("Scegli il personaggio:");
        System.out.println("1. Mago");
        System.out.println("2. Ladro");
        System.out.println("3. Guerriero");

        int scelta = myObjN.nextInt();

        Personaggio utente = null;

        switch (scelta) {
            case 1:
                utente = new Mago();
                break;
            case 2:
                utente = new Ladro();
                break;
            case 3:
                utente = new Guerriero();
                break;
       
        }

        Nemico nemico1 = new Pipistrello();

        System.out.println("Sei arrivato al primo livello, lanciando il dado a 6 facce potrebbe andarti bene o male");
        System.out.println("Faccia 1: +1 vita");
        System.out.println("Faccia 2: +1 attacco");
        System.out.println("Faccia 3: +1 difesa");
        System.out.println("Faccia 4: -1 vita");
        System.out.println("Faccia 5: -1 attacco");
        System.out.println("Faccia 6: -1 difesa");
        System.out.print("Vuoi lanciare il dado? (SI - NO) ==> ");
        String op = myObjS.nextLine();
        System.out.print("\n");

        if (op.equalsIgnoreCase("si")){

            int randomNumber = rand.nextInt(6) + 1;
            switch(randomNumber){
                case 1:
                    utente.setVita(1);
                    System.out.println("Hai aumentato la vita del personaggio di 1, vita aggiornata: " + utente.getVita());
                    break;
                case 2:
                    utente.setAttacco(1);
                    System.out.println("Hai aumentato l'attacco del personaggio di 1, attacco aggiornato: " + utente.getAttacco());
                    break;
                case 3:
                    utente.setDifesa(1);
                    System.out.println("Hai aumentato la difesa del personaggio di 1, difesa aggiornata: " + utente.getDifesa());
                    break;
                case 4:
                    utente.setVita(-1);
                    System.out.println("Hai diminuito la vita del personaggio di 1, vita aggiornata: " + utente.getVita());
                    break;
                case 5:
                    utente.setAttacco(-1);
                    System.out.println("Hai diminuito l'attacco del personaggio di 1, attacco aggiornato: " + utente.getAttacco());
                    break;
                case 6:
                    utente.setDifesa(-1);
                    System.out.println("Hai diminuito la difesa del personaggio di 1, difesa aggiornata: " + utente.getDifesa());
                    break;

            }
        }

        System.out.println("\nLo stato attuale del personaggio è Vita: " + utente.getVita() + " Attacco: " + utente.getAttacco() + " Difesa: " + utente.getDifesa());

        System.out.print("\n");
        System.out.println("Il primo livello prevede il confronto con il mastodontico PIPISTRELLO della neve");
        System.out.println("Nel confronto si lui avrà un range di attacco tra 1 e 5 a seconda dell'efficacia del colpo. Se la tua difesa ");
        System.out.println("sarà più alta allora non perderai punti vità. Dopo sarai tu a colpire, seguendo lo stesso procedimento\n");

        

        if(Main.combattimento(utente, nemico1)){

            System.out.println("\nSei passato al livello 2. Ora dovrai affrontare il CANELUPO del deserto!!");
            System.out.println("Hai guadagnato 3 punti vita");
            utente.setVita(3);
            System.out.println("Vuoi rilanciare il dado?");
            op = myObjS.nextLine();
    
            if (op.equalsIgnoreCase("si")){
    
                int randomNumber = rand.nextInt(6) + 1;
                switch(randomNumber){
                    case 1:
                        utente.setVita(1);
                        System.out.println("Hai aumentato la vita del personaggio di 1, vita aggiornata: " + utente.getVita());
                        break;
                    case 2:
                        utente.setAttacco(1);
                        System.out.println("Hai aumentato l'attacco del personaggio di 1, attacco aggiornato: " + utente.getAttacco());
                        break;
                    case 3:
                        utente.setDifesa(1);
                        System.out.println("Hai aumentato la difesa del personaggio di 1, difesa aggiornata: " + utente.getDifesa());
                        break;
                    case 4:
                        utente.setVita(-1);
                        System.out.println("Hai diminuito la vita del personaggio di 1, vita aggiornata: " + utente.getVita());
                        break;
                    case 5:
                        utente.setAttacco(-1);
                        System.out.println("Hai diminuito l'attacco del personaggio di 1, attacco aggiornato: " + utente.getAttacco());
                        break;
                    case 6:
                        utente.setDifesa(-1);
                        System.out.println("Hai diminuito la difesa del personaggio di 1, difesa aggiornata: " + utente.getDifesa());
                        break;
    
                }
            }
    
            System.out.println("Lo stato attuale del personaggio è Vita: " + utente.getVita() + " Attacco: " + utente.getAttacco() + " Difesa: " + utente.getDifesa());
    
            Nemico nemico2 = new Canelupo();
    
            System.out.println("Dovrai affrontare il cane lupo che ha vita: " + nemico2.getVita() + " Attacco: " + nemico2.getAttacco() + " Difesa: " + nemico2.getDifesa());
            
            if (Main.combattimento(utente, nemico2)){

                System.out.println("\nSei passato al livello 3. Ora dovrai affrontare il CANELUPO del deserto!!");
                System.out.println("Hai guadagnato 3 punti vita");
                utente.setVita(3);
                System.out.println("Vuoi rilanciare il dado?");
                op = myObjS.nextLine();

                if (op.equalsIgnoreCase("si")){

                    int randomNumber = rand.nextInt(6) + 1;
                    switch(randomNumber){
                        case 1:
                            utente.setVita(1);
                            System.out.println("Hai aumentato la vita del personaggio di 1, vita aggiornata: " + utente.getVita());
                            break;
                        case 2:
                            utente.setAttacco(1);
                            System.out.println("Hai aumentato l'attacco del personaggio di 1, attacco aggiornato: " + utente.getAttacco());
                            break;
                        case 3:
                            utente.setDifesa(1);
                            System.out.println("Hai aumentato la difesa del personaggio di 1, difesa aggiornata: " + utente.getDifesa());
                            break;
                        case 4:
                            utente.setVita(-1);
                            System.out.println("Hai diminuito la vita del personaggio di 1, vita aggiornata: " + utente.getVita());
                            break;
                        case 5:
                            utente.setAttacco(-1);
                            System.out.println("Hai diminuito l'attacco del personaggio di 1, attacco aggiornato: " + utente.getAttacco());
                            break;
                        case 6:
                            utente.setDifesa(-1);
                            System.out.println("Hai diminuito la difesa del personaggio di 1, difesa aggiornata: " + utente.getDifesa());
                            break;

                    }
                }

                System.out.println("Lo stato attuale del personaggio è Vita: " + utente.getVita() + " Attacco: " + utente.getAttacco() + " Difesa: " + utente.getDifesa());

                Nemico nemico3 = new Drago();

                System.out.println("Dovrai affrontare il drago che ha vita: " + nemico3.getVita() + " Attacco: " + nemico3.getAttacco() + " Difesa: " + nemico3.getDifesa());
                
                if(Main.combattimento(utente, nemico3)){
                    System.out.println("HAI VINTO");
                }else{System.out.println("HAI PERSO3");}

            }else{System.out.println("HAI PERSO2");}

        }else{System.out.println("HAI PERSO1");}



        




    }

}