package praktek02;

public class ModulusAksi {
    public static void main(String[] args) {
        Modulus r1 = new Modulus();
       r1.X = 10;
       r1.Y = 3;
       
       r1.cetakdata();
       System.out.println("Hasil Modulus = "+r1.hitungHasil());
       r1.cetakHasil();
       
       Modulus r2 = new Modulus();
       r2.cetakdata();
       
       Modulus r3 = new Modulus(50,30);
       r3.cetakdata();
    }
    
}
