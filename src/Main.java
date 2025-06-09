import java.util.Scanner;

public class Main {
    public static int[][] inputArr(){
        Scanner scanner = new Scanner(System.in);

        int n = 9;
        int[][] arr = new int[n/3][n/3];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.printf("Arr[%d][%d] = ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }

        return arr;
    }

    public static void outputArr(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println();
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        outputArr(inputArr());

    }
}