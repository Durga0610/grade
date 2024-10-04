import java.util.Scanner;
class grade{
    public static void main(String[] args)
    {
      Scanner scan=new Scanner(System.in);
      int score= scan.nextInt();
      if(score>=80){
         System.out.println(" grade=A");
       }
      else if(score>=75){
          System.out.println(" grade=B");
      }
      else if(score>=55){
         System.out.println(" grade=C");
      }
      else{
         System.out.println(" fail");
      }
}
}

