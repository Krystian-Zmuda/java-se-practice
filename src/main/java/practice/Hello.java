package practice;

public class Hello {

    public static void main(String[] args){
        System.out.println("Hello world");

        int myFirstNumber = 5;
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = myTotal - 1000;
        System.out.println(myLastOne);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        byte minByte = Byte.MIN_VALUE;
                //default type of data used by java is int, the line below need CASTING with (byte) to convert from int
      // this is wrong ->  byte myCastValue = (minByte / 2);
        byte myCastValue = (byte) (minByte / 2);
        System.out.println(myCastValue);

        byte bytevalue = 2;
        short shortvalue = 4;
        int intvalue = 10;
        long longvalue = 50_000 + (bytevalue+shortvalue+intvalue)*10;
        System.out.println(longvalue);

        double numOfPounds = 200;
        double numberOfKilograms = numOfPounds * 0.45359237;
        System.out.println(numberOfKilograms);
    }
}
