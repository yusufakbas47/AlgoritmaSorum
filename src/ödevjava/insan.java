
package ödevjava;
/*Benim sorumda bir yazılım şirketinde çalışanların kişisel bilgilerini , çalışma sürelerini ve maaş düzenlmesinin
yapılacağı bir uygulama kodlanmalıdır.Bu uygulamada temel bir sınıf tasarlamanız gerekmektedir
.Temel sınıfın en az üç özelliği olması gerekmektedir.Bunlar string tipinde ad , soyad ve tamsayı tipinde yaş olmalıdır
.Belirlenen bu özelliklerden en az bir tanesi private eşirim belirleyicileri
ile tanımlanmalıdır.Sınıfın parametre alan bir yapıcı metodu tanımlanmalıdır.Bu yapıcı metot sınıf sınıf özelliklerini
en az ikisine ilk değer atamalıdır.Sınıfın en az üç fonksiyonu olmalıdır. Bu fonksiyonlardan biri OOP için önemli
bir kriter olan çok biçimlilik(polymorphism) özelliğini sağlamalıdır.Fonksiyonlardan biri private erişim belirleyicisi
ile tanımlanmalıdır.Temel sınıftan türetilen yeni bir sınıf tanımlamanız istenmektedir.*/

public class insan {
    
    public String ad;
    public String soyad;
    private int yas;
    
    public insan(String ad,String soyad,int yas){
        this.ad=ad;
        this.soyad=soyad;
        this.yas=yas;
    }
   
public int getYas(){
    return yas;
}
    
    
}
