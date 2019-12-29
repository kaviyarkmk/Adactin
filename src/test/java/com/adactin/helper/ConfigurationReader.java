package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties ps;

	public ConfigurationReader() throws IOException {
		File f = new File("C:\\Java\\workspace_Project\\Adactincucumber\\src\\test\\java\\com\\Configuration\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		ps = new Properties();
		ps.load(fis);

	}

	public static String browsername() {
		String browsername = ps.getProperty("browsername");
		return browsername;

	}

	public static String getUrl() {
		String Url = ps.getProperty("Url");
		return Url;

	}
}
