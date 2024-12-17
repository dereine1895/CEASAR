public class Drehraster extends Kryptomat {

    private int s;
    public Drehraster(){
        kt="";
        gt="";
        s = 0;
    }

    public void verschluesseln() {
        // Ein Array zum Speichern des verschlüsselten Textes, mit der gleichen Länge wie der Klartext
        char[] gtArray = new char[kt.length()];

        // Durchlaufe alle Zeichen des Klartexts
        for (int i = 0; i < kt.length(); i++) {
            // Berechne die neue Position, die durch den Schlüssel bestimmt wird
            int verschiebung = (i + s) % kt.length();

            // Das Zeichen an der berechneten Position im Array speichern
            gtArray[verschiebung] = kt.charAt(i);
        }

        // Den verschlüsselten Text (in Form eines Strings) in der geerbten gt-Variable speichern
        gt = new String(gtArray);
    }


    public void entschluesseln(){


    }

    public int getS(){

        return s;
    }
    public void setS(int pSchluessel){
        s = pSchluessel;
    }






}
