

import java.io.*;
import java.net.*;

public class ChatServer 
{

    public static void main(String[] args) throws Exception
    {
        ServerSocket serverSocket = new ServerSocket(3000);
        System.out.println("Server  ready for chatting");
        Socket socket = serverSocket.accept(); 
        
        // reading from keyboard
        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
        
        // sending to client
        OutputStream os = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(os, true);

        // receiving from server
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String receiveMessage, sendMessage;
       
        while (true) 
        {
            if ((receiveMessage = br.readLine()) != null) 
            {
                System.out.println(receiveMessage);
            }
            sendMessage = keyRead.readLine();
            pw.println(sendMessage);
            pw.flush();
        }
    }
}

