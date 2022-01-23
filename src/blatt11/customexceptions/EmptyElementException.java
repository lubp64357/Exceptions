package blatt11.customexceptions;

import java.util.NoSuchElementException;

public class EmptyElementException extends NoSuchElementException{
	
	public EmptyElementException(String message) {
		super(message);
	}

}
