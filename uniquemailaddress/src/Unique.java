import java.util.HashSet;
import java.util.Set;

public class Unique {
	
	// solution for this problem starts with using set 
	// 1 set can be used to store unique email address
	// we loop through the array of email address 
	// 
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
        	
        	//start it is the beginning of the email and then discard everything after +
            int start = email.indexOf("+");
            // this is useful for the domainame
            int end = email.indexOf("@");
            
            
//using substrting
            String localname = email.substring(0, start);
            //using replace method for string
            localname = localname.replace(".", "");
            
            String domainame = email.substring(end, email.length());
            //adding the email address (localname and domainame) to the set
            set.add(localname + domainame);
        }

// getting the size of the set
        return set.size();
    }
    
    public static void main(String[] args) {
       Unique l = new Unique ();

       String [] d = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};        
        		
        System.out.println(l.numUniqueEmails(d));    
        
    }

    

}