//==== Number reverse ===//

public class vishal {                                                    
    public static void main(String[] args) {                             
        int Number = 10;                                                
        int Reverse = 0;
        while(Number > 0){
            int digits = Number % 10;
            Reverse = (Reverse * 10 ) + digits;
            Number = Number / 10;
        }
        System.out.printf("%02d" , Reverse);
    }

                                   //     This is problem of ZERO 
                                   //     example num = 10; -> But also maths define 1 
                                   //     if want 01 output used : printf("%02d") or Make String 

                                   //  EXTRA NOTE:
                                   //  %10  -> extract last digit
                                   //  /10  -> remove last digit
                                   //  Reverse * 10 -> shift left
                                   //  Leading zero never stored in int
                                   //  printf is used only for formatted output
}

//===  String reverse  ====//
  
public class vishal {                                                  
    static String revStr(String s) {
        String rev = "";
        for(int i = s.length()-1 ; i >= 0; i--){
            rev = rev + s.charAt(i);
        }
        return rev;
    }
}        
                                  //     This is Problem of String concatenation slow if String are large 
                                  //      So used append() -> then must use -> StringBuilder rev = new StringBuilder();
                                  //      .toString() -> Converts StringBuilder back to String

                                  //  EXTRA NOTE:
                                  //  String is immutable (cannot change)
                                  //  Every + creates new object in memory
                                  //  Time complexity becomes higher for large strings

public class vishal {
  static String revStr(String s) {
      StringBuilder rev = new StringBuilder();
      for(int i = s.length()-1 ; i >= 0; i--){
        rev.append(s.charAt(i));
        }
        return rev.toString();
    }
}

                                  //  EXTRA NOTE:
                                  //  StringBuilder is mutable (can change)
                                  //  append() modifies same object
                                  //  Faster and memory efficient
                                  //  Preferred in loops

public class vishal {
    static String revStr(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}

                                  //  EXTRA NOTE:
                                  //  reverse() is built-in optimized method
                                  //  Best for interview & competitive coding
                                  //  Clean and professional solution
                                  //  Use when only full string reverse needed
