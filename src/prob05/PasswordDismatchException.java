package prob05;

public class PasswordDismatchException extends Exception{
	public PasswordDismatchException()  {
		super("PasswordDismatchException");
	}
	
	public PasswordDismatchException(String message) {
		super(message);
	}
}
