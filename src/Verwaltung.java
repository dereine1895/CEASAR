
import java.util.Scanner;
public class Verwaltung {
    private Scanner scanner;
    private Ceasar ceasar;
    private Vigenere vigenere;

    public static void main(String[] args) {
        new Verwaltung();
    }

    public Verwaltung() {
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1]Ceasar");
            System.out.println("[2]Vigenere");
            System.out.println("[3]Beenden");
            int option = scanner.nextInt();
             if (option == 1) {
                 System.out.println("[1] verschluesseln");
                 System.out.println("[2] entschluesseln");
                 option = scanner.nextInt();
                 // nextInt scannt keine neue Zeile. Ohne diese Anweisung würde das nächste gewollte nextLine nicht funktionieren.
                 if (option == 1) {
                     System.out.println("Gib das zu verschlüsselnde Wort an:");
                     String zeichenkette = scanner.nextLine();
                     System.out.println("Gib den Schlüssel an:");
                     String schluesselString = scanner.nextLine();
                     int schluessel = Integer.parseInt(schluesselString);
                     ceasar = new Ceasar();
                     this.ceasar.setkt(zeichenkette);
                     this.ceasar.setS(schluessel);
                     System.out.println("=======Klartext=======");
                     System.out.println(this.ceasar.getkt());
                     this.ceasar.verschluesseln();
                     System.out.println("=======Geheimtext=======");
                     System.out.println(this.ceasar.getgt());

                 }
                 if (option == 2) {
                     System.out.println("Gib das zu entschlüsselnde Wort an:");
                     String zeichenkette = scanner.nextLine();
                     System.out.println("Gib den Schlüssel an:");
                     String schluesselString = scanner.nextLine();
                     int schluessel = Integer.parseInt(schluesselString);
                     ceasar = new Ceasar();
                     this.ceasar.setgt(zeichenkette);
                     this.ceasar.setS(schluessel);
                     System.out.println("=======Geheimtext=======");
                     System.out.println(zeichenkette);
                     this.ceasar.entschluesseln();
                     System.out.println("=======Klartext=======");
                     System.out.println(this.ceasar.getkt());

                 }
             }
             else if (option == 2) {
                    vigenere = new Vigenere();
                    String schluessel;
                    System.out.println("[1]verschlüsseln");
                    System.out.println("[2]entschlüsseln");
                    option = scanner.nextInt();
                    if (option == 1) {
                        System.out.println("Gib den zu verschlüsselnden Text an");
                        String schluesselString = scanner.next();
                        vigenere.setkt(schluesselString);
                        System.out.println("Gib den Schlüssel an");
                        schluessel = scanner.next();
                        vigenere.setS(Integer.parseInt(schluessel));
                        vigenere.verschluesseln();
                        System.out.println("Dein verschluesseltes Wort lautet: " + vigenere.getgt());
                    }
                    if (option == 2) {
                        System.out.println("Gib den zu entschlüsselnden Text an");
                        String schluesselString = scanner.next();
                        vigenere.setgt(schluesselString);
                        System.out.println("Gib den Schlüssel an");
                        schluessel = scanner.next();
                        vigenere.setS(Integer.parseInt(schluessel));
                        vigenere.entschluesseln();
                        System.out.println("Der Klartext lautet " + vigenere.getkt());
                    }

                } else if (option == 3) {
                    break;
                }
            }
        }


    }
