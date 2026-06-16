class Demo{

    public static void main(String a[]){
      System.out.println("Hello Dear Teachers");

      System.out.println("Please ask students to write and debug every code");

      int number = 456;
      
      int digit = 0;
      while(number>0){
          digit = number % 10;
          System.out.print(digit);
          number = number / 10;
      } 

    }

}

