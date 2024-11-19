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
        gt ="";
     for(int i =0; i < kt.length(); i++){
         int h = this.getAscii(kt.charAt(i));
         gt= gt + this.getChar(h + S);
     }
    }
    public void entschluesseln() {
        kt="";
        for(int i =0; i < gt.length(); i++){
            int h = this.getAscii(gt.charAt(i));
            kt= kt + this.getChar(h - S);
        }
    }

   private char getChar(int pWert) {
        return (char) pWert;
   }
   private int getAscii(char pWert) {
        return (int) pWert;
      }
   public String getgt() {
        return gt;
    }
   public void setgt(String pgt){
      gt = pgt;
    }
   public String getkt() {
    return kt;
   }
   public void setkt(String pkt){
    kt = pkt;
   }
   public int getS(){
   return S;
   }
   public void setS(int pSchluessel){

   }
}

