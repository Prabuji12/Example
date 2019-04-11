import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		rand.ints().limit(10).forEach(System.out::println);
		rand.ints().limit(10).sorted().forEach(System.out::println);
		List<String> strings = Arrays.asList("abc", "bc", "efg", "", "thy");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		List<Integer> numbers = Arrays.asList(1,4,2,6,8);
		List<Integer> squarelist = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
		int stringempty = (int) strings.stream().filter(string->string.isEmpty()).count();
		System.out.println(filtered);
		System.out.println(squarelist);
		System.out.println(stringempty);		
	}
}
