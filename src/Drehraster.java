public class Drehraster extends Kryptomat {

    private int s;
    public Drehraster(){
        kt="";
        s = 0;
    }

    public void verschluesseln(){
        for (int i = 0;i < kt.length(); i++){
            for(int j = 0; j < s;j+= s){
                gt = gt + kt.charAt(j);

            }
        }
    }
    public void entschluesseln(){


    }

    public int getS(){

        return s;
    }
    public void setS(int pSchluessel){
        s = pSchluessel;
    }






}
