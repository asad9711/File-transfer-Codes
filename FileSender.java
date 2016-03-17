import java.io.*;
import java.net.*;
class FileSender
{

public static void main(String s[])
{
	// FileOutputStream fos=new FileOutputStream(new File("data.txt"));
	try(ServerSocket ssock=new ServerSocket(6000);)
	{
		Socket ss=ssock.accept();
		System.out.println("client connected");
		// FileInputStream fis=new FileInputStream(new File("data.txt"));
		// InputStreamReader isr=new InputStreamReader((InputStream)new FileReader("data.txt"));
		InputStreamReader isr=new InputStreamReader(new FileInputStream("data.txt"));

		// BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedReader br=new BufferedReader(isr);
		
		// DataInputStream dis=new DataInputStream(ss.getInputStream());
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(ss.getOutputStream()));
      String str="asd";
		while((str=br.readLine())!=null)
         {
         	bw.write(str);
         	// bw.flush();
         }
      // ssock.close();
	}catch(Exception e)
	{
		System.out.println(e);
	}

}	
}
