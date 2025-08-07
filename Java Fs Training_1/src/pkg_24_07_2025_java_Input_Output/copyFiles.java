package pkg_24_07_2025_java_Input_Output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyFiles {

	public static void main(String[] args)throws IOException {
		FileInputStream in =null;
		FileOutputStream out=null;
		try {
			in=new FileInputStream("C:\\Users\\SUDHANSHU\\eclipse-workspace\\Java Fs Training\\src\\javaIO\\File1.java");
			out=new FileOutputStream("C:\\\\Users\\\\SUDHANSHU\\\\eclipse-workspace\\\\Java Fs Training\\\\src\\\\javaIO\\output.txt");
			int c;
			while ((c=in.read())!=-1) {
				out.write(c);
				
			}
		
			
		} finally {
			if (in !=null) {
				in.close();
			}
			if (out !=null) {
				out.close();
				
			}
				
			}
		}
		

	}


