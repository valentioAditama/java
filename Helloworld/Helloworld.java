import java.util.Scanner;

public class Helloworld{
    public static void main(String[] args){
        try {
            System.out.println("======== First Program =======");
            System.out.println("======== Hello world =======");
    
            String answer; 
            System.out.println("Key Value: helloworld");
            System.out.print("input: ");
            Scanner input = new Scanner(System.in);
            answer = input.next(); 
            if(answer.equals("helloworld")){
                System.out.println("helloworld dude!");
            } else{
                System.out.println("invalid error, key value: helloworld");
            }
        } catch (Exception e) {
            System.out.println("invalid error!");
        }
    }
}