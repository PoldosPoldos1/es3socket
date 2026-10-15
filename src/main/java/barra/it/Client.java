package barra.it;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("CONNESSO AL SERVER");
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
