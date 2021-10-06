
public class OperatorTernary {
    public static void main(String[] args) {
        int uang = 50000;
        int harga = 55000;
        String hasil = uang > harga ? uang + "Uang Kurang 5000" :
                uang + " Uang Anda tidak cukup";
        System.out.println(hasil);
    }
}
