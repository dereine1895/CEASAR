public class Polybius extends Kryptomat{

    private int[][] alphabetQuadrat;


    public Polybius() {
       kt = "";
       gt = "";


    }


    public void verschluesseln(){
        this.bfmS();

        for(int i = 0; i< kt.length(); i++){
           for(int zeile = 1; zeile < alphabetQuadrat.length; zeile++){
               for(int spalte = 1; spalte < alphabetQuadrat.length; spalte++){
                   if (kt.charAt(i) == alphabetQuadrat[zeile][spalte]) {
                       gt = gt + zeile + spalte;
                   }
               }
           }
       }

    }
    public void entschluesseln(){
        this.bfmS();



    }

    private void bfmS(){
        alphabetQuadrat = new int [5][5];
        int a = 65;
        for (int zeile = 1; zeile < alphabetQuadrat.length; zeile++){
            for(int spalte = 1; spalte < alphabetQuadrat.length; spalte++){
                alphabetQuadrat[zeile][spalte] = a;

                if (a==73){
                    a++;
                }
                a++;
            }

        }
    }

}




