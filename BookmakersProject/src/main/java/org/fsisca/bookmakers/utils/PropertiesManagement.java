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
package org.fsisca.bookmakers.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.fsisca.bookmakers.exception.PropertiesNotFoundException;

/**
 * @author franksisca
 *
 */
public class PropertiesManagement {

	private final static Logger logger = Logger.getLogger(PropertiesManagement.class);
	private static Properties prop;

	/**
	 * 
	 */
	private PropertiesManagement() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return
	 * @throws IOException
	 * 
	 */
	private static void init() {
		// TODO Auto-generated constructor stub
		try {
			prop = new Properties();
			logger.debug("Load properties...");
			InputStream in = PropertiesManagement.class.getClassLoader().getResourceAsStream("application.properties");
			prop.load(in);
			in.close();
			logger.debug("Properties has been loaded!");
		} catch (IOException exp) {
			exp.printStackTrace();
		}
	}

	public static String getProperty(String key) throws PropertiesNotFoundException {
		if (prop == null)
			init();
		logger.debug("Trying to load " + key + "...");
		if (prop.containsKey(key)) {
			logger.debug(key + " found!");
			return prop.getProperty(key);
		} else {
			logger.debug(key + " not found! Load DEFAULT_VALUE");
			throw new PropertiesNotFoundException("Key not found: " + key);
		}
	}

}
