import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //List<int[]> triples = new ArrayList<>();
        int[] input;
        int inputs = 0;
        List<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        while(inputs < size) {
            input = new int[3];
            for (int j = 0; j < 3; j++) {
                input[j] = sc.nextInt();
                if(input[j] > max) {
                    max2 = max;
                    max = input[j];
                } else if(input[j] > max2) {
                    max2 = input[j];
                }
            }
            ans.add(max2);
            max = Integer.MIN_VALUE;
            max2 = Integer.MIN_VALUE;
            //triples.add(input);
            ++inputs;
        }

        for(int num : ans) {
            System.out.println(num);
        }
    }
}
