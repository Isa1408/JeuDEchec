public class DeplacementInvalideException extends RuntimeException {
    public DeplacementInvalideException() {
    }

    public DeplacementInvalideException(String message) {
        super(message);
    }

    public DeplacementInvalideException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeplacementInvalideException(Throwable cause) {
        super(cause);
    }

    public DeplacementInvalideException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
