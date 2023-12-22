import java.util.*;

public class IdentityHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IdentityHashMap m = new IdentityHashMap();
		
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		
		m.put(I1,"dinesh");
		m.put(I1,"abi");
		
		System.out.println(m);

	}

}
