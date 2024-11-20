public class Ceasar {

    private String gt;
    private String kt;
    private int S;

    public Ceasar() {

        gt = "";
        kt = "";
        S = 0;
    }

    public void verschluesseln() {

     for(int i =0; i < kt.length(); i++){
         int h = this.getASCII(kt.charAt(i));
         gt= gt + this.getChar(h + S);
         //for schleife geht jede stelle des zu verschlüsselnden wortes durch.
         //legt den ascii wert des buchstaben in einen speicher h
         //fügt zum geheimwort den buchstaben aus ascii wert und schlüssel hinzu
     }
    }
    public void entschluesseln() {

        for(int i =0; i < gt.length(); i++){
            int h = this.getASCII(gt.charAt(i));
            kt= kt + this.getChar(h - S);
            /* geht jede stelle des wortes durch
            holt den ascii wert des aktuellen zeichens
            rechnet ascii wert von gt minus schlüssel

             */
        }
    }

   private char getChar(int pWert) {
        return (char) pWert;
   }
   private int getASCII(char pWert) {
        return (int) pWert;
      }
   public String getgt() {
        return gt;
    }
   public void setgt(String pWert){
      gt = pWert;
    }
   public String getkt() {
    return kt;
   }
   public void setkt(String pWert){

        kt = pWert;
   }
   public int getS(){

        return S;
   }
   public void setS(int pWert){
     S = pWert;
   }
}

