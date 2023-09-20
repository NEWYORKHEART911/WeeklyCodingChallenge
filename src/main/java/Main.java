import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String[] input = new String[size];
        int[] result = new int[size];
        for(int j=0; j<size; j++) {
            input[j] = sc.nextLine();
            int sum = 0;
            for(int n=0; n<input[j].length(); n++) {
                if(Character.isDigit(input[j].charAt(n))) {
                    System.out.println(" digit? " + input[j].charAt(n));
                    sum += Integer.parseInt(input[j].substring(n, n+1));
                }
            }
            result[j] = sum;
            sum = 0;
        }

        for(int num : result) {
            System.out.println(num);
        }
    }
}
