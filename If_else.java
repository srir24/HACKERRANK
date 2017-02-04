//------- Problem definition - Begin -------//
Given an integer, , perform the following conditional actions:

    If is odd, print Weird
    If is even and in the inclusive range of to , print Not Weird
    If is even and in the inclusive range of to , print Weird
    If is even and greater than , print Not Weird
//------- Problem definition - End -------//


    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class If_else {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n%2==1){
              ans = "Weird";
            }
            else{
                if (n>=2 && n<=5)
                    ans = "Not Weird";
                else if(n>=6 && n<= 20)
                    ans = "Weird";
                else 
                    ans = "Not Weird";
            }
            // ---------- Alternate code - Begin ----------//
            /* if(n%2==1 || (n%2==0 && n>=6 && n<= 20)){
              ans = "Weird";
            }
            else{
              ans = "Not Weird";
            }*/
            // ---------- Alternate code - End ----------//
            System.out.println(ans);
            
        }
    }
