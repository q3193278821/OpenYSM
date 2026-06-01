package rip.ysm.security;

import java.io.Serial;

public class YSMParseException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public YSMParseException(String message) {
        super(message);
    }

    public YSMParseException(String message, Throwable cause) {
        super(message, cause);
    }
}
