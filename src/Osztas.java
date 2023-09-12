import java.util.Scanner;

public class Osztas {
    int num1 = 0;
    int num2 = 0;
    int res = 0;
    public void osztas(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Első szám: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Második szám: ");
        num2 = Integer.parseInt(sc.nextLine());
        hasonlit(num1,num2);
        sc.close();
    }
    public void hasonlit(int szam1, int szam2){
        if(szam1 > szam2){
            res = szam1/szam2;
        }
        else {
            res = szam2/szam1;
        }
        System.out.println("Eredmény: "+res);
    }
}
