package entities_exceptions;

public class ClientException extends RuntimeException {
    public ClientException(String message) {
        super(message);
    }
}
