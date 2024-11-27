public class Ceasar extends Kryptomat {


    private int s;

    public Ceasar() {

        gt = "";
        kt = "";
        s = 0;
    }

    public void verschluesseln() {

     for(int i =0; i < kt.length(); i++){
         int h = this.getAscii(kt.charAt(i));
         gt= gt + this.getChar(h + s);
         //for schleife geht jede stelle des zu verschlüsselnden wortes durch.
         //legt den ascii wert des buchstaben in einen speicher h
         //fügt zum geheimwort den buchstaben aus ascii wert und schlüssel hinzu
     }
    }
    public void entschluesseln() {

        for(int i =0; i < gt.length(); i++){
            int h = this.getAscii(gt.charAt(i));
            kt= kt + this.getChar(h - s);
            /* geht jede stelle des wortes durch
            holt den ascii wert des aktuellen zeichens
            rechnet ascii wert von gt minus schlüssel

             */
        }
    }


   public int getS(){

        return s;
   }
   public void setS(int pSchluessel){
     s = pSchluessel;
   }
}

