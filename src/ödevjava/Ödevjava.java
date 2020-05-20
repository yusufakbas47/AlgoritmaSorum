package ödevjava;

class müdür extends insan{
    
    int maas;
    public müdür(String ad,String soyad,int yas,int maas)
    {
        super(ad,soyad,yas);
        this.maas =maas;
    }
     public int zamYap(int maas,double zamOran)
    {   
        return this.maas+=this.maas*zamOran;
    }
    
}

class yazilimci extends insan{
    
    int maas;
    int calismaSüresi;
    String görev;
    
    public yazilimci(String ad,String soyad,int yas,int maas,int calismaSüresi,String görev)
    {
        super(ad,soyad,yas);
        this.maas =maas;
        this.calismaSüresi=calismaSüresi;
        this.görev =görev;
    }
    
   public int zamYap()    //vergi alma olayıda kişinin mesleğine göre yapılıyor.
         {
              int sonuc;
             if(görev=="Coder")      
             {
                 sonuc=maas+700;
             }else if(görev=="Tasarim")
             {
                 sonuc=maas+500;
             }else
             {
                 sonuc=maas+200;
             }
             return sonuc;
         }
   public double zamYap(double Oran)    //vergi alma olayıda kişinin mesleğine göre yapılıyor.
         {
              
             double sonuc;
             if(görev=="Coder")      
             {
                 sonuc=maas+(maas*Oran);
             }else if(görev=="Tasarim")
             {
                 sonuc=maas+(maas*Oran);
                 
             }else
             {
                 sonuc=maas+(maas*0.5);
             }
             return sonuc;
         }
    
   
    public int getCalismaSüresi(){
        return calismaSüresi;
    }
    
    public int yazilimciCalistir(){
        
        return calismaSüresi++;
    }
 
    
}

class temizlikGörevlisi extends insan{
    
    int maas;
    int calismaSüresi;
    public temizlikGörevlisi(String ad,String soyad,int yas,int maas)
    {
        super(ad,soyad,yas);
        this.maas =maas;
        this.calismaSüresi=calismaSüresi;
    }
    
     private int getCalismaSüresi(){ 
        return calismaSüresi;
    }
    
    public int temizlikciCalistir(){
        
        return calismaSüresi++;
    }
}

public class Ödevjava {
    public static void main(String[] args) {
       yazilimci y1=new yazilimci("ali", "ak", 30, 3000,50,"Coder");
        System.out.println("Adı:"+y1.ad+" Soyadı:"+" Maaş:"+y1.maas +" Yaşı :"+y1.getYas());
        
        y1.yazilimciCalistir();
        y1.yazilimciCalistir();
        System.out.println("Zamdan Sonra maaşı:"+y1.zamYap()+" Çalısılan süre:"+y1.getCalismaSüresi());
       
     
        yazilimci y2=new yazilimci("ahmet", "yılmaz", 35, 5000,300,"Tasarim");
        System.out.println("Adı:"+y2.ad+" Soyadı:"+" Maaş:"+y2.maas +" Yaşı :"+y2.getYas());
        
        y2.yazilimciCalistir();
        System.out.println("Zamdan Sonra maaşı:"+y2.zamYap(0.50)+" Çalısılan süre:"+y2.getCalismaSüresi());
        
        
        temizlikGörevlisi t1 = new temizlikGörevlisi("ayşe","tekin", 30, 2600);
        System.out.println("Adı :"+t1.ad+" Soyad:"+t1.soyad+" Maas: "+t1.maas);
        
        
    }
    
}
