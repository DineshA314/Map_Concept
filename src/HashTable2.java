import java.util.Hashtable;
public class HashTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable h = new Hashtable(25);
		h.put(new Temp33(5), "A");
		h.put(new Temp33(2), "B");
		h.put(new Temp33(6), "C");
		h.put(new Temp33(15), "D");
		h.put(new Temp33(23), "E");
		h.put(new Temp33(16), "F");
		System.out.println(h);
	}

}
class Temp33
{
	int i;
	Temp33(int i)
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

