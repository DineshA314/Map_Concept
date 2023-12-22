import java.util.*;
public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap  m = new HashMap();
		
		m.put("Abi",700);
		m.put("Bhuvane",800);
		m.put("Dinesh",200);
		m.put("Gokul",500);
		
		System.out.println(m);
		System.out.println(m.put("Dinesh", 10000));
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		
		System.out.println(s1);
		
		//one by one for useing Iteration
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry)itr.next();
			
			System.out.println(m1.getKey()+"......"+m1.getValue());
			
			if(m1.getKey().equals("Abi"))
			{
				m1.setValue(30000);
			}
		}
		System.out.println(m);

	}

}
