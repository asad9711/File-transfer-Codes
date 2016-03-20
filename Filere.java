import java.io.*;
import java.net.*;
class Filere
{
	public static void main(String s[])      //Client
	{
		
		try(Socket cs=new Socket("localhost",6500);){
			
		DataInputStream cdis=new DataInputStream(cs.getInputStream());
		// FileWriter fw=new FileWriter("dat5.txt");
		FileWriter fw=new FileWriter(new File("F:\\dat6.txt"));

		PrintWriter pw=new PrintWriter(fw);
		String str=null;
		
		while(!(str=cdis.readUTF()).equals(null))
		{
			// str=cdis.readUTF();
			pw.println(str);
			// str=cdis.readUTF();
			pw.flush();
		}
		
	}catch(Exception e)
	{
		System.out.println(e);
		e.printStackTrace();
	}
}
}
