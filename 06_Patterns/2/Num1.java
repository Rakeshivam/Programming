
/*
Enter the Rows:
11
*         * * * * * *
*         *
*         *
*         *
*         *
* * * * * * * * * * *
          *         *
          *         *
          *         *
          *         *
* * * * * *         *


*/
import java.util.Scanner;

class Num1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Rows: ");
    int n = sc.nextInt();
    printpattern(n);

    sc.close();
  }

  public static void printpattern(int n) {
    int star = 1;
    int num = n * (n + 1) / 2;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= star; j++) {
        System.out.print(num-- + "\t");
      }
      star++;
      System.out.println();
    }
  }
}
