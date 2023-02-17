// Напишите метод, который сжимает строку. 
// Пример: вход aaaabbbcdd.


package seminar2;

public class ex2 {
    public static void main(String[] args) {
        String inp = "aaaabbbcdd";
        System.out.println(mkString(inp));
    
    }
    private static String mkString(String s) {
        StringBuilder sB = new StringBuilder();
        //  s = s + ' '; КОСТЫЛЬ
        int count = 1;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) count++;
            else {
            sB.append(s.charAt(i)).append(count);
            count = 1;
            }
        }
        return sB.toString();
    }
    }
    
