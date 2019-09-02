
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		   String str = br.readLine().trim();
		   String ans=new solve().removePair(str);
		   if(ans.length()<=0)
		   System.out.println("Empty String");
		   
		   else
		   System.out.println(ans);
		}
	}
}

/*This is a function problem.You only need to complete the function given below*/

class solve
{
    // Function to print string after removing consecutive duplicates
    public static String removePair(String str){
        // your code here
        // String myString;
        // char[] charArray = str.toCharArray();
        
        // Queue<Character> s = new Stack<Character>();
        // s.push(charArray[0]);
        // for(int i =1;i<str.length();i++){
            
        //     if(charArray[i-1]==charArray[i]){
        //         s.pop();
        //     }
        //     s.push(charArray[i]);
        // }
        // return myString;
        
        
        
        
        String myString ="";
        char[] charArray = str.toCharArray();
        Queue<Character> queue = new LinkedList<Character>();
        queue.add(charArray[0]);
        for(int i=1;i<str.length();i++){
            if(charArray[i-1]!=charArray[i]){
               queue.add(charArray[i]); 
            }else{
                queue.remove();
            }
        }
        char removedChar;
        for(int i=queue.size();i>0;i--){
           removedChar = queue.remove();
            myString = myString+removedChar;
        }
        return myString;
    }
}
