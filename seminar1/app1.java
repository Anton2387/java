package seminar1;
// дан массив чисел, нужно сформировать новую выборку
// только из четных чисел
    
import java.util.Arrays;
import java.util.stream.IntStream;
    

public class app1 {
    public void name(String[] args) {
        int[] array = {1, 3, 4, 5, 6};
        int[] even = IntStream.of(array).filter(item -> item%2 == 0).toArray();
        System.out.println(Arrays.toString(even));
    }
}

