import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;

public class Main {
//    Инициализируем объект логгера для конкретного класса
    private final static Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        log.trace("Trace log message");
        log.debug("Debug log message");

//        Демонстрация форматирования строк, отличная от привычного по String и System.out.printf()
        var infoStr = "'I'm working correctly!'";
        log.info("Info log message: {} Now is {}", infoStr, LocalDateTime.now());

        try {
            throw  new RuntimeException("!!!");
        } catch (Exception e) {
//            Обратите внимание, для методов каждого уровня логирования существует ряд перегруженных реализаций
            log.error("Some error");
            log.error("Some error", e);
            log.error(e);
        }

        log.warn("Warn log message");
        log.fatal("Fatal log message");
    }
}