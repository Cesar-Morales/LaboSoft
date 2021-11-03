package ejercicio3;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

@Servidor(archivo="log.txt")
public class ServidorHTTP {
		
	@Invocar
	public static void main(String[] args){
		HttpServer server;
		try {
			server = HttpServer.create(new InetSocketAddress(8080),0);
			server.createContext("/", new MyHandler());
			
			//crea un default executor de 1 thread
			server.setExecutor(null);
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
}
