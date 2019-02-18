
import java.util.Scanner;

public class MaxIncreasingSubseq {
    public static void main(String[] args) {
        String word;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        word = in.next();
        int length_array = word.length();
        char[] charactlist = new char[length_array];





        getLIS(word);


    }

    public static void getLIS(String list) {
            int maxLength = 0;

        if (list == null && list.length() == 0) {
            System.out.println("this is the longest sub " + list.charAt(0));
        }

        int[] score = new int[list.length()];
        int[] prev = new int[list.length()];
        for (int i = 0; i < list.length(); i++) {

            score[i] = 1;
            prev[i] = -1;

            for (int j = 0; j < i; j++) {
                if (list.charAt(j) < list.charAt(i) && score[j] >= score[i]) {

                    score[i] = score[j] + 1;
                    prev[i] = j;




                }
                if(score[i] > maxLength){
                    maxLength=score[i];
                    System.out.print(list.charAt(i));
                }

            }
            }

    }
}