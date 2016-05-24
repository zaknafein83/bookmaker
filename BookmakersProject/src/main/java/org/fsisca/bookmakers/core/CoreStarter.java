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
package org.fsisca.bookmakers.core;

import org.fsisca.bookmakers.exception.PropertiesNotFoundException;
import org.fsisca.bookmakers.utils.PropertiesManagement;

/**
 * @author franksisca
 *
 */
public class CoreStarter {

	/**
	 * @param args
	 * @throws PropertiesNotFoundException 
	 */
	public static void main(String[] args) throws PropertiesNotFoundException {
		System.out.println("Welcome");
		System.out.println(PropertiesManagement.getProperty("jdbc.url"));
	}

}
