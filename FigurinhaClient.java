import java.net.Socket;
import java.io.IOException;
import FigurinhaServer;

public class FigurinhaClient {
  private final String SERVER_ADRESS = "127.0.0.1";
  private Socket clientSocket;

  public void start() throws IOException {
    clientSocket = new Socket(SERVER_ADRESS, 8005);
  }

  public static void main(String[] args) {
    try {
      FigurinhaClient client = new FigurinhaClient();
      client.start();
    } catch (IOException e) {
      System.out.println("Error ao iniciar client: " + e.getMessage());
    }
  }
}