import java.io.*;
import java.net.*;
class Filere
{
	public static void main(String s[])      //Client
	{
		
		try(Socket cs=new Socket("localhost",6500);){
			
		DataInputStream cdis=new DataInputStream(cs.getInputStream());
		FileWriter fw=new FileWriter("dat5.txt");
		PrintWriter pw=new PrintWriter(fw);
		String str=" ";
		// do{
		// 	str=cdis.readUTF();
		// 	pw.println(str);
		// 	pw.flush();
		// }while(!str.equals(null));

		while(!str.equals(null))
		{
			str=cdis.readUTF();
			pw.println(str);
			str=cdis.readUTF();
			pw.flush();
		}
		
	}catch(Exception e)
	{
		System.out.println(e);
		e.printStackTrace();
	}
}
}