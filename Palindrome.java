//==== Number Palindrome ===//

public class vishal {                                                    
    public static void main(String[] args) {                             
        
        int Number = 121;                                                
        int Original = Number;        // store original number because Number will become 0
        int Reverse = 0;

        while(Number > 0){
            int digits = Number % 10;     // extract last digit
            Reverse = (Reverse * 10 ) + digits;   // shift left and add digit
            Number = Number / 10;         // remove last digit
        }

        if(Original == Reverse){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

                                   //     WHY STORE ORIGINAL ?
                                   //     Because Number becomes 0 after loop
                                   //     So we cannot compare directly

                                   //     PALINDROME LOGIC:
                                   //     Reverse the number
                                   //     Compare with original
                                   //     If equal → Palindrome
                                   //     If not equal → Not Palindrome

                                   //  EXTRA NOTE:
                                   //  %10  -> extract last digit
                                   //  /10  -> remove last digit
                                   //  Reverse * 10 -> shift left
                                   //  Time Complexity = O(log10 n)
                                   //  Space Complexity = O(1)


//==== String Palindrome (Basic Reverse Method) ===//

public class vishal {                                                  
    static boolean isPalindrome(String s) {

        String rev = "";

        for(int i = s.length()-1 ; i >= 0; i--){
            rev = rev + s.charAt(i);   // concatenation (slow for large string)
        }

        return s.equals(rev);   // compare original with reversed string
    }
}

                                           //     PROBLEM:
                                           //     String is immutable (cannot change)
                                           //     Every + creates new object in memory
                                           //     So for large string it becomes slow
        
                                           //     TIME COMPLEXITY:
                                           //     O(n^2) because of repeated concatenation
        
                                           //     USE THIS only for small strings


//==== String Palindrome (Efficient Two Pointer Method) ===//

public class vishal {
    static boolean isPalindrome(String s) {

        int left = 0;                      // start pointer
        int right = s.length() - 1;        // end pointer

        while(left < right){

            if(s.charAt(left) != s.charAt(right)){
                return false;              // if mismatch found stop immediately
            }

            left++;     // move forward
            right--;    // move backward
        }

        return true;    // if loop completes means string is symmetric
    }
}

                                             //     WHY THIS METHOD BEST ?
                                             //     No extra string created
                                             //     No reverse needed
                                             //     Direct symmetry checking
          
                                             //     HOW IT WORKS:
                                             //     Compare first and last character
                                             //     Compare second and second-last
                                             //     Continue until center reached
          
                                             //     EXAMPLE:
                                             //     M A D A M
                                             //     |       |
                                             //         |   |
                                             //            |
          
                                             //     TIME COMPLEXITY = O(n)
                                             //     SPACE COMPLEXITY = O(1)
          
                                             //     MOST PREFERRED IN INTERVIEW
