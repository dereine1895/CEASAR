import java.util.Scanner;

public class Verwaltung {
    private Scanner scanner;
    private Tester test;

    public static void main(String[] args) {
        new Verwaltung();

    }
    public Verwaltung() {
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
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
                ceasar= new ceasar();
                this.ceasar.setKt(zeichenkette);
                this.ceasar.setS(schluessel);
                System.out.println("=======Klartext=======");
                System.out.println(this.ceasar.getkt());
                this.ceasar.verschluesseln();
                System.out.println("=======Geheimtext=======");
                System.out.prinlt(this.ceasar.getGt());

            } else if (option == 2) {
                // this.sendMessage();
                System.out.println("Gib die Zeichenkette für den Palindromtest an:");
                String zeichenkette = scanner.nextLine();
                this.test.setEingabe(zeichenkette);
                this.test.palindromTest();
                System.out.println("Ist dein Wort ein Palindrom? Die Antwort lautet: "+this.test.isIstPalindrom());
            }
            else if (option == 0) {
                break;
            }
            System.out.println();
        }
    }

}
