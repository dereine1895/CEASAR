public class Vigenere extends Kryptomat {

    private String s; //Schlüssel

    public Vigenere() {

        gt = "";
        kt = "";
        s = "";
    }

    /**
     *
     */
    public void verschluesseln() {

        for(int i =0; i < kt.length(); i++){
            kt = kt.toUpperCase(); //Wandelt den Klartext in Großbuchstaben um
            s = s.toUpperCase();  //Wandelt den Schlüssel in Großbuchstaben um
             int h = this.getAscii(kt.charAt(i)); //Holt den Ascii wert des Klartextes
             int e =(s.charAt(i%s.length())-65)%26;
             gt= gt + String.valueOf(this.getChar(((h + e -13)%26)+65));

        }
    }
    public void entschluesseln() {

        for(int i =0; i < gt.length(); i++){
            gt = gt.toUpperCase();  //Wandelt den Geheimtext in Großbuchstaben um
            s = s.toUpperCase();  //Wandelt den Schlüssel in Großbuchstaben um
            int h = this.getAscii(gt.charAt(i)); //Holt den Ascii wert des geheimtextes
            int e =(s.charAt(i%s.length())-65)%26;
            kt=kt + String.valueOf(this.getChar(((h - e -13)%26)+65));
        }
    }



    public String getS(){

        return s;
    }
    public void setS(String pSchluessel){
        s = pSchluessel;
    }
}
