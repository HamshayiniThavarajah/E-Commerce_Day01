import java.util.Scanner;
 
class Fifth{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int number = scanner.nextInt();
scanner.close();

        int mid = (n + 1) / 2; // Find the middle position

        for (int i = 1; i <= n; i++) {
            if (i < mid) {
                System.out.print(" " + (mid - i)); // Reverse first half
            } else if (i == mid) {
                System.out.print(" " + i); // Print middle element
            } else {
                System.out.print(" " + (n - (i - mid))); // Reverse second half
            }
        int middle = number/2;
        for (int i = 1; i <= number; i++ ){
        if(i <= middle)
        {
          System.out.print((middle-i+1)+" ");  
        }
        else
        {
           if(i == middle + 1)  
           {
              System.out.print(i+" ");  
           }
           else
           {
              System.out.print((number - i+ middle + 2) +" "); 
           }
        }
}
System.out.println();
}