import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Cache;
import model.Connection;
import model.RequestItem;

public class Main {
	
	private static List<Cache> cacheList;
	private static List<Connection> connectionList;
	private static List<RequestItem> requestItemList;
	private static int numberVideos, numberEndpoints, numberRequests, numberCaches, cacheSize;
	private static List<Integer> videoSizeList;
	
	private static String inputFileName = "";
	private String outputFilename = "";
	
	public static void main(String[] args) {
		// Read file.
		readFile();
		
		// Sort elements of connection list by latency ASC.
		Collections.sort(connectionList, new Comparator<Connection>() {
	        public int compare(Connection c1, Connection c2) {

	            Integer l1 = c1.getLatency();
	            Integer l2 = c2.getLatency();
	            
	            int sComp = l1.compareTo(l2);

	            return -1 * sComp; // TODO - Check result
	        }
		});
		
		for (Connection connection : connectionList) {
			System.out.println(connection.getLatency());
		}
		
		// Instantiate requestList.
		
		// Sort requestList by amountVideos * datacenterLatency / videoSize.
		
		// Algorithm.
		
		// Write file.
	}
	
	private static void readFile() {
		// Try to read the file. In case it fails, the exception is caught.
		try {
			String line; // Variable where each line will be registered.
			String [] data; // Array of strings that contains the different cells.
			
			// Open and read the input file.
			FileReader read = new FileReader(inputFileName);
			BufferedReader bufferedReader = new BufferedReader(read);
			
			// Save data of the first line.
			line = bufferedReader.readLine(); // Read the next line.
			data = line.split(" ");
			
			// Instantiate object to return.
			numberVideos = Integer.parseInt(data[0]);
			numberEndpoints = Integer.parseInt(data[1]);
			numberRequests = Integer.parseInt(data[2]);
			numberCaches = Integer.parseInt(data[3]);
			cacheSize = Integer.parseInt(data[4]);
			
			// Get video sizes.
			line = bufferedReader.readLine(); // Read the next line.
			data = line.split(" ");
			
			videoSizeList = new ArrayList<Integer>();
			
			for (int i = 0; i < numberVideos; i++) {
				videoSizeList.add(Integer.parseInt(data[i]));
			}
			
			bufferedReader.close();

		} catch(IOException e) {
			System.out.println("The file does not exist!");
		}
	}

}
