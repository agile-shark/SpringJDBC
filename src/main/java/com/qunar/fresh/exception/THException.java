package com.qunar.fresh.exception;

public class THException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
