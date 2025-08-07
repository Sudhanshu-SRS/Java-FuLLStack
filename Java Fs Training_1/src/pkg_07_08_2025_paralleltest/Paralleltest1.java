package pkg_07_08_2025_paralleltest;
//parallel stream example woth parallel processing
import java.util.stream.IntStream;

public class Paralleltest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IntStream.range(1, 1000).forEach(n->System.out.println(n));
		IntStream.range(1, 1000).parallel().forEach(System.out::println);
	}

}
