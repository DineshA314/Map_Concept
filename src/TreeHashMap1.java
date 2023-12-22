import java.util.*;                 //dnso
public class TreeHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap t = new TreeMap();
		
		t.put(101,"dinesk");
		t.put(105,"abi");
		t.put(103,"bhu");
		t.put(106,"raj");
		t.put(102,"sri");
	//  t.put("dfsafsd","dinesk");  //cce
		//t.put(null,"dinesk"); //npe
		//t.put(101,"dineddkdsk");
		t.put(101,null);
		
		System.out.println(t);
		

	}

}
