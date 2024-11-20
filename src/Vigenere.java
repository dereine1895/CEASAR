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
            gt= gt + this.zahlenZuBuchstaben(h);
        }
    }
    public void entschluesseln() {

        for(int i =0; i < gt.length(); i++){
            int h = this.getASCII(gt.charAt(i));
            kt= kt + this.getChar(h - S);
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
    public int getS(){

        return S;
    }
    public void setS(int pWert){
        S = pWert;
    }
}
