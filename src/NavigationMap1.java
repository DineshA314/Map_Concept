import java.util.TreeMap;
public class NavigationMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> t = new TreeMap<String, String>();
		
		t.put("a","apple");
		t.put("c","cat");
		t.put("d","dog");
		t.put("b","banana");
		t.put("g","gun");
		
		System.out.println(t);
		System.out.println(t.ceilingKey("c"));
		System.out.println(t.higherKey("e"));
		System.out.println(t.floorKey("e"));
		System.out.println(t.lowerKey("e"));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		System.out.println(t.descendingMap());

		System.out.println(t);





	}

}
