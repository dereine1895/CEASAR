package src;

public class Ceasar {

    private String gt;
    private String kt;
    private int s;

    public Ceasar() {
    }
    String gt="";

    public void verschluesseln() {
     for(int i =0; i < kt.length(); i++){
         int h = h + this.getAscii(kt.charAt(i));
         gt= this.getChar(
     }
    }
    public void entschluesseln() {
    }

   private char getChar(int pWert) {
        return (char) pWert;
   }
   private int getAscii(char pWert) {
        return (int) pWert;
      }
   public String getGt()
    {
        return gt;
    }
   public void setGt(String pGt){

    }
   public String getKt() {
   return kt;
   }
   public void setKt(String pGt){

   }
   public int getS(){
return s;
   }
   public void setS(int pSchluessel){

   }
}

