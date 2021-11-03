package ejercicio3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;


public class MyHandler implements HttpHandler {

	//Atender requerimiento de cliente
	@Override
	public void handle(HttpExchange exchange) throws IOException {
		//HttpExchange encapsula el requerimiento y la respuesta HTTP
		
		InputStream input = exchange.getRequestBody();
		input.read(); //lee la request
		String response = "<h1>Hola desde JAVA</h1>";
		exchange.sendResponseHeaders(200,response.length());
		OutputStream output = exchange.getResponseBody();
		output.write(response.getBytes());
		output.close();

	}

}
