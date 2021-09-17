import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class FigurinhaServer {
  private final int PORT = 8005;
  private ServerSocket serverSocket;

  public void start() throws IOException {
    System.out.println("Servidor iniciado na porta " + PORT);
    serverSocket = new ServerSocket(PORT);
    clientConnectionLoop();
  }

  private void clientConnectionLoop() throws IOException {
    while(true) {
      Socket clientSocket = serverSocket.accept();
      System.out.println("Client " + clientSocket.getRemoteSocketAddress() + " conectou!");
    }
  }
  public static void main(String[] args) {
    try {
      FigurinhaServer server = new FigurinhaServer();
      server.start();
    } catch (IOException ex) {
      System.out.println("Error ao iniciar o servidor: " + ex.getMessage());
    }
  } 
}