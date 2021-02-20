package hRJavaLoops;

import java.util.Scanner;

public class Main {
  
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("Please enter an Integer between 2 and 20");
    int numb = scanner.nextInt();
    int result;
    
    for(int i = 1; i < 11; i++) {
      result = (numb * i);
      System.out.printf("%s x %s = %s\n", numb, i, result);
    }
  }

}
