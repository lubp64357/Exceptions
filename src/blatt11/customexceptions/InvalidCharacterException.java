package blatt11.customexceptions;

public class InvalidCharacterException extends IllegalArgumentException {
	
	
	public InvalidCharacterException(String message) {
		super(message);
	}
}
