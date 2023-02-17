// Написать программу вычисления n-ого треугольного числа.

package seminar1dz;

import java.util.Scanner;
  

// Попытался здесь через StringBuilder , не знаю как засунуть "n" в формулу

// public class ex1 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("Введите число n, для n-ого треугольного числа: ");
//         var n = " ";
//     }
//     public static void name(String[] args) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < n; i++) {
//             sb = Math.log(n*(n+1)/n);
//             sb.append(" ");
//         }
//         System.out.println(sb.toString());
// }

public class ex1 {

    private static Scanner input = new Scanner(System.in);
  
    public static void main(String[] args) {
  
      // Написать программу вычисления n-ого треугольного числа.

      int n = getNumberByUser("Введите число n, для n-ого треугольного числа: ");
      int[] items = createArray(n);
      fillArray(items, n);
      print2(items);
  
    //   System.out.println(Arrays.toString(items));
    }
  
    // #region
    // 2.0 Ввод числа
    public static int[] createArray(int size) {
      return new int[size];
    }
  
    public static int getNumberByUser(String text) {
      System.out.print(text);
      return input.nextInt();
    }
  
    // 2.1 Заполнение массива
    public static void fillArray(int[] col, int n) {
      int count = col.length;
      int index = 0;
      int triangle = 1;
      while (index < count) {
        col[index] = triangle*(triangle+1)/2;
        index = index + 1;
        triangle = triangle + 1;
      }
    }
  
    // 2.2 Печать результата
    public static void print2(int[] data) {
      int count = data.length;
  
      int index = 0;
      while (index < count) {
        System.out.print(data[index] + " ");
        index = index + 1;
      }
  
    }
    // #endregion
  }