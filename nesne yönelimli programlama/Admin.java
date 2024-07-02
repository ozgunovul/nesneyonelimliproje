import java.util.Scanner;

public class Admin {
    Scanner reader = new Scanner(System.in);
    Doktor doktor = new Doktor();
    Hasta hasta = new Hasta();

    Hemsire hemsire = new Hemsire();
    Laborant laborant = new Laborant();
    Sekreter sekreter = new Sekreter();

    //*************DOKTOR*************\\
    public void DoktorEkle(){
        System.out.println("-----------Doktor Ekleme-----------");
        try {
            System.out.print("Doktor ismi: ");
            doktor.DoktorIsim.add(reader.nextLine());
            System.out.print("Doktor Cinsiyeti: ");
            doktor.DoktorCinsiyet.add(reader.nextLine());
            System.out.print("Doktor TC NO: ");
            doktor.DoktorTC.add(reader.nextLong());
            System.out.print("Doktor Yasi: ");
            doktor.DoktorYas.add(reader.nextInt());
            reader.skip("((?<!\\R)\\s)*");
            System.out.print("Doktor Tel NO: ");
            doktor.DoktorTelNO.add(reader.nextLine());
        }catch (Exception e){
            System.out.println("Doktor eklenemedi!");
        }
        System.out.println("Doktor Ismi: "+doktor.DoktorIsim.get(doktor.DoktorIsim.size()-1));
        System.out.println("Doktor Cinsiyeti: "+doktor.DoktorCinsiyet.get(doktor.DoktorCinsiyet.size()-1));
        System.out.println("Doktor TC NO: "+doktor.DoktorTC.get(doktor.DoktorTC.size()-1));
        System.out.println("Doktor Yasi: "+doktor.DoktorYas.get(doktor.DoktorYas.size()-1));
        System.out.println("Doktor Tel NO: "+doktor.DoktorTelNO.get(doktor.DoktorTelNO.size()-1));
    }
    public void DoktorSil(){
        Long TCKontrol;
        try {
            System.out.print("Doktorun TC NO'sunu giriniz: ");
            TCKontrol = reader.nextLong();
            for (int i = 0; i< hasta.HastaTC.size();i++){
                if (doktor.DoktorTC.get(i).equals(TCKontrol)){
                    doktor.DoktorTC.remove(i);
                    doktor.DoktorYas.remove(i);
                    doktor.DoktorIsim.remove(i);
                    doktor.DoktorCinsiyet.remove(i);
                    doktor.DoktorTelNO.remove(i);
                    System.out.println("DoktorSilindi!");
                }
            }
        }catch (Exception e){
            System.out.println("Doktor Silinemedi!");
        }
    }
    public void DoktorGoster(){
        for (int i = 0; i < hasta.HastaIsim.size();i++){
            System.out.println("Doktor ismi: "+doktor.DoktorIsim.get(i));
            System.out.println("Doktor cinsiyeti: "+doktor.DoktorCinsiyet.get(i));
            System.out.println("Doktor TC NO: "+doktor.DoktorTC.get(i));
            System.out.println("Doktor Yasi: "+doktor.DoktorYas.get(i));
            System.out.println("Doktor Tel NO: "+doktor.DoktorTelNO.get(i));
        }
    }
    public void DoktorDuzenle(){
        try {
            System.out.print("Doktorun TC NO'sunu giriniz: ");
            Long TCKontrol = reader.nextLong();
            reader.skip("((?<!\\R)\\s)*");
            for (int i = 0; i< hasta.HastaTC.size();i++){
                if (doktor.DoktorTC.get(i).equals(TCKontrol)){
                    System.out.print("Doktor ismi: ");
                    doktor.DoktorIsim.set(i, reader.nextLine());
                    System.out.print("Doktor Cinsiyeti: ");
                    doktor.DoktorCinsiyet.set(i, reader.nextLine());
                    System.out.print("Doktor TC NO: ");
                    doktor.DoktorTC.set(i, reader.nextLong());
                    System.out.print("Doktor Yasi: ");
                    doktor.DoktorYas.set(i, reader.nextInt());
                    reader.skip("((?<!\\R)\\s)*");
                    System.out.println("Doktor Tel NO: ");
                    doktor.DoktorTelNO.set(i, reader.nextLine());
                }
            }
        }catch (Exception e){
            System.out.println("Doktor Duzenlenemedi!");
        }
    }
    //*************HEMSİRE*************\\
    public void HemsireEkle(){
        System.out.println("-----------Hemsire Ekleme-----------");
        try {
            System.out.print("Hemsire ismi: ");
            hemsire.HemsireIsim.add(reader.nextLine());
            System.out.print("Hemsire Cinsiyeti: ");
            hemsire.HemsireCinsiyet.add(reader.nextLine());
            System.out.print("Hemsire TC NO: ");
            hemsire.HemsireTC.add(reader.nextLong());
            System.out.print("Hemsire Yasi: ");
            hemsire.HemsireYas.add(reader.nextInt());
            reader.skip("((?<!\\R)\\s)*");
            System.out.print("Hemsire Tel NO: ");
            hemsire.HemsireTelNO.add(reader.nextLine());
        }catch (Exception e){
            System.out.println("Hemsire eklenemedi!");
        }
        System.out.println("Hemsire Ismi: "+hemsire.HemsireIsim.get(hemsire.HemsireIsim.size()-1));
        System.out.println("Hemsire Cinsiyeti: "+hemsire.HemsireCinsiyet.get(hemsire.HemsireCinsiyet.size()-1));
        System.out.println("Hemsire TC NO: "+hemsire.HemsireTC.get(hemsire.HemsireTC.size()-1));
        System.out.println("Hemsire Yasi: "+hemsire.HemsireYas.get(hemsire.HemsireYas.size()-1));
        System.out.println("Hemsire Tel NO: "+hemsire.HemsireTelNO.get(hemsire.HemsireTelNO.size()-1));
    }
    public void HemsireSil(){
        Long TCKontrol;
        try {
            System.out.print("Hemsirenin TC NO'sunu giriniz: ");
            TCKontrol = reader.nextLong();
            for (int i = 0; i< hasta.HastaTC.size();i++){
                if (hemsire.HemsireTC.get(i).equals(TCKontrol)){
                    hemsire.HemsireTC.remove(i);
                    hemsire.HemsireYas.remove(i);
                    hemsire.HemsireIsim.remove(i);
                    hemsire.HemsireCinsiyet.remove(i);
                    System.out.println("Hasta Silindi!");
                }
            }
        }catch (Exception e){
            System.out.println("Hemsire Silinemedi!");
        }
    }
    public void HemsireGoster(){
        for (int i = 0; i < hemsire.HemsireIsim.size();i++){
            System.out.println("Hemsire ismi: "+hemsire.HemsireIsim.get(i));
            System.out.println("Hemsire cinsiyeti: "+hemsire.HemsireCinsiyet.get(i));
            System.out.println("Hemsire TC NO: "+hemsire.HemsireTC.get(i));
            System.out.println("Hemsire Yasi: "+hemsire.HemsireYas.get(i));
            System.out.println("Hemsire Tel NO: "+hemsire.HemsireTelNO.get(i));
        }
    }
    public void HemsireDuzenle(){
        try {
            System.out.print("Hemsirenin TC NO'sunu giriniz: ");
            Long TCKontrol = reader.nextLong();
            reader.skip("((?<!\\R)\\s)*");
            for (int i = 0; i< hemsire.HemsireTC.size();i++){
                if (hemsire.HemsireTC.get(i).equals(TCKontrol)){
                    System.out.print("Hemsire ismi: ");
                    hemsire.HemsireIsim.set(i, reader.nextLine());
                    System.out.print("Hemsire Cinsiyeti: ");
                    hemsire.HemsireCinsiyet.set(i, reader.nextLine());
                    System.out.print("Hemsire TC NO: ");
                    hemsire.HemsireTC.set(i, reader.nextLong());
                    System.out.print("Hemsire Yasi: ");
                    hemsire.HemsireYas.set(i, reader.nextInt());
                    reader.skip("((?<!\\R)\\s)*");
                    System.out.println("Hemsire Tel NO: ");
                    hemsire.HemsireTelNO.set(i, reader.nextLine());
                }
            }
        }catch (Exception e){
            System.out.println("Hasta Duzenlenemedi!");
        }
    }
    //*************LABORANT*************\\
    public void LaborantEkle(){
        System.out.println("-----------Laborant Ekleme-----------");
        try {
            System.out.print("Laborant ismi: ");
            laborant.LaborantIsim.add(reader.nextLine());
            System.out.print("Laborant Cinsiyeti: ");
            laborant.LaborantCinsiyet.add(reader.nextLine());
            System.out.print("Laborant TC NO: ");
            laborant.LaborantTC.add(reader.nextLong());
            System.out.print("Laborant Yasi: ");
            laborant.LaborantYas.add(reader.nextInt());
            reader.skip("((?<!\\R)\\s)*");
            System.out.print("Laborant Tel NO: ");
            laborant.LaborantTelNO.add(reader.nextLine());
        }catch (Exception e){
            System.out.println("Laborant eklenemedi!");
        }
        System.out.println("Laborant Ismi: "+laborant.LaborantIsim.get(laborant.LaborantIsim.size()-1));
        System.out.println("Laborant Cinsiyeti: "+laborant.LaborantCinsiyet.get(laborant.LaborantCinsiyet.size()-1));
        System.out.println("Laborant TC NO: "+laborant.LaborantTC.get(laborant.LaborantTC.size()-1));
        System.out.println("Laborant Yasi: "+laborant.LaborantYas.get(laborant.LaborantYas.size()-1));
        System.out.println("LaborantTel NO: "+laborant.LaborantTelNO.get(laborant.LaborantTelNO.size()-1));
    }
    public void LaborantSil(){
        Long TCKontrol;
        try {
            System.out.print("Laborantın TC NO'sunu giriniz: ");
            TCKontrol = reader.nextLong();
            for (int i = 0; i< laborant.LaborantTC.size();i++){
                if (laborant.LaborantTC.get(i).equals(TCKontrol)){
                    laborant.LaborantTC.remove(i);
                    laborant.LaborantYas.remove(i);
                    laborant.LaborantIsim.remove(i);
                    laborant.LaborantCinsiyet.remove(i);
                    laborant.LaborantTelNO.remove(i);
                    System.out.println("Laborant Silindi!");
                }
            }
        }catch (Exception e){
            System.out.println("Laborant Silinemedi!");
        }
    }
    public void LaborantGoster(){
        for (int i = 0; i < laborant.LaborantIsim.size();i++){
            System.out.println("Laborant ismi: "+laborant.LaborantIsim.get(i));
            System.out.println("Laborant cinsiyeti: "+laborant.LaborantCinsiyet.get(i));
            System.out.println("Laborant TC NO: "+laborant.LaborantTC.get(i));
            System.out.println("Laborant Yasi: "+laborant.LaborantYas.get(i));
            System.out.println("Laborant Tel NO: "+laborant.LaborantTelNO.get(i));
        }
    }
    public void LaborantDuzenle(){
        try {
            System.out.print("Laborantın TC NO'sunu giriniz: ");
            Long TCKontrol = reader.nextLong();
            reader.skip("((?<!\\R)\\s)*");
            for (int i = 0; i< laborant.LaborantTC.size();i++){
                if (laborant.LaborantTC.get(i).equals(TCKontrol)){
                    System.out.print("Laborant ismi: ");
                    laborant.LaborantIsim.set(i, reader.nextLine());
                    System.out.print("Laborant Cinsiyeti: ");
                    laborant.LaborantCinsiyet.set(i, reader.nextLine());
                    System.out.print("Laborant TC NO: ");
                    laborant.LaborantTC.set(i, reader.nextLong());
                    System.out.print("Laborant Yasi: ");
                    laborant.LaborantYas.set(i, reader.nextInt());
                    reader.skip("((?<!\\R)\\s)*");
                    System.out.println("Laborant Tel NO: ");
                    laborant.LaborantTelNO.set(i, reader.nextLine());
                }
            }
        }catch (Exception e){
            System.out.println("Laborant Duzenlenemedi!");
        }
    }
    //*************SEKRETER*************\\
    public void SekreterEkle(){
        System.out.println("-----------Sekreter Ekleme-----------");
        try {
            System.out.print("Sekreter ismi: ");
            sekreter.SekreterIsim.add(reader.nextLine());
            System.out.print("Sekreter Cinsiyeti: ");
            sekreter.SekreterCinsiyet.add(reader.nextLine());
            System.out.print("Sekreter TC NO: ");
            sekreter.SekreterTC.add(reader.nextLong());
            System.out.print("Sekreter Yasi: ");
            sekreter.SekreterYas.add(reader.nextInt());
            reader.skip("((?<!\\R)\\s)*");
            System.out.print("Sekreter Tel NO: ");
            sekreter.SekreterTelNO.add(reader.nextLine());
        }catch (Exception e){
            System.out.println("Sekreter eklenemedi!");
        }
        System.out.println("Sekreter Ismi: "+sekreter.SekreterIsim.get(sekreter.SekreterIsim.size()-1));
        System.out.println("Sekreter Cinsiyeti: "+sekreter.SekreterCinsiyet.get(sekreter.SekreterCinsiyet.size()-1));
        System.out.println("Sekreter TC NO: "+sekreter.SekreterTC.get(sekreter.SekreterTC.size()-1));
        System.out.println("Sekreter Yasi: "+sekreter.SekreterYas.get(sekreter.SekreterYas.size()-1));
        System.out.println("Sekreter Tel NO: "+sekreter.SekreterTelNO.get(sekreter.SekreterTelNO.size()-1));
    }
    public void SekreterSil(){
        Long TCKontrol;
        try {
            System.out.print("Sekreterin TC NO'sunu giriniz: ");
            TCKontrol = reader.nextLong();
            for (int i = 0; i< sekreter.SekreterTC.size();i++){
                if (sekreter.SekreterTC.get(i).equals(TCKontrol)){
                    sekreter.SekreterTC.remove(i);
                    sekreter.SekreterYas.remove(i);
                    sekreter.SekreterIsim.remove(i);
                    sekreter.SekreterCinsiyet.remove(i);
                    sekreter.SekreterTelNO.remove(i);
                    System.out.println("Sekreter Silindi!");
                }
            }
        }catch (Exception e){
            System.out.println("Sekreter Silinemedi!");
        }
    }
    public void SekreterGoster(){
        for (int i = 0; i < sekreter.SekreterIsim.size();i++){
            System.out.println("Sekreter ismi: "+sekreter.SekreterIsim.get(i));
            System.out.println("Sekreter cinsiyeti: "+sekreter.SekreterCinsiyet.get(i));
            System.out.println("Sekreter TC NO: "+sekreter.SekreterTC.get(i));
            System.out.println("Sekreter Yasi: "+sekreter.SekreterYas.get(i));
            System.out.println("Sekreter Tel NO: "+sekreter.SekreterTelNO.get(i));
        }
    }
    public void SekreterDuzenle(){
        try {
            System.out.print("Sekreterin TC NO'sunu giriniz: ");
            Long TCKontrol = reader.nextLong();
            reader.skip("((?<!\\R)\\s)*");
            for (int i = 0; i< sekreter.SekreterTC.size();i++){
                if (sekreter.SekreterTC.get(i).equals(TCKontrol)){
                    System.out.print("Sekreter ismi: ");
                    sekreter.SekreterIsim.set(i, reader.nextLine());
                    System.out.print("Sekreter Cinsiyeti: ");
                    sekreter.SekreterCinsiyet.set(i, reader.nextLine());
                    System.out.print("Sekreter TC NO: ");
                    sekreter.SekreterTC.set(i, reader.nextLong());
                    System.out.print("Sekreter Yasi: ");
                    sekreter.SekreterYas.set(i, reader.nextInt());
                    reader.skip("((?<!\\R)\\s)*");
                    System.out.println("Sekreter Tel NO: ");
                    sekreter.SekreterTelNO.set(i, reader.nextLine());
                }
            }
        }catch (Exception e){
            System.out.println("Sekreter Duzenlenemedi!");
        }
    }


}
