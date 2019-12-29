package com.adactin.helper;

import java.io.IOException;

import com.adactin.helper.ConfigurationReader;

import freemarker.core.ReturnInstruction.Return;

public class FileReaderManager {

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}

	public ConfigurationReader getcrInstance() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}

}