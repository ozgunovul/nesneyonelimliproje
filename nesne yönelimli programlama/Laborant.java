import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Laborant extends Calisan{
    Hasta hasta = new Hasta();

    Scanner reader = new Scanner(System.in);

    List<String> LaborantIsim = new LinkedList<>();
    List<String> LaborantCinsiyet = new LinkedList<>();
    List<Long> LaborantTC = new LinkedList<>();
    List<Integer> LaborantYas = new LinkedList<>();
    List<Integer> LaborantMaas = new LinkedList<>();
    List<String> LaborantTelNO = new LinkedList<>();
    public void HastaGoruntule() {
        for (int i = 0; i < hasta.HastaIsim.size();i++){
            System.out.println("Hasta ismi: "+hasta.HastaIsim.get(i));
            System.out.println("Hasta cinsiyeti: "+hasta.HastaCinsiyet.get(i));
            System.out.println("Hasta Şikayeti: "+hasta.HastaSikayeti.get(i));
            System.out.println("Hasta TC NO: "+hasta.HastaTC.get(i));
            System.out.println("Hasta Yasi: "+hasta.HastaYas.get(i));
            System.out.println("Hasta Tel NO: "+hasta.HastaTelNO.get(i));
            try {
                System.out.println("Hasta Kan Bilgileri: "+hasta.HastaKanDegeri);
            }catch (Exception e){
                System.out.println("Hasta Kan Bilgileri: Bilinmiyor!");
            }
        }
    }

    public void HastaSil() {
        Long TCKontrol;
        try {
            System.out.print("Hastanın TC NO'sunu giriniz: ");
            TCKontrol = reader.nextLong();
            for (int i = 0; i< hasta.HastaTC.size();i++){
                if (hasta.HastaTC.get(i).equals(TCKontrol)){
                    hasta.HastaTC.remove(i);
                    hasta.HastaYas.remove(i);
                    hasta.HastaIsim.remove(i);
                    hasta.HastaCinsiyet.remove(i);
                    hasta.HastaSikayeti.remove(i);
                    System.out.println("Hasta Silindi!");
                }
            }
        }catch (Exception e){
            System.out.println("Hasta Silinemedi!");
        }
    }

    public void HastaEkle() {
        System.out.println("-----------Hasta Ekleme-----------");
        try {
            System.out.print("Hasta ismi: ");
            hasta.HastaIsim.add(reader.nextLine());
            System.out.print("Hasta Cinsiyeti: ");
            hasta.HastaCinsiyet.add(reader.nextLine());
            System.out.print("Hasta Sikayeti: ");
            hasta.HastaSikayeti.add(reader.nextLine());
            System.out.print("Hasta TC NO: ");
            hasta.HastaTC.add(reader.nextLong());
            System.out.print("Hasta Yasi: ");
            hasta.HastaYas.add(reader.nextInt());
            reader.skip("((?<!\\R)\\s)*");
            System.out.print("Hasta Tel NO: ");
            hasta.HastaTelNO.add(reader.nextLine());
        }catch (Exception e){
            System.out.println("Hasta eklenemedi!");
        }
        System.out.println("Hasta Ismi: "+hasta.HastaIsim.get(hasta.HastaIsim.size()-1));
        System.out.println("Hasta Cinsiyeti: "+hasta.HastaCinsiyet.get(hasta.HastaCinsiyet.size()-1));
        System.out.println("Hasta Şikayeti: "+hasta.HastaSikayeti.get(hasta.HastaSikayeti.size()-1));
        System.out.println("Hasta TC NO: "+hasta.HastaTC.get(hasta.HastaTC.size()-1));
        System.out.println("Hasta Yasi: "+hasta.HastaYas.get(hasta.HastaYas.size()-1));
        System.out.println("Hasta Tel NO: "+hasta.HastaTelNO.get(hasta.HastaTelNO.size()-1));
    }

    public void HastaDuzenle() {
        try {
            System.out.print("Hastanın TC NO'sunu giriniz: ");
            Long TCKontrol = reader.nextLong();
            reader.skip("((?<!\\R)\\s)*");
            for (int i = 0; i< hasta.HastaTC.size();i++){
                if (hasta.HastaTC.get(i).equals(TCKontrol)){
                    System.out.print("Hasta ismi: ");
                    hasta.HastaIsim.set(i, reader.nextLine());
                    System.out.print("Hasta Cinsiyeti: ");
                    hasta.HastaCinsiyet.set(i, reader.nextLine());
                    System.out.print("Hasta sikayeti: ");
                    hasta.HastaSikayeti.set(i, reader.nextLine());
                    System.out.print("Hasta TC NO: ");
                    hasta.HastaTC.set(i, reader.nextLong());
                    System.out.print("Hasta Yasi: ");
                    hasta.HastaYas.set(i, reader.nextInt());
                    System.out.println("Hasta Tel NO: ");
                    hasta.HastaTelNO.set(i, reader.nextLine());
                }
            }
        }catch (Exception e){
            System.out.println("Hasta Duzenlenemedi!");
        }
        System.out.println("Hasta Ismi: "+hasta.HastaIsim.get(hasta.HastaIsim.size()-1));
        System.out.println("Hasta Cinsiyeti: "+hasta.HastaCinsiyet.get(hasta.HastaCinsiyet.size()-1));
        System.out.println("Hasta Şikayeti: "+hasta.HastaSikayeti.get(hasta.HastaSikayeti.size()-1));
        System.out.println("Hasta TC NO: "+hasta.HastaTC.get(hasta.HastaTC.size()-1));
        System.out.println("Hasta Yasi: "+hasta.HastaYas.get(hasta.HastaYas.size()-1));
        System.out.println("Hasta Tel NO: "+hasta.HastaTelNO.get(hasta.HastaTelNO.size()-1));
    }
    public void HastaKanDegerleriEkle(){
        try {
            System.out.print("Hastanın TC NO'sunu giriniz: ");
            Long TCKontrol = reader.nextLong();
            reader.skip("((?<!\\R)\\s)*");
            for(int i = 0; i<hasta.HastaTC.size();i++){
                if(hasta.HastaTC.get(i).equals(TCKontrol)){
                    System.out.print("Hasta Kan Degerlerini Giriniz: ");
                    hasta.HastaKanDegeri.add(i, reader.nextLine());
                }
            }
        }catch (Exception e){
            System.out.println("Hasta Kan Degeri Eklenemedi!");
        }

    }
    public void HastaKanDegerleriDuzenle(){
        try {
            System.out.print("Hastanın TC NO'sunu giriniz: ");
            Long TCKontrol = reader.nextLong();
            reader.skip("((?<!\\R)\\s)*");
            for(int i = 0; i<hasta.HastaTC.size();i++){
                if(hasta.HastaTC.get(i).equals(TCKontrol)){
                    System.out.print("Hasta Kan Degerlerini Giriniz: ");
                    hasta.HastaKanDegeri.set(i, reader.nextLine());
                }
            }
        }catch (Exception e){
            System.out.println("Hasta Kan Degeri Eklenemedi!");
        }
    }

}
