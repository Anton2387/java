// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.logging.*;
import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) throws SecurityException, IOException {

        Logger logger = Logger.getLogger(ex3.class.getName());
        // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        //SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //ch.setFormatter(sFormat);
        fh.setFormatter(xml);

        int [] mas = {11, 3, 14, 16, 7};
 
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {

                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;

                    // logger.log(Level.WARNING, "Тестовое логирование 1");
                    logger.info("iterations: передвинули на 1 позицию в начало " + mas[i] );
                    logger.info(Arrays.toString(mas));
                }
            }
        }
        System.out.println(" Искомый массив " + Arrays.toString(mas));
    }
}
