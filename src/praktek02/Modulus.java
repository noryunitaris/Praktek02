package praktek02;
public class Modulus {
    double X;
    double Y;

    public Modulus() {
        X=7;
        Y=5;
    }

    public Modulus(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }
    
    
    
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
    
    void cetakHasil(){
        System.out.println("Hasilnya adalah = "+hitungHasil());
    
    }
}
