import java.util.Scanner;
/** THis program will prompt the user for two integers, it will then tell the user the acending order of the numbers.
 *
 * @author Isaac
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter two numbers.");
    int[] num = new int [2];
    
    for(int i = 0; i < num.length; i++){
     num[i] = input.nextInt();
     
    }
     if (num[0] < num[1]){
       
     System.out.println("The numbers in ascending order are " + num[0] + ", " + num[1]);
     }
     else if (num[0] > num[1]){
       
       System.out.println("The numbers in ascending order are " + num[1] + ", " + num[0]);
     }
    }
  }
  

