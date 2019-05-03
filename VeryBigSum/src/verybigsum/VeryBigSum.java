package verybigsum;

import java.util.Scanner;

public class VeryBigSum {
    public static void main(String[] args) {
        long sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int num = input.nextInt();
        int baqi[] = new int[num];
        for (int i =0; i < num; i++){
            baqi[i] = input.nextInt();
            sum += baqi[i];
    }
        System.out.println(sum);
}
}