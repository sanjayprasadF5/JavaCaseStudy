package com.sanjay.Washer.Errors;

@SuppressWarnings("serial")
public class WasherNotFoundExceptions extends Exception {

	 public WasherNotFoundExceptions() {
	        super();
	    }

	    public WasherNotFoundExceptions(String message) {
	        super(message);
	    }

	    public WasherNotFoundExceptions(String message, Throwable cause) {
	        super(message, cause);
	    }

	    public WasherNotFoundExceptions(Throwable cause) {
	        super(cause);
	    }

	    protected WasherNotFoundExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	        super(message, cause, enableSuppression, writableStackTrace);
	    }
}
