package arrays.ds;

import java.util.Scanner;

public class ArraysDS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int num = input.nextInt();
        int baqi[] = new int[num];
        int reversebaqi[] = new int[num];
        for (int i =0; i < num; i++){
            baqi[i] = input.nextInt();
            reversebaqi[num - i -1] = baqi[i];
        
        
    }
        for (int i =0; i < num; i++){
        //System.out.print(baqi[i]);
        System.out.print(reversebaqi[i] + "\t");
    }
}
    }
