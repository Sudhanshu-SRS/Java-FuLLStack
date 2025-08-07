/*IO input output (nio)
type of operations -read write others type of data- byte char others type of access -sequential random serialization-deserialization
create a handler that is ref to an existing file or folder
abstract classes are there-Reader Writer InputStream(read) OutputStream(writer
*/
package pkg_24_07_2025_java_Input_Output;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBufferedReader1 {

	public static void main(String[] args) {
		String s1=null;
		String s2=null;
		int a=0,b=0;
		
		try {
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
			System.out.println("Please Enter NUmber 1");
			s1=br.readLine();
			a=Integer.parseInt(s1);
			System.out.println("Please Enter NUmber 2");
			s2=br.readLine();
			b=Integer.parseInt(s2);	
			int sum=a+b;
			System.out.println("The Sum of Number Is :"+sum);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
