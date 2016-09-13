import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AssignmentTwo {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String EnteredString, StringToMatch;
		
		System.out.println("Enetr a String :");
		EnteredString = br.readLine();
		
		System.out.println("Enter the substring to be searched :");
		StringToMatch = br.readLine();
		
		if(EnteredString.toLowerCase().contains(StringToMatch.toLowerCase())){
			System.out.println("The Substring '" + StringToMatch + "' is found in the string '" + EnteredString + "'");
		}
		
		else{
			System.out.println("The Substring '" + StringToMatch + "' is not found in the string '" + EnteredString + "'");
		}
	}

}
