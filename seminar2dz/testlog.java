import java.util.logging.*;

public class testlog {
    
    private static final Logger logger = Logger.getLogger(testlog.class.getName());
    
    public static void main(String[] args) throws Exception {
        // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log2.xml");
        fileHandler.setFilter(new MyFilter());
        fileHandler.setFormatter(new MyFormatter());
        logger.addHandler(fh);
        //SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //ch.setFormatter(sFormat);
        fh.setFormatter(xml);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");        
    }

    static class MyFilter implements Filter {
        @Override
        public boolean isLoggable(LogRecord record) {
            return record.getMessage().endsWith("max");
        }
    }

    static class MyFormatter extends Formatter {
        @Override
        public String format(LogRecord record) {
            return record.getLevel() + record.getMessage();
        }
    }
    
}
