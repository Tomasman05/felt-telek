import java.util.Scanner;

public class Betu {
    public static void konvert(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Szám: ");
        int num = Integer.parseInt(sc.nextLine());
        if(num ==1){
            System.out.println("Egy");
        }
        else if(num == 2){
            System.out.println("Kettő");
        }
        else if(num == 3){
            System.out.println("Három");
        }
        else if(num == 4){
            System.out.println("Négy");
        }
        else if(num == 5){
            System.out.println("Öt");
        }
        else{
            System.out.println("Ismeretlen szám");
        }
    }
}
