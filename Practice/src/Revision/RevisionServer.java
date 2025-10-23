package Revision;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class RevisionServer {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket serverSocket = new ServerSocket(1234);
        Socket socket = serverSocket.accept();
        InputStream objectInput= socket.getInputStream();
        ObjectInputStream objectInputStream =new ObjectInputStream(objectInput);
        System.out.println((Employee)objectInputStream.readObject());


        // send the response
        String str = "I have got your messgae";
         OutputStream outputStream= socket.getOutputStream();
         ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
         objectOutputStream.writeObject(str);

         objectOutputStream.flush();
         objectOutputStream.close();
    }
}
