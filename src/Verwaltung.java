
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
            System.out.println("Hallo, in diesem System kannst du eine beliebige Nachricht auf verschiedene Arten verschlüsseln oder entschlüssseln um eine Nachricht Geheim zu halten");
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("Bei Ceasar wird eine Nachricht mithilfe einer Zahl,des schlüssels, Ver- oder entschlüsselt.");
            System.out.println("[1]Ceasar");
            System.out.println("Bei Vigenere wird ein Wort mithilfe eines anderen Wortes verschlüsselt");
            System.out.println("[2]Vigenere");
            System.out.println("Wenn du willst kannst du das System auch beenden");
            System.out.println("[3]Beenden");
            int option = scanner.nextInt();
            scanner.nextLine();
              if (option == 1) {
                  ceasar = new Ceasar();
                  System.out.println("Hier kannst du dir auswählen ob du etwas ver- oder entschlüsseln möchtest Für beides brauchst du die Nachricht die übermittelt werden soll und eine zahl 1mit dem die nachricht verschlüsselt wird.");
                 System.out.println("[1] verschluesseln");
                 System.out.println("[2] entschluesseln");
                 option = scanner.nextInt();
                 scanner.nextLine();
                 // nextInt scannt keine neue Zeile. Ohne diese Anweisung würde das nächste gewollte nextLine nicht funktionieren.
                 if (option == 1) {

                     System.out.println("Gib das zu verschlüsselnde Wort an:");
                     String zeichenkette = scanner.nextLine();
                     this.ceasar.setKt(zeichenkette);
                     System.out.println("Gib den Schlüssel als Zahl an:");
                     String schluesselString = scanner.nextLine();
                     int schluessel = Integer.parseInt(schluesselString);
                     this.ceasar.setS(schluessel);
                     System.out.println("=======Klartext=======");
                     System.out.println(this.ceasar.getKt());
                     this.ceasar.verschluesseln();
                     System.out.println("=======Geheimtext=======");
                     System.out.println(this.ceasar.getGt());

                 }
                 if (option == 2) {
                     System.out.println("Gib das zu entschlüsselnde Wort an:");
                     String zeichenkette = scanner.nextLine();
                     this.ceasar.setGt(zeichenkette);
                     System.out.println("Gib den Schlüssel an:");
                     String schluesselString = scanner.nextLine();
                     int schluessel = Integer.parseInt(schluesselString);
                     this.ceasar.setS(schluessel);
                     System.out.println("=======Geheimtext=======");
                     System.out.println(zeichenkette);
                     this.ceasar.entschluesseln();
                     System.out.println("=======Klartext=======");
                     System.out.println(this.ceasar.getKt());

                 }
             }
             else if (option == 2) {
                  vigenere = new Vigenere();
                  String schluessel;
                  System.out.println("Hier kannst du dir auswählen ob du etwas ver- oder entschlüsseln möchtest Für beides brauchst du die Nachricht die übermittelt werden soll und eine Nachricht mit dem die nachricht verschlüsselt wird.");
                  System.out.println("[1]verschlüsseln");
                  System.out.println("[2]entschlüsseln");
                  option = scanner.nextInt();
                  scanner.nextLine();
                  if (option == 1) {
                      System.out.println("Gib den zu verschlüsselnden Text an");
                      String schluesselString = scanner.next();
                      vigenere.setKt(schluesselString);
                      System.out.println("Gib ein Schlüsselwort an");
                      schluessel = scanner.next();
                      vigenere.setS(schluessel);
                      vigenere.verschluesseln();
                      System.out.println("Dein verschluesseltes Wort lautet: " + vigenere.getGt());
                  }
                  if (option == 2) {
                      System.out.println("Gib den zu entschlüsselnden Text an");
                      String schluesselString = scanner.next();
                      vigenere.setGt(schluesselString);
                      System.out.println("Gib das Schlüsselwort an");
                      schluessel = scanner.nextLine();
                      vigenere.setS(schluessel);
                      vigenere.entschluesseln();
                      System.out.println("Der Klartext lautet " + vigenere.getKt());
                  }
              }
                 else if (option == 3) {
                    break;
                }
            }

        }


    }
