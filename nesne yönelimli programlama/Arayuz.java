import java.util.Scanner;
public class Arayuz {
    int gecis = 0;
    Scanner reader = new Scanner(System.in);
    Doktor doktor = new Doktor();
    Hasta hasta = new Hasta();
    Hemsire hemsire = new Hemsire();
    Laborant laborant = new Laborant();
    Sekreter sekreter = new Sekreter();
    Admin admin = new Admin();


    //----------------------------ARAYUZLER--------------------\\


     public void GirisArayuz(){
         System.out.println("--------------------------------");
         System.out.println("            Giris");
         System.out.println("--------------------------------");
         System.out.println("1) Admin Giris");
         System.out.println("2) Doktor Giris");
         System.out.println("3) Hemsire Giris");
         System.out.println("4) Laborant Giris");
         System.out.println("5) Sekreter Giris");
         System.out.println("6) Çıkış");
         System.out.println("--------------------------------");
         System.out.print("Yapmak istediğiniz işlemi giriniz: ");
         gecis = reader.nextInt();
         if (gecis == 1){
             AdminArayuz();
         } else if (gecis == 2) {
            DoktorArayuz();
         } else if (gecis == 3) {
             HemsireArayuz();
         } else if (gecis == 4) {
            LaborantArayuz();
         }else if (gecis == 5) {
            SekreterArayuz();
         } else if (gecis == 6) {
             System.exit(0);
         } else {
             System.out.println("Gecersiz İslem");
             GirisArayuz();
         }
     }
     public void AdminArayuz(){
         System.out.println("--------------------------------");
         System.out.println("      Admin Arayüz");
         System.out.println("--------------------------------");
         System.out.println("1) Doktor Islemleri");
         System.out.println("2) Hemsire Islemleri");
         System.out.println("3) Laborant Islemleri");
         System.out.println("4) Sekreter Islemleri");
         System.out.println("--------------------------------");
         System.out.print("Yapmak istediğiniz işlemi giriniz: ");
         gecis = reader.nextInt();
         if (gecis == 1){
            AdminDokIslemleri();
         } else if (gecis == 2) {
            AdminHemIslemleri();
         } else if (gecis == 3) {
            AdminLabIslemleri();
         } else if (gecis == 4) {
            AdminSekIslemleri();
         }else {
            System.out.println("Geçersiz İşlem!");
             AdminArayuz();
         }

     }
     public void AdminDokIslemleri(){
         System.out.println("--------------------------------");
         System.out.println("      Doktor Islemleri");
         System.out.println("--------------------------------");
         System.out.println("1) Doktor Ekle");
         System.out.println("2) Doktor Sil");
         System.out.println("3) Doktor Goruntule");
         System.out.println("4) Doktor Duzenle");
         System.out.println("--------------------------------");
         System.out.print("Yapmak istediğiniz işlemi giriniz: ");
         gecis = reader.nextInt();
         if (gecis == 1){
            admin.DoktorEkle();
             AdminDokIslemleri();
         } else if (gecis == 2) {
             admin.DoktorSil();
             AdminDokIslemleri();
         } else if (gecis == 3) {
             admin.DoktorGoster();
             AdminDokIslemleri();
         } else if (gecis == 4) {
             admin.DoktorDuzenle();
             AdminDokIslemleri();
         }else {
            System.out.println("Geçersiz İşlem!");
             AdminDokIslemleri();
         }

     }
    public void AdminHemIslemleri(){
        System.out.println("--------------------------------");
        System.out.println("      Hemsire Islemleri");
        System.out.println("--------------------------------");
        System.out.println("1) Hemsire Ekle");
        System.out.println("2) Hemsire Sil");
        System.out.println("3) Hemsire Goruntule");
        System.out.println("4) Hemsire Duzenle");
        System.out.println("--------------------------------");
        System.out.print("Yapmak istediğiniz işlemi giriniz: ");
        gecis = reader.nextInt();
        if (gecis == 1){
            admin.HemsireEkle();
            AdminHemIslemleri();
        } else if (gecis == 2) {
            admin.HemsireSil();
            AdminHemIslemleri();
        } else if (gecis == 3) {
            admin.HemsireGoster();
            AdminHemIslemleri();
        } else if (gecis == 4) {
            admin.HemsireDuzenle();
            AdminHemIslemleri();
        }else {
            System.out.println("Geçersiz İşlem!");
            AdminHemIslemleri();
        }

    }
    public void AdminSekIslemleri(){
        System.out.println("--------------------------------");
        System.out.println("       Sekreter Islemleri");
        System.out.println("--------------------------------");
        System.out.println("1) Sekreter Ekle");
        System.out.println("2) Sekreter Sil");
        System.out.println("3) Sekreter Goruntule");
        System.out.println("4) Sekreter Duzenle");
        System.out.println("--------------------------------");
        System.out.print("Yapmak istediğiniz işlemi giriniz: ");
        gecis = reader.nextInt();
        if (gecis == 1){
            admin.SekreterEkle();
            AdminSekIslemleri();
        } else if (gecis == 2) {
            admin.SekreterSil();
            AdminSekIslemleri();
        } else if (gecis == 3) {
            admin.SekreterGoster();
            AdminSekIslemleri();
        } else if (gecis == 4) {
            admin.SekreterDuzenle();
            AdminSekIslemleri();
        }else {
            System.out.println("Geçersiz İşlem!");
        }

    }
    public void AdminLabIslemleri(){
        System.out.println("--------------------------------");
        System.out.println("      Laborant Islemleri");
        System.out.println("--------------------------------");
        System.out.println("1) Laborant Ekle");
        System.out.println("2) Laborant Sil");
        System.out.println("3) Laborant Goruntule");
        System.out.println("4) Laborant Duzenle");
        System.out.println("--------------------------------");
        System.out.print("Yapmak istediğiniz işlemi giriniz: ");
        gecis = reader.nextInt();
        if (gecis == 1){
            admin.LaborantEkle();
            AdminLabIslemleri();
        } else if (gecis == 2) {
            admin.LaborantSil();
            AdminLabIslemleri();
        } else if (gecis == 3) {
            admin.LaborantGoster();
            AdminLabIslemleri();
        } else if (gecis == 4) {
            admin.LaborantDuzenle();
            AdminLabIslemleri();
        }else {
            System.out.println("Geçersiz İşlem!");
            AdminLabIslemleri();
        }

    }

    public void DoktorArayuz(){
        System.out.println("--------------------------------");
        System.out.println("      Doktor Arayüzü");
        System.out.println("--------------------------------");
        System.out.println("1) Hasta Ekle");
        System.out.println("2) Hasta Sil");
        System.out.println("3) Hastaları Göster");
        System.out.println("4) Hasta Bilgilerini Düzenle");
        System.out.println("--------------------------------");
        System.out.print("Yapmak istediğiniz işlemi giriniz: ");
        gecis = reader.nextInt();
        if (gecis == 1){
            doktor.HastaEkle();
            DoktorArayuz();
        } else if (gecis == 2) {
            doktor.HastaSil();
            DoktorArayuz();
        } else if (gecis == 3) {
            doktor.HastaGoruntule();
            DoktorArayuz();
        } else if (gecis == 4) {
            doktor.HastaDuzenle();
            DoktorArayuz();
        }else {
            System.out.println("Geçersiz İşlem!");
            DoktorArayuz();
        }
    }
    public void LaborantArayuz(){
        System.out.println("--------------------------------");
        System.out.println("      Laborant Arayüzü");
        System.out.println("--------------------------------");
        System.out.println("1) Hasta Ekle");
        System.out.println("2) Hasta Sil");
        System.out.println("3) Hastaları Göster");
        System.out.println("4) Hasta Bilgilerini Düzenle");
        System.out.println("--------------------------------");
        System.out.print("Yapmak istediğiniz işlemi giriniz: ");
        gecis = reader.nextInt();
        if (gecis == 1){
            laborant.HastaEkle();
            LaborantArayuz();
        } else if (gecis == 2) {
            laborant.HastaSil();
            LaborantArayuz();
        } else if (gecis == 3) {
            laborant.HastaGoruntule();
            LaborantArayuz();
        } else if (gecis == 4) {
            laborant.HastaDuzenle();
            LaborantArayuz();
        }else {
            System.out.println("Geçersiz İşlem!");
            LaborantArayuz();
        }
    }
    public void HemsireArayuz(){
        System.out.println("--------------------------------");
        System.out.println("      Hemsire Arayüzü");
        System.out.println("--------------------------------");
        System.out.println("1) Hasta Ekle");
        System.out.println("2) Hasta Sil");
        System.out.println("3) Hastaları Göster");
        System.out.println("4) Hasta Bilgilerini Düzenle");
        System.out.println("--------------------------------");
        System.out.print("Yapmak istediğiniz işlemi giriniz: ");
        gecis = reader.nextInt();
        if (gecis == 1){
            hemsire.HastaEkle();
            HemsireArayuz();
        } else if (gecis == 2) {
            hemsire.HastaSil();
            HemsireArayuz();
        } else if (gecis == 3) {
            hemsire.HastaGoruntule();
            HemsireArayuz();
        } else if (gecis == 4) {
            hemsire.HastaDuzenle();
            HemsireArayuz();
        }else {
            System.out.println("Geçersiz İşlem!");
            HemsireArayuz();
        }
    }
    public void SekreterArayuz(){
        System.out.println("--------------------------------");
        System.out.println("      Sekreter Arayüzü");
        System.out.println("--------------------------------");
        System.out.println("1) Hasta Ekle");
        System.out.println("2) Hasta Sil");
        System.out.println("3) Hastaları Göster");
        System.out.println("4) Hasta Bilgilerini Düzenle");
        System.out.println("--------------------------------");
        System.out.print("Yapmak istediğiniz işlemi giriniz: ");
        gecis = reader.nextInt();
        if (gecis == 1){
            sekreter.HastaEkle();
            SekreterArayuz();
        } else if (gecis == 2) {
            sekreter.HastaSil();
            SekreterArayuz();
        } else if (gecis == 3) {
            sekreter.HastaGoruntule();
            SekreterArayuz();
        } else if (gecis == 4) {
            sekreter.HastaDuzenle();
            SekreterArayuz();
        }else {
            System.out.println("Geçersiz İşlem!");
            SekreterArayuz();
        }
    }
}
