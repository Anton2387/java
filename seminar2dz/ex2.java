
// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.logging.*;
import java.util.Arrays;

public class ex2 {

    // public static void logFile(String[] args) {
    //     try {
    //         LogManager.getLogManager().readConfiguration(logging.class.getResourceAsStream("/logging.properties"));
    //     } catch (IOException e) {
    //         System.err.println("Could not setup logger configuration: " + e.toString());
    //     }
    // }

    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(ex2.class.getName());
        // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log2.xml");
        logger.addHandler(fh);
        //SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //ch.setFormatter(sFormat);
        fh.setFormatter(xml);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }

    public static void main(String[] args, Logger logger) {
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

                    logger.log(Level.WARNING, "Тестовое логирование 1");
                    logger.info("Тестовое логирование 2");
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    } 
}

// class Test {
//     public static void main(String arg[]) {
//         PrintWriter log;
//         FileWriter logFile;
//         /*  Сначала откроем файл, в который будем писать ошибки */
//         try {
//             logFile = new FileWriter("exceptions.log", true);
//             log = new PrintWriter((java.io.Writer)logFile);
//         } catch (IOException ex) {
//             ex.printStackTrace();
//             return;
//         }
//         try {
//         /*  Тут находится основной код вашего приложения. Ошибки будут
//             проявляться в виде исключений, например так (искуственный
//             пример)
//         */
//             throw new Exception();
//         } catch (Exception ex) {
//         /*  Перехватываем все необработанные исключения и пишем в логфайл
//             временную отметку, сообщение об ошибке и стектрейс (в котором
//             будут указаны методы, которые привели к ошибке и номера строк
//             в исходниках)
//         */
//             log.printf("\n%s: %s\n", LocalDateTime.now(), ex.getMessage());
//             ex.printStackTrace(log);
//             log.flush();
//         }
//     }
// }
