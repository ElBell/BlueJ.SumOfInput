import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(){

    }
    public void sumToN() {
      Scanner nInput = new Scanner(System.in);
      System.out.print("Please enter a number");
      int n = nInput.nextInt();
      int sum = 0;
      for(int i = 0; i <= n; i++) {
          sum = sum + i;
        }
      System.out.print(sum);
    }
}
