// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
  public class Main {
    public static void main(String[] args)
    {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Podaj ilość liczb w tablicy:");
      int n = scanner.nextInt();
      int[] arr = new int[n];
      System.out.println("Podaj liczby:");
      for (int i = 0; i < n; i++)
      {
        arr[i] = scanner.nextInt();
      }
      int min = arr[0];
      for (int i = 0; i < n; i++)
        {
          if (arr[i] < min)
          {
            min = arr[i];
              }
        }
      System.out.println("Najmniejsza liczba ze zbioru to:" + min);
      
    }
  }
    