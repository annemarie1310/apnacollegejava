import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /*
    public static void printjava(){
        System.out.println("hello Java");
    }

    public static void printname(String name){

        System.out.println(name);
    }
    public static void printsum(int a , int b ){
        int sum=a+b;
        System.out.println(sum);
    }

     */
    public static void main(String[] args)
    {
        // my first program
/*
        System.out.print("Hello java!");
// variables .
//primitive type :-
String name="josh";
String neighbour="rougen";
int age=4;
String friend= "neighbour";
byte age1=2;
int number=1234567;
long phone1=12345678910L;
float pi=3.14F;
char letter ='a';
boolean isadult=false;
*/

// non primitive type & functions :-
//
//        String name="adam hosen";
//        System.out.println(name.length());
//        System.out.println(name);
//        System.out.println(name.charAt(0));  /* this gives character in return a number passed position here it is 0 */
//        String name2 =name.replace('h','H');
//        System.out.println(name2);
//        System.out.println(name.substring(0,4));
//

// Arrays is non-primitive type:-
/*
int[]marks=new int [3]        ;       //we use new cauz array is non-primitive type
marks[0]=97;
marks[1]=70;
marks[2]=44;

//        System.out.println(marks[0]);
//        System.out.println(marks.length);

// sort does sort ascending order
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
*/

/*
// we can also store an array like below
     int [] marks = {97,55,66,25,88,};       // is 1d array .

// below is 2d array .
        //{index-1} ,{index-2}
        int [][] finalmarks ={{97,88,68},{55,66,78}};  // this array is storing marks of 2different students in {{ student 1} ,{student 2}};
        System.out.println(finalmarks[1][2]);
*/
/*        // casting below    .

        double price=100.00;
        double finalprice=price+18;      // here we can store 18 being int in double this is (eg:- of implicit casting)
        System.out.println(finalprice);

        int p=100;
        int fp=p+(int)18.0;                  // here we cannot store 18.0 being a decimal value so we use ( explict casting by writting (int)18.0  ).
        System.out.println(fp);
*/
/*        // constants below .
        // in c language we declare constant as :-  const int age=55;
        // but in java we use final key-word  eg below :- .

        final float pi=3.14F;
        */

/*
     // how to take input from user in java below :- ( like scanf in c language )
// below is how u take input of numbers .
        Scanner age= new Scanner(System.in);
        System.out.println("input your age");
        int age1=age.nextInt();
        System.out.println(age1);

// below is how u take input of strings.
        Scanner name1= new Scanner(System.in);
        System.out.println("input your name");
     //   String name1=name.next();      // next() function will accept only single word not a sentence .
         String name1=name.nextLine();     // nextline function will accept whole sentence .
         System.out.println(name1);
*/
/*
        // below is how u write conditional statements .

         //  if else below
        boolean isSunUp =false;
        if (isSunUp==false)
            System.out.println("day");
        else
            System.out.println("night");
*/
/*
        // else if below
        Scanner cash=new Scanner(System.in);
        System.out.println("input how much cash you have");
        // pen 10 ; notebook 40 .
        int cash1=cash.nextInt();
        if (cash1 < 10) {
            System.out.println("cannot buy any thing");
            System.out.println("get more cash");
        }
            else if (cash1 >10 && cash1 <50)
        {
            System.out.println("can get one thing");
        }
        else {
            System.out.println("can get both the things");
        }
*/
/*
// switch case in java .
        int day=5; //  1=monday ; 2=tuesday ; 3=wednesday.

switch (day) {
    case 1:
        System.out.println("monday");
        break;
    case 2:
        System.out.println("tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Thursday to sunday");
*/
/*
        // loops in java below .

        // for loop below .
        for(int i=1 ;i<=100;i++)
        {
            System.out.println(i);
        }

        // while loop below
        int i=1;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }

        // do while loop below .
        int i=1;
        do {
             System.out.println(i);
        i++;
        }
        while(i<=10);

        // run the function till user enters a positive number.

        Scanner number = new Scanner(System.in);
        int number1=0;

        do {
            System.out.println("input a number");
            number1= number.nextInt();
            System.out.println("your number is here");
            System.out.println(number1);
        }while (number1>=0);

        System.out.println("THE END :)");
*/
/*
        // break and continue keywords use below  ( continue is kinda skip in programming ) .
        //below program with break .
        int i=0;
        while (true) {
            System.out.println(i);
            i++;
            if (i > 5) {
                break;
            }
        }

        //below program with continue .
        int i=0;
        while (true)
         {
            if(i==3)
            {
                i++;
                continue;
            }

            System.out.println(i);
            i++;
            if (i > 5)
            {
                break;
            }
         }
 */
/*
// Try - Catch in Exception handeling .
        int[]marks={44,55,98};
        try{
            System.out.println(marks[5]);
        }catch (Exception exception) {
            // do something after catching.
        }
        System.out.println("my name is logan");

*/
        // below are functions called which are written in public class Main .
/*
        printjava();
        printjava();
        printjava();

        printname("pranay");
        printname("Josh");

        printsum(1,5);
  */

     // below is mini project guess my number .
/*
        Scanner sc =new Scanner(System.in);
        int mynumber = (int)(Math.random()*100);
        int usernumber=0;
        do
        {
            System.out.println("Guess my number (1 - 100) :");
            usernumber=sc.nextInt();

            if(usernumber==mynumber){
                System.out.println("whoooa !! .. CORRECT NUMBER !!");
                break;
            }

            else if (usernumber>mynumber)
            {
                System.out.println("YOUR NUMBER IS TOO LARGE !!");
            }
            else
            {
                    System.out.println("YOUR NUMBER IS TOO SHORT !!");
            }
        } while (usernumber>0);
*/




    }

    }

