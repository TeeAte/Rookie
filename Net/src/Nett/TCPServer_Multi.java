package Nett;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer_Multi {

    public static void main(String[] args) throws  Exception{
    //实现 TCP 多收多发
    ServerSocket serverSocket = new ServerSocket(8080);
    while (true){
        Socket socket = serverSocket.accept();//等待客户端连接,连接成功之后，返回一个socket
        System.out.println("一个客户端连接成功,"+ socket.getRemoteSocketAddress());
        new TCPServerReader(socket).start();
    }
    }}
