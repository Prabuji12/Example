import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {		
		List<String> names = new ArrayList<String>();
		names.add("prabhu");names.add("siva");names.add("ravi");		
		LambdaExpression ex = new LambdaExpression();
		ex.sortName(names);
		System.out.println(names);
		MathOperation addition = (a,b) -> a+b;
		MathOperation subtraction = (int a,int b) -> a-b;
		MathOperation multiplication = (int a,int b) -> {return a*b;};
		MathOperation division = (a,b) -> {return a/b;};
		System.out.println("10 + 5 = "+ex.operator(10, 5, addition));
		System.out.println("10 - 5 = "+ex.operator(10, 5, subtraction));
		System.out.println("10 * 5 = "+ex.operator(10, 5, multiplication));
		System.out.println("10 / 5 = "+ex.operator(10, 5, division));
	}	 
    public void sortNames(List<String> names) {
		Collections.sort(names, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}				
		});
	}	
	public void sortName(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}
    private int operator(int a,int b,MathOperation mathOperation) {
    	return mathOperation.operation(a, b);
    }
	
}
