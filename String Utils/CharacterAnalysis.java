import java.util.Scanner;
import java.util.TreeMap;

public class CharacterAnalysis {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		TreeMap<Character, Integer> tMap = new TreeMap<>();

		char[] toAnalyse = sc.nextLine().toLowerCase().toCharArray();

	    for (Character character : "abcdefghijklmnopqrstuvwxyz".toCharArray() )
	    {
	    	tMap.put(character, 0); 
	    	System.out.print(character + " ");
	    }
	    
	    for(char character : toAnalyse) {
	    	if(tMap.containsKey(character))
	    	{
	    		tMap.put(character, (tMap.get(character) + 1));
	    	}
	    }
	    
	    System.out.println("");
	    
	    for(Character character : "abcdefghijklmnopqrstuvwxyz".toCharArray())
	    {
	    	System.out.print(tMap.get(character) + " ");
	    }
	    
	   sc.close();
	}
}