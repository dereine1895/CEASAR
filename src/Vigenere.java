public class Vigenere {
    private String gt; //Geheimtext
    private String kt; //Klartext
    private String S; //Schlüssel

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
    public void setgt(String Geheimtext){
        gt = Geheimtext;
    }
    public String getkt() {
        return kt;
    }
    public void setkt(String Klartext){

        kt = Klartext;
    }
    public String getS(){

        return S;
    }
    public void setS(String Schluessel){
        S = Schluessel;
    }
}
