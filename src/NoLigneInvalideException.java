
public class NoLigneInvalideException extends RuntimeException {
    public NoLigneInvalideException() {
    }

    public NoLigneInvalideException(String message) {
        super(message);
    }

    public NoLigneInvalideException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoLigneInvalideException(Throwable cause) {
        super(cause);
    }

    public NoLigneInvalideException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
