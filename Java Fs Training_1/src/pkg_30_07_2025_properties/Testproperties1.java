package pkg_30_07_2025_properties;
//Both Value and Key Are Strings
import java.util.Properties;

public class Testproperties1 {

	public static void main(String[] args) {
		Properties Name=new Properties();
		Properties merasystem=System.getProperties();
		Name.put("sudhanshu", "Coder");
		Name.put("Mansi", "Lazy");
		Name.put("Pranay", "Bhagat G");
		Name.put("Gargee", "Girgit");
		System.out.println(Name);
		System.out.println(Name.get("sudhanshu"));
		
		System.out.println("\n<-------------The Properties of my System are------------->");
		merasystem.list(System.out);
		System.out.println("Dekh Kaise Acces krte hai to apun ne ky ky nikala to ");
		//System.out.println(System.getProperty("java Ka version :" +System.getProperty(java.version));
		System.out.println(System.getProperty("os.name"));
		
	}

}
