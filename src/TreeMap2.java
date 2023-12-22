import java.util.*;             //customer
public class TreeMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap t = new TreeMap(new MyComparator());
		
		t.put("diensh", 10);
		t.put("abi", 20);
		t.put("bhu", 30);
		t.put("raj", 40);
		System.out.println(t);
		

	}

}
class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}