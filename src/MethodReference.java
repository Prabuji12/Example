import java.util.ArrayList;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		names.add("gokul");
		names.add("prabhu");
		names.add("sethu");
		names.add("siva");
		names.forEach(System.out::println);

	}

}
