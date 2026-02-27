package Nett;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class TCPServerReader extends Thread{
    private Socket socket;
    public TCPServerReader(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {//读取输入流
            InputStream inputStream = socket.getInputStream();
            DataInputStream dis = new DataInputStream(inputStream);
            while (true){
                //读取数据
                String msg = dis.readUTF();
                System.out.println("服务端收到消息:" + msg);
            }
        } catch (Exception e) {
            System.out.println("客户端下线了");
        }
    }
}
