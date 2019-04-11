import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Task t = new Task();
		System.out.println("Tell me the HouseCount - ");
		int houseCount = sc.nextInt();
		System.out.println("Provide value for all Houses - ");
		List<Integer> housevalue = new ArrayList<Integer>();
		for (int i = 0; i < houseCount; i++) {
			housevalue.add(sc.nextInt());
		}
		System.out.println(housevalue);
		//int maxValue = housevalue.get(housevalue.size() - 1);
		int maxValue = Collections.max(housevalue);
		// System.out.println(maxValue);
		List<Integer[]> joinedvalue = new ArrayList<Integer[]>();
		List<Integer> arraylist = new ArrayList<Integer>();
		List<Integer> finalvalue = new ArrayList<Integer>();
		for (int i = 0; i < houseCount; i++) {
			for (int j = i + 2; j < houseCount; j++) {
				if (i == j) {
				} else if ((j == i + 1) || (j == i - 1)) {
				} else {
					Integer a[] = { i, j, housevalue.get(i) + housevalue.get(j) };
					joinedvalue.add(a);
					arraylist.add(housevalue.get(i) + housevalue.get(j));
				}
			}
		}
		System.out.println(arraylist);
		//t.sortValue(arraylist);
		//int maxjoinedvalue = arraylist.get(arraylist.size() - 1);
		int maxjoinedvalue = Collections.max(arraylist);
		// System.out.println(maxjoinedvalue);
		if (maxjoinedvalue > maxValue) {
			for (Integer[] value : joinedvalue) {
				if (value[2] == maxjoinedvalue) {
					finalvalue.add(Integer.parseInt(
							Integer.toString(housevalue.get(value[1])) + Integer.toString(housevalue.get(value[0]))));
				}
			}
			t.sortValue(finalvalue);
			int max = finalvalue.get(finalvalue.size() - 1);
			System.out.println("Output is " + max);
		} else
			System.out.println("Output is " + maxValue);
	}

	public void sortValue(List<Integer> value) {
		//Collections.sort(value);
		//Collections.sort(value,Collections.reverseOrder());
		Collections.sort(value, (s1, s2) -> s1.compareTo(s2));
	}

}
