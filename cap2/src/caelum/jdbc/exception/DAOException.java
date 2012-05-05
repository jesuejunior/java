package caelum.jdbc.exception;

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
