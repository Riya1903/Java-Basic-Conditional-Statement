public class ternaryop {
    public static void main(String args[])
    {//ternary operator
        //syntax:variable=condition?statment1:statement2;
        int number=2;
        int marks=40;
       String type= (number%2==0)?"even":"odd";
      // boolean larger=(5>1)?5:1;
      String reportcard=marks>=33?"pass":"fail";
      System.out.println(reportcard);
       System.out.println(type);
      // System.out.println(larger);
    }

}
