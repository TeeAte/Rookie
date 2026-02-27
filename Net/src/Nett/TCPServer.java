package Nett;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {// TCP服务端
    public static void main(String[] args) throws Exception {
        //监听 8080端口
        ServerSocket serverSocket = new ServerSocket(8080);//相当于酒店大堂的经理，接待客人，分配给子线程
        while (true) {
            System.out.println("服务端启动");
            Socket socket =serverSocket.accept();
            //阻塞，等待客户端链接
            System.out.println("客户端连接成功");
            InputStream inputStream = socket.getInputStream();
            // 读取数据,把流包装成数据输入流
            DataInputStream dis = new DataInputStream(inputStream);

            while (true) {
                System.out.println("内容为："+dis.readUTF());
                System.out.println("port为:"+socket.getPort());
            }
        }


    }
}
