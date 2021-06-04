/**
 * 
 */
package fr.eni.encheres.dal;

import java.io.IOException;
import java.util.Properties;

/**
 * Classe en charge
 * @author Vente
 * @version Encheres - v1.0
 * @date 4 juin 2021 - 20:04:38
 */
public class Settings {
	
private static Properties properties;

	static {
		properties = new Properties();
		try {
			properties.load(Settings.class.getResourceAsStream("settings.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String getProperty(String key)
	{
		return properties.getProperty(key, null);
	}

}
