package pkg_28_07_2025_stream;

import java.util.Arrays;

public class TestStream1 {

	public static void main(String[] args) {
		int[] marks= {98,99,96,92,94,92,100};
		System.out.println("The Maximum Num IS "+Arrays.stream(marks).max().getAsInt());
		System.out.println("The Minimum Num IS "+Arrays.stream(marks).min().getAsInt());

	}

}
