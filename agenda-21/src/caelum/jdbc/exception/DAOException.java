package caelum.jdbc.exception;

@SuppressWarnings("serial")
public class DAOException extends RuntimeException{
	
	public DAOException() {
	}
	
	public DAOException(String message){
		super(message);
	}
	
	public DAOException(Throwable message){
		super(message);
	}

	public DAOException(String message, Throwable cause){
		super(message, cause);
	}
}
