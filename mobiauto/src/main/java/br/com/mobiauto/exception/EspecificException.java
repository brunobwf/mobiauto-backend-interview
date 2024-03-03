package br.com.mobiauto.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EspecificException extends Exception {
	private static final long serialVersionUID = 1L;
	private String errorMessage;
	private HttpStatus httpStatus;
	
	public EspecificException(String errorMessage, HttpStatus httpStatus) {
		super(errorMessage);
		this.errorMessage = errorMessage;
		this.httpStatus = httpStatus;
	}


}
