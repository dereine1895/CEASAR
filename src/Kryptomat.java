public abstract class Kryptomat{

    protected String gt;
    protected String kt;


    public Kryptomat(){

    }
    public abstract void verschluesseln();
    public abstract void entschluesseln();

    protected char getChar(int pWert){
        return (char) pWert;
    }
    protected int getAscii(char pWert){
        return(int) pWert;
    }
    public String getGt() {
        return gt;
    }
    public void setGt(String pGt){
        gt = pGt;
    }
    public String getKt() {
        return kt;
    }
    public void setKt(String pKt){

        kt = pKt;
    }







}
