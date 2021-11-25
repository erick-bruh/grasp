import java.util.*;
public class grasps_MatejErick{
 // declare global variables
 public static int decimal;
 public static String num;
 

//MAIN SCREEN WHERE THE PROGRAM RETURNS WHEN CHOSING TYPE OF CALCULATOR
//PRO TIP: THIS IS WRITTEN ESPECIALLY FOR AN EASE OF ADDING NEW CALCULATORS AND RETURNING BACK TO THIS ONE
static void chooseCalculator(){

    System.out.println("Welcome the wonder calculator \nwhat would you like to calculate? (0 = Sleep calculator; 1 = Hex-Dec-Bin Converter)");
    Scanner sc= new Scanner(System.in);
    int input = sc.nextInt();


    if (input == 0){
        sleepCalculator();
    }
    else if (input == 1){
        hexDecBinConverter();
    }
}

//SLEEP CALCULATOR METHOD
static void sleepCalculator() {
    System.out.println("Would you like to calculate optimal wake up time? \n(No = 0/Yes = 1)");
    Scanner sc= new Scanner(System.in);
    int input = sc.nextInt();
    //IF GATE THAT DECIDES IF WERE CALCULATING SLEEP OR WAKE UP TIME
    if (input == 1){
        //GET INPUT TIME
        System.out.println("When are you planning to go to sleep? (hh)");
        
        int sleepHour = sc.nextInt();
        System.out.println("How many minutes after " + (sleepHour%24) + "? (mm)");

        int sleepMinute = sc.nextInt();
        //CALCULATE SLEEP TIME
        int sleepTime = (sleepHour%24)*60 + sleepMinute%60;
        int idealSleeptime5 = sleepTime+465;
        int idealSleeptime6 = sleepTime+555;
        //CHECK NEGATIVE OVERFLOW
        if (idealSleeptime5 < 0){
            idealSleeptime5 = idealSleeptime5 + 1440;
        }
        if (idealSleeptime6 < 0){
            idealSleeptime6 = idealSleeptime6 + 1440;
        }
        //RELAY MESSAGE
        System.out.println("We think you should wake up at: \nEither: " + (idealSleeptime5/60)%24 + ":" + idealSleeptime5%60 + " or " + (idealSleeptime6/60)%24 + ":" + idealSleeptime6%60);
        System.out.println("A good night's sleep consists of 5-6 complete 90 minute REM sleep cycles.");
    }
        if (input == 0){
            System.out.println("Would you like to calculate optimal sleep time? \n(No = 0/Yes = 1)");
            
            input = sc.nextInt();
                if (input == 1){
                    //GET INPUT TIME
                    System.out.println("When are you planning to go to wake up? (hh)");
        
                    int wakeUpHour = sc.nextInt();
                    System.out.println("How many minutes after " + (wakeUpHour%24) + "? (mm)");
            
                    int wakeUpMinute = sc.nextInt();
                    //CALCULATE SLEEP TIME
                    int wakeUptime = (wakeUpHour%24)*60 + wakeUpMinute%60;
                    int idealwakeUptime5 = wakeUptime-465;
                    int idealwakeUptime6 = wakeUptime-555;
                    //CHECK NEGATIVE OVERFLOW
                    if (idealwakeUptime5 < 0){
                        idealwakeUptime5 = idealwakeUptime5 + 1440;
                    }
                    if (idealwakeUptime6 < 0){
                        idealwakeUptime6 = idealwakeUptime6 + 1440;
                    }
                    //RELAY MESSAGE
                    System.out.println("We think you should wake up at: \nEither: " + (idealwakeUptime5/60)%24 + ":" + idealwakeUptime5%60 + " or " + (idealwakeUptime6/60)%24 + ":" + idealwakeUptime6%60);
                    System.out.println("A good night's sleep consists of 5-6 complete 90 minute REM sleep cycles.");
                }
                    if (input == 0){
                        System.out.println("Then what are you trying to do? \n  ...returning to main menu");
                        chooseCalculator();
                    }
        }
}

//HEXADECIMAL DECIMAL BINARY CONVERTER
static void hexDecBinConverter() {
  // initialise scanner
  Scanner sc = new Scanner(System.in);
  Scanner scc = new Scanner(System.in);
  //get type to convert from
  System.out.println("What would you like to convert from?");
  System.out.println("type 1 to convert from decimal, 2 to convert from binary and 3 to convert from hexadecimal");
  int from = sc.nextInt();


  //get number to convert
  if(from == 1){
      System.out.println("enter number to convert");
      decimal = sc.nextInt();
  }else{
      System.out.println("enter number to convert");
      num = scc.nextLine();
  }
  
  // get type to convert to
  System.out.println("What would you like to convert to?");
  System.out.println("type 1 to convert to decimal, 2 to convert to binary and 3 to convert to hexadecimal");
  int to = sc.nextInt();
  
  //check what type of conversion and call correct method
  if(from == 1){
      if(to == 2){
         System.out.println( decimalToBinary(decimal) );
      }
      if(to == 3){
          System.out.println( decimalToHex(decimal) );
      }
  } else if(from == 2){
      if(to == 1){
          System.out.println(binaryToDecimal(num));
      }
      if(to == 3){
          System.out.println(binaryToHex(num));
      }
  } else if(from == 3 ){
      if(to == 1){
          System.out.println(hexToDecimal(num));
      }
      if(to ==2){
          System.out.println(hexToBinary(num));
      }
  }

}
//CONVERSION METHODS
static String decimalToBinary(int n){
    String b = Integer.toString(n,2);
    return b;
}
static String decimalToHex(int n){
    String b = Integer.toString(n,16);
    return b;
}
static int binaryToDecimal(String n){
    int b = Integer.parseInt(n,2);  
    return b;
}
static String binaryToHex(String n){
    int x = binaryToDecimal(n);
    String b = decimalToHex(x);
    return b;
}
static int hexToDecimal(String n){
    int b=Integer.parseInt(n,16);
    return b;
}
static String hexToBinary(String n){
    int x = hexToDecimal(n);
    String b = decimalToBinary(x);
    return b;
}
//RUN DEFAULT METHOD
public static void main(String[] args) {
    chooseCalculator();

    }
}