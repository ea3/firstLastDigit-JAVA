public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){


        int firstDigit=0;
        int remainingNumber = number;


        if (number < 0){
            return -1;
        }else {

            while (remainingNumber > 0) {
                firstDigit = remainingNumber % 10 ;
                System.out.println(firstDigit);
                remainingNumber = remainingNumber/10;
                System.out.println(remainingNumber);
            }

        }
        return ( firstDigit + number % 10 );

    }
}
