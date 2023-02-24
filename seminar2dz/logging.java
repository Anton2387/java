import java.io.IOException;
import java.util.logging.*;
public class logging {
 public static void main(String[] args) throws SecurityException, IOException {
    Logger logger = Logger.getLogger(logging.class.getName());
    // ConsoleHandler ch = new ConsoleHandler();
    FileHandler fh = new FileHandler("log.xml");
    logger.addHandler(fh);
    //SimpleFormatter sFormat = new SimpleFormatter();
    XMLFormatter xml = new XMLFormatter();
    //ch.setFormatter(sFormat);
    fh.setFormatter(xml);
    logger.log(Level.WARNING, "Тестовое логирование 1");
    logger.info("Тестовое логирование 2");
 }
}

