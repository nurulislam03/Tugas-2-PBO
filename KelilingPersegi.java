import java.util.Scanner;

public class KelilingPersegi {
    public static void main(String[] args) {
        double keliling, panjang, lebar;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Isikan panjang: ");
        panjang = input.nextInt();
        System.out.println("Isikan Lebar: ");
        lebar = input.nextInt();
        
        keliling = (2 * panjang) + (2 * lebar);
        System.out.println("Keliling persegi panjang adalah " + keliling);
    }
}
