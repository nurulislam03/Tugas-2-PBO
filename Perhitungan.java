
public class Perhitungan {
    public static void main(String[] args) {
        int a=100, b=20, c=528, d=70, e=256, f=3, g=128, h=5, i=600, j=4, k=423, l=2;
        int hasil;
        
        hasil = a & b;
        System.out.println("Hasil dari a & b = " + hasil);
        System.out.println("--------------------");
        
        hasil = c | d;
        System.out.println("Hasil dari c | d = " + hasil);
        System.out.println("--------------------");
        
        hasil = e >> f;
        System.out.println("Hasil dari e >> f = " + hasil);
        System.out.println("--------------------");
        
        hasil = g << h;
        System.out.println("Hasil dari g << h = " + hasil);
        System.out.println("--------------------");
        
        hasil = i >> j;
        System.out.println("Hasil dari i >> j = " + hasil);
        System.out.println("--------------------");
        
        hasil = k << l;
        System.out.println("Hasil dari k << l = " + hasil);
        System.out.println("--------------------");
    }
}
