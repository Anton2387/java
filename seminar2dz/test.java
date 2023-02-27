import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter; 
import java.time.LocalDateTime;

public class test {
    public static void main(String arg[]) {
        PrintWriter log;
        FileWriter logFile;
             /*  Сначала откроем файл, в который будем писать ошибки */
        try {
            logFile = new FileWriter("exceptions.log", true);
            log = new PrintWriter((java.io.Writer)logFile);
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        }
        try {
                /*  Тут находится основной код вашего приложения. Ошибки будут
                    проявляться в виде исключений, например так (искуственный
                    пример)
                */
            throw new Exception();
        } catch (Exception ex) {
                /*  Перехватываем все необработанные исключения и пишем в логфайл
                    временную отметку, сообщение об ошибке и стектрейс (в котором
                    будут указаны методы, которые привели к ошибке и номера строк
                    в исходниках)
                */
            log.printf("\n%s: %s\n", LocalDateTime.now(), ex.getMessage());
            ex.printStackTrace(log);
            log.flush();
        }
    }
}
