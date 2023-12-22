import java.util.*;
class Temp
{
	public String toString()
	{
		return "temp";
	}
	public void finialize()
	{
		System.out.println("finialize method call");
	}
}
public class WeakHashMap1 {
public static void main(String [] args) throws Exception {
	
	WeakHashMap m = new WeakHashMap(); 
	
	Temp t = new Temp();
	
	m.put(t,"dinesh");
	System.out.println(m);
	t =null;
	System.gc();
	Thread.sleep(5000);
	System.out.println(m);
}
}
