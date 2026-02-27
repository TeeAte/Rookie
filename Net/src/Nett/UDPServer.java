package Nett;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
    // UDP服务端
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        //1.创建接受端对象(接数据的人)
        DatagramSocket socket = new DatagramSocket(8080);
        //2.创建数据包对象(盘子)，接收数据
        byte[] bytes = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        //3.接受数据
        socket.receive(packet);
        int len = packet.getLength();
        String data= new String (bytes,0,len);
        System.out.println("接收到的结果:"+data);
        //获取 Client 的 ip
        String ip = packet.getAddress().getHostAddress();
        System.out.println("Client 的 ip:"+ip);
    }
}
