import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Server_Connect {

	public static void main(String[] args) throws IOException {
		boolean check = false;
		int realport;
		String port=null;
		System.out.println("Enter the port...");
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		port = reader.readLine();
		while (!check) {
		try {
			realport = Integer.parseInt(port);
			
				if (realport > 1024 && realport < 35635) {
					System.out.println("It's OK --> " + realport);
					check = true;
				} else {
					System.out.println("dwswe timi apo 1024 mexri 35635.");
					port = reader.readLine();
					//System.out.println();
				}
		} catch (NumberFormatException e) {
			System.out.println("dwswe timi apo 1024 mexri 35635.");					
			port = reader.readLine();
		//	System.out.println();
		} catch (IOException e) {
			System.out.println("dwswe timi apo 1024 mexri 35635.");					
			port = reader.readLine();
		//	System.out.println();
		}
		} 

	}

}
