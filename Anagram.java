import java.util.Scanner;

class Anagram
{
        public static void main(String[] args)
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the String 1");
                String str1=sc.next();
                System.out.println("Enter the String 2");                
                String str2=sc.next();
                System.out.println(str1.contains(str2));
              
        }
        
}                
