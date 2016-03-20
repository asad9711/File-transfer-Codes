import java.io.*;
import java.net.*;
class Filese
{
	public static void main(String s[])    //Server
	{
		try(ServerSocket ssock=new ServerSocket(6500);
		Socket ss=ssock.accept();){
		
		System.out.println("client connected");
		DataOutputStream dos=new DataOutputStream(ss.getOutputStream());

		FileReader fr=new FileReader("data.txt");
		BufferedReader br=new BufferedReader(fr);
         String str=null;
	
         while(!(str=br.readLine()).equals(null))
         {
         	// str=br.readLine();
         	dos.writeUTF(str);
         	// str=br.readLine();
         	dos.flush();
         }
	}catch(Exception e)
	{
		System.out.println(e);
		e.printStackTrace();
	}
		


	}	
}
