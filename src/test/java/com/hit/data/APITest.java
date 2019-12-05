package com.hit.data;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.opencsv.CSVWriter;

public class APITest {

//public static void main(String[] args) throws IOException {

		@Test
		/*
		 * write to result_upcoming.csv
		 */
		public void writeToCSV() throws IOException {
		String csv = "resources/result_upcoming.csv";
		CSVWriter writer  = new CSVWriter (new FileWriter(csv));
		
		List<String[]> data = new ArrayList<String[]>();
		data.add(new String[] {"firstTeam", "secondTeam", "startDate", "startTime", "tournament"});
		data.add(new String[] {"Liverpool", "Arsenal", "12.12.2019", "10:15:30", "Euro"});
		data.add(new String[] {"Manchester United", "Chelsea", "24.12.2019", "10:15:30", "Euro"});
	
		writer.writeAll(data);
		writer.close();
		}
		
		
		/*
		 * write to resultplayed.csv
		 */
		public void writeToCSV1() throws IOException {
		String csv1 = "resources/resultplayed.csv";
		CSVWriter writer1  = new CSVWriter (new FileWriter(csv1));
		
		List<String[]> data1 = new ArrayList<String[]>();
		data1.add(new String[] {"firstTeam", "secondTeam", "startDate", "score", "tournament"});
		data1.add(new String[] {"Liverpool", "Arsenal", "12.12.2019", "3:0", "Euro"});
		data1.add(new String[] {"Manchester United", "Chelsea", "24.12.2019", "3:3", "Euro"});
	
		writer1.writeAll(data1);
		writer1.close();
		}
		
		
		/*
		 * filtering matches by team
		 */
		 //for borders 
		@Test
	    void contextLoads() {
	    }
		
}
		


