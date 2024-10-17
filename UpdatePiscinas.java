import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declaració de la constant per al Largo de les piscines
        final double Largo_P1 = 300.3;   // Largo de les piscines en metres (valor constant)

        // Demanar a l'usuari l'ample i profunditat de la piscina 1
        System.out.println("Introdueix l'ample de la piscina 1 (en metres): ");
        double Ancho_P1 = input.nextDouble();   // Ample de la piscina 1 en metres
        System.out.println("Introdueix la profunditat de la piscina 1 (en metres): ");
        double Profundidad_P1 = input.nextDouble();   // Profunditat de la piscina 1 en metres

        // Demanar a l'usuari l'ample i profunditat de la piscina 2
        System.out.println("Introdueix l'ample de la piscina 2 (en metres): ");
        double Ancho_P2 = input.nextDouble();   // Ample de la piscina 2 en metres
        System.out.println("Introdueix la profunditat de la piscina 2 (en metres): ");
        double Profundidad_P2 = input.nextDouble();   // Profunditat de la piscina 2 en metres

        // Càlcul de l'àrea de la piscina 1 i piscina 2 (Àrea = Largo * Ancho)
        int Area_P1 = (int) (Largo_P1 * Ancho_P1);   // Àrea de la piscina 1 (guardada com enter)
        int Area_P2 = (int) (Largo_P1 * Ancho_P2);   // Àrea de la piscina 2 (guardada com enter)

        // Impressió dels resultats de l'àrea de les dues piscines
        System.out.println("1.");
        System.out.println("L'àrea de la piscina 1 és de " + Area_P1 + " metres quadrats.");
        System.out.println("L'àrea de la piscina 2 és de " + Area_P2 + " metres quadrats.");
        System.out.println("");

        // Càlcul del volum de les dues piscines (Volum = Àrea * Profunditat)
        int Volumen_P1 = (int) (Area_P1 * Profundidad_P1);   // Volum de la piscina 1 (guardat com enter)
        int Volumen_P2 = (int) (Area_P2 * Profundidad_P2);   // Volum de la piscina 2 (guardat com enter)

        // Impressió dels resultats del volum de les dues piscines
        System.out.println("2.");
        System.out.println("El volum de la piscina 1 és de " + Volumen_P1 + " metres cúbics.");
        System.out.println("El volum de la piscina 2 és de " + Volumen_P2 + " metres cúbics.");
        System.out.println("");

        // Càlcul de les dimensions quan les dues piscines estan de costat (mateix llarg)
        double Largo_P2P1 = Largo_P1;                     // El llarg es manté igual
        double Ancho_P2P1 = Ancho_P1 + Ancho_P2;           // Els amples es sumen

        // Impressió de l'ample i llarg combinats de les dues piscines de costat
        System.out.println("3.");
        System.out.println("L'ample de les dues piscines una al costat de l'altra és de " + Ancho_P2P1 + " metres.");
        System.out.println("El llarg de les dues piscines una al costat de l'altra és de " + Largo_P2P1 + " metres.");
        System.out.println("");

        // Càlcul de l'àrea total de les dues piscines juntes (Àrea total = Àrea P1 + Àrea P2)
        int AreaP1P2 = Area_P1 + Area_P2;

        // Impressió de l'àrea total combinada de les dues piscines
        System.out.println("4.");
        System.out.println("L'àrea que ocupen les dues piscines una al costat de l'altra és de " + AreaP1P2 + " metres quadrats.");
        System.out.println("");

        // Càlcul del volum total de les dues piscines juntes (Volum total = Volum P1 + Volum P2)
        int VolumenP1P2 = Volumen_P1 + Volumen_P2;

        // Impressió del volum total que contenen ambdues piscines
        System.out.println("5.");
        System.out.println("El volum que contenen entre les dues és de " + VolumenP1P2 + " metres cúbics.");
        System.out.println("");

        // Intercanvi de profunditats entre les dues piscines
        double aux = Profundidad_P1;   // Variable auxiliar per guardar temporalment la profunditat
        Profundidad_P1 = Profundidad_P2;   // Profunditat de P1 pren el valor de P2
        Profundidad_P2 = aux;              // Profunditat de P2 pren el valor guardat de P1

        // Recalcul dels volums amb les profunditats intercanviades
        Volumen_P1 = (int) (Area_P1 * Profundidad_P1);   // Nou volum per piscina 1
        Volumen_P2 = (int) (Area_P2 * Profundidad_P2);   // Nou volum per piscina 2

        // Impressió dels nous volums després de l'intercanvi de profunditats
        System.out.println("6.");
        System.out.println("El volum que conté la piscina 1 és de " + Volumen_P1 + " metres cúbics.");
        System.out.println("");

        System.out.println("7.");
        System.out.println("El volum que conté la piscina 2 és de " + Volumen_P2 + " metres cúbics.");
        System.out.println("");
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}