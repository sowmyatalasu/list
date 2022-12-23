import java.util.ArrayList;
import java.util.Arrays;

public class List {

	
	public static void main(String[] args)
	{

		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(20,
       30,
        40,50));
        
		int i = 0;
		System.out.println(al.size());

		System.out.println("while loop:");
		while (al.size() > i) {
			System.out.println(al.get(i));
			i++ ;
		}
		System.out.println("Advanced for loop:"); 
		for (Integer k : al)
 			System.out.println(k);   
		System.out.println("for loop:");
		for (int j = 0; j < al.size(); j++)
           System.out.println(al.get(j)); 
		
	}
}
