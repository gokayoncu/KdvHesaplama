import java.util.Scanner;
public class kdvhesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double satis,kdv1=0.18,kdv2=0.08;
        System.out.print("Satış Fiyatınız :");
        satis =input.nextDouble();
        double kdv1li = (satis*kdv1)+satis;
        double kdv2li= (satis*kdv2)+satis;
        boolean durum1 = satis>=1000;
        boolean durum2 = satis<1000;

        double fiyat= durum1 ? kdv1li:kdv2li;

        double  kdvorani1= 18.0;
        double  kdvorani2=8.0;
        double fiyat1= durum1?kdvorani1:kdvorani2;
        double kdvOran = (satis>0) && (satis <1000) ? 0.18 :0.8;
        double kdvTutar = (satis*kdvOran);


        System.out.println("KDV siz Tutar:"+satis);
        System.out.println("KDV oranı:"+fiyat1);
        System.out.println("KDV Tutarı:"+ kdvTutar);

        System.out.print(fiyat);


    }
}
