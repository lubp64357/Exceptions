package blatt11.customexceptions;

public class EmptyStatisticException extends NullPointerException{
	public EmptyStatisticException(String msg) {
		super(msg);
	}
}
