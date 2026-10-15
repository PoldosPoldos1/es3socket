package barra.it;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketPermission;

public class Client {
    public static void main(String[] args) {
        try (
            Socket socket = new Socket("localhost", 5000);
            Scanner scanner = new Scanner(System.in);
            ) {

            System.out.println("CONNESSO AL SERVER");
            System.out.println("Scrivi un messaggio");
            String testo = scanner.nextLine(); 
            System.out.println(testo);

        } catch (IOException e) {
            e.getMessage();
        }
    }
}
