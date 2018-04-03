package praktek02;
public class Modulus {
    double X;
    double Y;
    
    void cetakdata(){
        System.out.println("++++++++++++");;
        System.out.println(   "X : "+X);
        System.out.println(   "Y : "+Y);
        System.out.println("++++++++++++");;
    }
    
    double hitungHasil(){
        double hasil;
        hasil=X%Y;
        return hasil;
    }
}
