import java.io.*;
import java.net.*;
class FileReceiverr
{

public static void main(String s[])
{
	try(Socket csock=new Socket("localhost",6000);)
	{
	// BufferedReader br=new BufferedReader(new InputStreamReader(csock.getInputStream()));
    InputStreamReader csr=new InputStreamReader(csock.getInputStream());
    BufferedReader br=new BufferedReader(csr);


	// FileOutputStream fos=new FileOutputStream(new File("data2.txt"));
	FileWriter fw=new FileWriter("data2.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	PrintWriter pw=new PrintWriter(bw);
	// OutputStreamWriter osw=new OutputStreamWriter(fos);
	// BufferedWriter bw=new BufferedWriter(osw);
    String str=null;
	while((str=br.readLine())!=null)
	{
		// bw.write(str);
		pw.println(str);
	}
	br.close();fw.close();bw.close();pw.close();
	// csock.close();
}catch(Exception e)
{
	System.out.println(e);
}
}
}
