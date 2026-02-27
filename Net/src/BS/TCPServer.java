package BS;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {// TCP服务端
    public static void main(String[] args) throws Exception {
        //监听 8080端口
        ServerSocket serverSocket = new ServerSocket(8080);//相当于酒店大堂的经理，接待客人，分配给子线程

        while (true) {
            Socket socket =serverSocket.accept();
            //阻塞，等待客户端链接
            System.out.println("客户端连接成功,ip为:"+socket.getLocalSocketAddress());
            new TCPServerReader(socket).start();
        }


    }
}
