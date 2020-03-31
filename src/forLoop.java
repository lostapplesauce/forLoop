import java.util.Arrays;

public class forLoop {

    private static String[] practice(){
        String apple[] = {"rose","fiji","red","poison",
        "special","giant"};
        System.out.print(Arrays.toString(apple));
      return apple;
    }
    public static void main(String[] args){

        for(int i = 1; i<= 25; i++) {
            for (int j = 0; j <= 25; j += 2) {
                System.out.println(i);
                System.out.println(j);
            }
        }
        for(int k=0; k<practice().length; k++){
            System.out.println(Arrays.toString(practice()));
        }
    }
}
