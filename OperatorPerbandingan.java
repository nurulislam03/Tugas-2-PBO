
public class OperatorPerbandingan {
    public static void main(String[] args) {
        int nilai_awal = 80;
        int nilai_akhir = 70;
        boolean isTerbesar;
        
        isTerbesar = nilai_awal > nilai_akhir;
        System.out.println("Apakah " + nilai_awal + " lebih besar dari" + nilai_akhir + "? " + isTerbesar);
        
        isTerbesar = nilai_awal < nilai_akhir;
        System.out.println("Apakah " + nilai_awal + " lebih kecil dari" + nilai_akhir + "? " + isTerbesar);
    }
}
