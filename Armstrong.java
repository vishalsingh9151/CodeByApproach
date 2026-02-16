//==== Armstrong Number ===//

public class vishal {                                                    
    public static void main(String[] args) {                             
        
        int Number = 153;                                                
        int Original = Number;        // store original number
        int Sum = 0;

        while(Number > 0){
            int digits = Number % 10;     // extract last digit
            
            Sum = Sum + (digits * digits * digits);   
            // cube of each digit added
            // for 3-digit Armstrong → power 3
            
            Number = Number / 10;         // remove last digit
        }

        if(Original == Sum){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}

                                   //     WHAT IS ARMSTRONG NUMBER ?
                                   //     A number is Armstrong if:
                                   //     Sum of cube of digits = Original number
                                   //
                                   //     Example:
                                   //     153
                                   //     1^3 + 5^3 + 3^3
                                   //     1 + 125 + 27 = 153 ✅
                                   //
                                   //     So 153 is Armstrong

                                   //  EXTRA NOTE:
                                   //  %10  -> extract digit
                                   //  /10  -> remove digit
                                   //  For 3 digit → power 3
                                   //  Time Complexity = O(log10 n)
                                   //  Space Complexity = O(1)


//==== Armstrong Number (General Case) ===//

public class vishal {

    public static void main(String[] args) {

        int Number = 9474;
        int Original = Number;
        int Sum = 0;

        int digitsCount = String.valueOf(Number).length();
        // count number of digits

        while(Number > 0){
            int digit = Number % 10;

            Sum = Sum + (int)Math.pow(digit, digitsCount);
            // raise digit to power of total digits

            Number = Number / 10;
        }

        if(Original == Sum){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}

                                   //     WHY THIS IS BEST VERSION ?
                                   //     Works for 3 digit, 4 digit, any digit number
                                   //
                                   //     Math.pow() returns double
                                   //     So typecast to (int)
                                   //
                                   //     Interview Ready Version
