/**
 * Dear Maintainer:
 * 
 * When I wrote this code, only I and God knew what it was.
 * Now, only God knows!!!
 * 
 * So, if you are done trying to "optimeze" this routine (and failed), 
 * please increment the following counter as a warning to the next guy:
 * 
 * total_hours_wasted_here: 10
 * 
 */
package org.fsisca.bookmakers.exception;

/**
 * @author franksisca
 *
 */
public class PropertiesNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8212617844484315498L;

	public PropertiesNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PropertiesNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public PropertiesNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PropertiesNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PropertiesNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
