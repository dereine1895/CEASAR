public class Polybius extends Kryptomat{

    private int[][] alphabetQuadrat;


    public Polybius() {

       this.bfmS();

    }

    @Override
    public void verschluesseln(){

        for(int i = 0; i< kt.length(); i++){
           for(int zeile = 1; zeile < alphabetQuadrat.length; zeile++){
               for(int spalte = 1; spalte < alphabetQuadrat.length; spalte++){
                   kt = kt.toUpperCase();
                   if (kt.charAt(i) == alphabetQuadrat[zeile][spalte]) {
                       gt = gt + zeile + spalte;
                   }
               }
           }
       }

    }
    @Override
    public void entschluesseln(){
        kt="";
        for(int i = 0; i< gt.length();i +=2){
           int zeile =  gt.charAt(i);
           int spalte =  gt.charAt(i + 1);
           zeile--;
           spalte--;

           kt = kt + getChar(alphabetQuadrat[zeile][spalte]);



        }




    }

    private void bfmS(){
        alphabetQuadrat = new int [5][5];
        int a = 65;
        for (int zeile = 1; zeile < alphabetQuadrat.length; zeile++){
            for(int spalte = 1; spalte < alphabetQuadrat.length; spalte++){


                if (a==73){
                    a++;
                }
                alphabetQuadrat[zeile][spalte] = a;
                a++;
            }

        }
    }

}




