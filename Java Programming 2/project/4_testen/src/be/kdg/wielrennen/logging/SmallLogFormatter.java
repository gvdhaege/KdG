package be.kdg.wielrennen.logging;

import java.text.MessageFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class SmallLogFormatter extends Formatter {
    private final static String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    @Override
    public String format(LogRecord record) {
        LocalDateTime localDateTime = Instant.ofEpochMilli(record.getMillis()).atZone(ZoneId.systemDefault()).toLocalDateTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        String message = MessageFormat.format(record.getMessage(), record.getParameters());

        return String.format("%s %s> %s\n", localDateTime.format(formatter), record.getLevel(), message);
    }
}
