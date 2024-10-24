public class Main {
    public static void main(String[] args) {


        int away [] = {5,1,3,8,11};

        /*System.out.println("Unsortiertes Array: ");
        for(int num : System.out.println("");away){
            System.out.print(num + " ");
        }*/

        for (int i = 1; i < away.length; i++) {
            int x = away[i];
            int j = i-1;

            while(j >= 0 && away[j] > x){
                away[j + 1] = away [j];
                j = j-1;
            }

            //Hallo Marie, das ist ein Kommentar!!!
            away[j+1] = x;
        }

        //Das ist ein 2. Kommentar!
        System.out.println("\n Sortiertes Array: ");
        for(int num : away){
            System.out.print(num + " ");

        }



    }


}