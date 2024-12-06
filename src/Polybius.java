public class Polybius extends Kryptomat{

    private int[][] alphabetQuadrat;


    public Polybius() {
       kt = "";
       gt = "";


    }


    public void verschluesseln(){
       for(int i = 0; i< kt.length(); i++){
           for(int zeile = 1; zeile < alphabetQuadrat.length; zeile++){
               for(int spalte = 1; spalte < alphabetQuadrat.length; spalte++){

               }
           }
       }

    }
    public void entschluesseln(){



    }
    private void bfmS(){
        alphabetQuadrat = new int [5][5];
        int a = 65;
        for (int zeile = 1; zeile < alphabetQuadrat.length; zeile++){
            for(int spalte = 1; spalte < alphabetQuadrat.length; spalte++){
                alphabetQuadrat[zeile][spalte] = a;
            }
        }
    }

}




