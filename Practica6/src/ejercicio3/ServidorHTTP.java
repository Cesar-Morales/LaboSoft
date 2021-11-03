package ejercicio3;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

@Servidor(archivo="log.txt")
public class ServidorHTTP {
		
	@Invocar
	public static void main(String[] args){
		final int PORT = 8895;
		HttpServer server;
		try {
			server = HttpServer.create(new InetSocketAddress(PORT),0);
			server.createContext("/", new MyHandler());
			
			//crea un default executor de 1 thread
			server.setExecutor(null);
			server.start();
			System.out.println("Servidor corriendo en http://localhost:"+PORT);
			//server.stop(PORT);
			//obtener ip de los clientes
			//leer: https://mkyong.com/Java/how-to-get-client-ip-address-in-Java/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
}
