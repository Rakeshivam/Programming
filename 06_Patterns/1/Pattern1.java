import java.util.Scanner;

class Pattern1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Rows: ");
      int n = sc.nextInt();
      printpattern(n);

      sc.close();
   }

   public static void printpattern(int n) {
      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= n; j++) {
            System.out.print("(" + i + "," + j + ")\t");
         }
         System.out.println();
      }
   }
}
