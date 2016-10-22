import java.util.*;
public class Lotto
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       
       int RandomNum1 = (int)(Math.random() * 49+1);
       System.out.print(RandomNum1 + " ");
       int RandomNum2 = (int)(Math.random() * 49+1);
       System.out.print(RandomNum2 + " ");
       int RandomNum3 = (int)(Math.random() * 49+1);
       System.out.print(RandomNum3 + " ");
       int RandomNum4 = (int)(Math.random() * 49+1);
       System.out.print(RandomNum4 + " ");
       int RandomNum5 = (int)(Math.random() * 49+1);
       System.out.print(RandomNum5 + " ");
       int RandomNum6 = (int)(Math.random() * 49+1);
       System.out.print(RandomNum6 + " ");
       int RandomNum7 = (int)(Math.random() * 49+1);
       System.out.println(RandomNum7 + " ");
       
       int Matches = 0;
       int guess = 0;
       
       for (int i=0; i<6;i++){
           do
           {
               System.out.println("Enter your 6 guess betwenn 1 and 49 ");
               guess = input.nextInt();
           } while (guess<1 || guess>49);
           if (guess == RandomNum1 || guess == RandomNum2 || guess == RandomNum3 || guess == RandomNum4 || guess == RandomNum5 ||guess == RandomNum6 || guess == RandomNum7)
           {
               Matches++;
           }
           
        }
       System.out.print("You got " + Matches + " matches");
       String option = "";
       switch (Matches){
           case 0: option = " and unfortunately won £0";
           break;
           case 1: option = " and unfortunately won £0";
           break;
           case 2: option = " and unfortunately won £0";
           break;
           case 3: option = " and won £10";
           break;
           case 4: option = " and won £100";
           break;
           case 5: option = " and won £10,000";
           break;
           case 6: option = " and won £1,000,000";
           break;
       }
       System.out.println(option);
       
   }
}
