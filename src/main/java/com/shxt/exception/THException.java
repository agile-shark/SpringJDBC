package com.shxt.exception;

public class THException extends RuntimeException {

	public THException() {
		super();
	}

	public THException(String message, Throwable cause) {
		super(message, cause);
	}

	public THException(String message) {
		super(message);
	}

	public THException(Throwable cause) {
		super(cause);
	}

}
