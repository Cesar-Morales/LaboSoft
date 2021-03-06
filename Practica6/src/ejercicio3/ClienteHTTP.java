package ejercicio3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClienteHTTP {

	public static void main(String[] args) {
		try {
			String url = "http://localhost:8888/";
			URL obj = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
			conn.setReadTimeout(5000);
			conn.addRequestProperty("Accept-Language", "en-US,en;q=0.8");
			conn.addRequestProperty("User-Agent", "Mozilla");
			conn.addRequestProperty("Referer", "google.com");
			
			System.out.println("Request URL ..." + url);
			
			boolean redirect = false;
			int status = conn.getResponseCode();
			if(status!=HttpURLConnection.HTTP_OK) {
				if(status==HttpURLConnection.HTTP_MOVED_PERM ||
					status==HttpURLConnection.HTTP_MOVED_TEMP||
						status==HttpURLConnection.HTTP_SEE_OTHER) 
					redirect = true;
			}
			
			System.out.println("Response Code ... " + status);
			
			if(redirect) {
				
				String newUrl = conn.getHeaderField("Location");
				
				String cookies = conn.getHeaderField("Set-Cookie");
				
				conn = (HttpURLConnection) new URL(newUrl).openConnection();
				conn.setRequestProperty("Cookie", cookies);
				conn.addRequestProperty("Accept-Language", "en-US,en;q=0.8");
				conn.addRequestProperty("User-Agent", "Mozilla");
				conn.addRequestProperty("Referer", "google.com");
				
				System.out.println("Redirect to URL: " + newUrl);
			}
			
			BufferedReader input = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer html = new StringBuffer();
			
			while((inputLine = input.readLine()) != null) {
				html.append(inputLine);
			}
			input.close();
			
			System.out.println("Contenido URL .. \n" + html.toString());
			System.out.println("Hecho");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
