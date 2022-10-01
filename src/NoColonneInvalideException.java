

public class NoColonneInvalideException extends RuntimeException {
    public NoColonneInvalideException() {
    }

    public NoColonneInvalideException(String message) {
        super(message);
    }

    public NoColonneInvalideException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoColonneInvalideException(Throwable cause) {
        super(cause);
    }

    public NoColonneInvalideException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
