package io.txt.test;

import io.txt.reader.Reader_txt;
import io.txt.writer.Writer_txt;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import log.LogMessage;

public class Main {
	
	//PATHS (absolute for windows)
	final static String FILE_NAME = "D:\\clouds\\Drive Ilimitado\\PROJECTS_JavaSE_3PCD\\ConcurencyAndDistribution_1QuequeApp_swing\\message\\txt\\contactTEST.txt";
	final static String OUTPUT_FILE_NAME = "D:\\clouds\\Drive Ilimitado\\PROJECTS_JavaSE_3PCD\\ConcurencyAndDistribution_1QuequeApp_swing\\message\\txt\\contactTEST.txt";
	final static Charset ENCODING = StandardCharsets.UTF_8;
	
	//LOG4J LOGGER
	private static LogMessage logger = new LogMessage();
	
	/** MAIN */
	public static void main(String... aArgs) throws IOException {
		Reader_txt reader = new Reader_txt();
		Writer_txt writer = new Writer_txt();

		// treat as a small file
		List<String> lines = reader.readSmallTextFile(FILE_NAME);
		logger.getLog().debug(lines);
		lines.add("This is a line added in code.");
		writer.writeSmallTextFile(lines, FILE_NAME);

		// treat as a large file - use some buffering
		reader.readLargerTextFile(FILE_NAME);
		lines = Arrays.asList("Down to the Waterline", "Water of Love");
		writer.writeLargerTextFile(OUTPUT_FILE_NAME, lines);
	}
}
