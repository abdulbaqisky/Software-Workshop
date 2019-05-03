package plus_minus;
import java.util.Scanner;
public class Plus_Minus {

    public static void main(String[] args) {
    double psitive = 0;
    double ngative = 0;
    double zeros = 0;
    double psitiveratio;
    double zerosratio;
    double ngativeratio;
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of elements in array: ");
    int num = input.nextInt();
    int baqi[] = new int[num];
    for (int i =0; i < num; i++){
        baqi[i] = input.nextInt();
        
        if (baqi[i] > 0)
            psitive++;
        if (baqi[i] < 0)
            ngative++;
        if (baqi[i] == 0)
            zeros++;
        }
    
    ngativeratio = ngative / baqi.length;
    psitiveratio = psitive / baqi.length;
    zerosratio = zeros / baqi.length;
    
    System.out.println( psitiveratio);
    System.out.println( ngativeratio);
    System.out.println( zerosratio);
    }
}
