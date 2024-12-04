public class Vigenere extends Kryptomat {

    private String s; //Schlüssel

    public Vigenere() {

        gt = "";
        kt = "";
        s = "";
    }

    /**
     * Mit Hilfe dieser Methode wird ein Klartext nach dem Vigenereprinzip verschlüsselt. Verschlüsslet werden können nur
     *
     */
    public void verschluesseln() {

        for(int i =0; i < kt.length(); i++){
            kt = kt.toUpperCase(); //Wandelt den Klartext in Großbuchstaben um
            s = s.toUpperCase();  //Wandelt den Schlüssel in Großbuchstaben um
             int h = this.getAscii(kt.charAt(i)); //Holt den Ascii wert des Klartextes
             int e =(s.charAt(i%s.length())-65)%26; //wiederholt den schlüssel wenn i größer als der schlüssel ist, -65 um 'A'0 zu setzten, modulo 26 um zwischen 0 und 25 zu bleiben(alphabet)
             gt= gt + String.valueOf(this.getChar(((h + e -13)%26)+65));
             //-13 um durch 26 teilen zu können und nicht unter 0 zu landen. 65-13 =52 / 26 = 26
             //rechnet kt und schlüssel zusammen für die verschiebung
            //modulo 26 um nicht aus dem alphabet rauszugehen, +65 um Ascii der buchstaben zu haben

        }
    }
    public void entschluesseln() {

        for(int i =0; i < gt.length(); i++){
            gt = gt.toUpperCase();  //Wandelt den Geheimtext in Großbuchstaben um
            s = s.toUpperCase();  //Wandelt den Schlüssel in Großbuchstaben um
            int h = this.getAscii(gt.charAt(i)); //Holt den Ascii wert des geheimtextes
            int e =(s.charAt(i%s.length())-65)%26; //wiederholt den schlüssel wenn i größer als der schlüssel ist, -65 um 'A'0 zu setzten, modulo 26 um zwischen 0 und 25 zu bleiben(alphabet)
            kt=kt + String.valueOf(this.getChar(((h - e -13)%26)+65));
            //-13 um durch 26 teilen zu können und nicht unter 0 zu landen. 65-13 =52 / 26 = 26
            //rechnet kt minus schlüssel für die verschiebung
            //modulo 26 um nicht aus dem alphabet rauszugehen, +65 um Ascii der buchstaben zu haben
        }
    }



    public String getS(){

        return s;
    }
    public void setS(String pSchluessel){
        s = pSchluessel;
    }
}
