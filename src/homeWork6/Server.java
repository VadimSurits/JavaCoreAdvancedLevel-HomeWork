package homeWork6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private final int PORT = 8189;
    static ServerSocket server;
    static Socket socket;
    private DataInputStream incoming;
    private DataOutputStream outcoming;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Server().run();
    }

    public void run() {
        try {
            server = new ServerSocket(PORT);
            System.out.println("Сервер включён!");

            socket = server.accept();
            System.out.println("К серверу подключился клиент!");

            incoming = new DataInputStream(socket.getInputStream());
            outcoming = new DataOutputStream(socket.getOutputStream());

            Thread serverThread = new Thread(() -> {
                while (true) {
                    clientMsg(scanner.nextLine());
                }
            });
            serverThread.setDaemon(true);
            serverThread.start();

            while (true) {
                String text = incoming.readUTF();
                if (text.equals("/end")) {
                    clientMsg("/end");
                    break;
                }
                System.out.println("Клиент: " + text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                incoming.close();
                outcoming.close();
                socket.close();
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Сервер выключен!");
    }

    public void clientMsg(String text) {
        try {
            outcoming.writeUTF(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
