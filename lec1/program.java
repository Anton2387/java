package lec1;
/**
 * program
 */
// public class program {
//     public static void main(String[] args) {
//         System.out.println("good");  // проверка работы
//     }
// }


// public class program {
//     public static void main(String[] args) {
//         int a = 18;
//         // 10010
//         // a = a << 1;
//         System.out.println(a >> 1);
//         // 1001
//     }
// }


// public class program {
//     public static void main(String[] args) {
//         boolean a = true;
//         boolean b = true;
//         System.out.println(a & b);
//         System.out.println(a && b);
//     }
// }


// public class program {
//     public static void main(String[] args) {
//         int[] arr = new int[10];
//         System.out.println(arr.length); // 10

//         arr = new int[] { 1, 2, 3, 4, 5 };
//         System.out.println(arr.length); // 5
//     }
// }


// public class program {
//     public static void main(String[] args) {
//         int[] arr = new int[10];
//         System.out.println(arr.length); // 10

//         arr = new int[] { 1, 2, 3, 4, 5 };
//         System.out.println(arr.length); // 5
//     }
// }

import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
 }
}
