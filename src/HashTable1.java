import java.util.*;
public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable h = new Hashtable();
		h.put(new Temp34(5), "A");
		h.put(new Temp34(2), "B");
		h.put(new Temp34(6), "C");
		h.put(new Temp34(15), "D");
		h.put(new Temp34(23), "E");
		h.put(new Temp34(16), "F");
		System.out.println(h);
	}

}
class Temp34
{
	int i;
	Temp34(int i)
	{
		this.i = i;
	}
	public int Hashcode()
	{
		return i;
	}
	public String toString()
	{
		return i+"";
	}
}
