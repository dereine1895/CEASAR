
import java.util.Scanner;
public class Verwaltung{
    private Scanner scanner;
    private Ceasar ceasar;

    public static void main(String[] args) {
        new Verwaltung();
    }
    public Verwaltung() {
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1]Ceasar");
            System.out.println("[2]Vigenere");
            int option = scanner.nextInt();
            System.out.println("[1] verschluesseln");
            System.out.println("[2] entschluesseln");
            int option = scanner.nextInt();
            scanner.nextLine(); // nextInt scannt keine neue Zeile. Ohne diese Anweisung würde das nächste gewollte nextLine nicht funktionieren.
            if (option == 1) {
                System.out.println("Gib das zu verschlüsselnde Wort an:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüssel an:");
                String schluesselString = scanner.nextLine();
                int schluessel = Integer.parseInt(schluesselString);
                ceasar= new Ceasar();
                this.ceasar.setkt(zeichenkette);
                this.ceasar.setS(schluessel);
                System.out.println("=======Klartext=======");
                System.out.println(this.ceasar.getkt());
                this.ceasar.verschluesseln();
                System.out.println("=======Geheimtext=======");
                System.out.println(this.ceasar.getgt());

            } else if (option == 2) {
                System.out.println("Gib das zu entschlüsselnde Wort an:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüssel an:");
                String schluesselString = scanner.nextLine();
                int schluessel = Integer.parseInt(schluesselString);
                ceasar= new Ceasar();
                this.ceasar.setgt(zeichenkette);
                this.ceasar.setS(schluessel);
                System.out.println("=======Geheimtext=======");
                System.out.println(zeichenkette);
                this.ceasar.entschluesseln();
                System.out.println("=======Klartext=======");
                System.out.println(this.ceasar.getkt());


            }
            else if (option == 0) {
                break;
            }
            System.out.println();
        }
    }

}
