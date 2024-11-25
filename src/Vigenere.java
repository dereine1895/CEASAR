public class Vigenere {
    private String gt;
    private String kt;
    private String S;

    public Vigenere() {

        gt = "";
        kt = "";
        S = "";
    }

    public void verschluesseln() {

        for(int i =0; i < kt.length(); i++){
             int h = this.buchstabenZuZahlen(kt.charAt(i));
             int e = this.buchstabenZuZahlen(S.charAt(i));
             gt= gt + this.zahlenZuBuchstaben(h + e);
        }
    }
    public void entschluesseln() {

        for(int i =0; i < gt.length(); i++){
            int h = this.buchstabenZuZahlen(gt.charAt(i));
            int e = this.buchstabenZuZahlen(S.charAt(i));
            kt= kt + this.zahlenZuBuchstaben(h - e);
        }
    }

    private char zahlenZuBuchstaben(int pWert) {
        return (char) pWert;
    }
    private int buchstabenZuZahlen(char pWert) {
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
    public String getS(){

        return S;
    }
    public void setS(int pWert){
        S = String.valueOf(pWert);
    }
}
