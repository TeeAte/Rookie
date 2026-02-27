package Nett;

import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        System.out.println("开始发送数据...");
        // UDP通信
         //创建发送端对象
        DatagramSocket socket = new DatagramSocket();
        //用数据包封装要发送的数据
        byte[] bytes = "hello,UDP".getBytes();
        //数据，长度，发送地址,端口
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 8080);
        //发送数据
        socket.send(packet);
        //4.关闭发送端
        socket.close();

    }
}
