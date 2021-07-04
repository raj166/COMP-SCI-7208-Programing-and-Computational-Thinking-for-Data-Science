import java.lang.StringBuilder;

public class encode {
    
    int i = 0;

    public  String decodeString(String s) {

        //These creates a string thats empty and has capacity of 30
        StringBuilder result = new StringBuilder(30);

        //runs untill the last ']' or i is grater than length of String
        while(i < s.length() && s.charAt(i) != ']'){

            //checks wether the char at position i is digit or Alphabet is its a digit it enters in the if loop 
            if(Character.isDigit(s.charAt(i))){

                int k = 0;
                
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    k = k*10 + s.charAt(i++) - '0';
                }

                i++;
                //recursion call on the remaining string after the digit
                String r = decodeString(s);

                while(k-- > 0)
                    result.append(r);
                i++;
            } else
                result.append(s.charAt(i++));
        }
        //returns the string result in form of a string 
        return result.toString();
    }

    public static void main(String[] args) {
      
      encode obj = new encode();
      String s = "2[3[b]2[c]]3[b]";
      s = obj.decodeString(s);
      System.out.println(s);


    }
}