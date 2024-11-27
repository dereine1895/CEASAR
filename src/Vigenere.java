public class Vigenere extends Kryptomat {

    private String s; //Schlüssel

    public Vigenere() {

        gt = "";
        kt = "";
        s = "";
    }

    public void verschluesseln() {

        for(int i =0; i < kt.length(); i++){
            kt = kt.toUpperCase();
            s = s.toUpperCase();
             int h = this.getAscii(kt.charAt(i));
             int e =(s.charAt(i%s.length())-65)%26;
             gt= gt + String.valueOf(this.getChar(((h + e -13)%26)+65));

        }
    }
    public void entschluesseln() {

        for(int i =0; i < gt.length(); i++){
            gt = gt.toUpperCase();
            s = s.toUpperCase();
            int h = this.getAscii(gt.charAt(i));
            int e =(s.charAt(i%s.length())-65)%26;
            gt=gt + String.valueOf(this.getChar(((h - e -13)%26)+65));
        }
    }



    public String getS(){

        return s;
    }
    public void setS(String pSchluessel){
        s = pSchluessel;
    }
}
