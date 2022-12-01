
import java.text.spi.BreakIteratorProvider;
import java.util.Scanner;

//1 den n kadar sayıların toplamı

/*
public class vize1 {
 public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen sayı giriniz:.. ");
        int sayı =scanner.nextInt();
        int toplam=0;
        for (int i=0;i<=sayı;i++){
            toplam+=i;
             
        }
        System.out.println(toplam);

    }
    
}
*/
// 0 sıfırdan k sayısına kadar cift sayıların toplamı 
/*
public class vize1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen sayı giriniz:.. ");
        int sayı =scanner.nextInt();
        int toplam=0;
        
        
        for (int i=0; i<sayı;i++){
           if(i%2==0) {
               toplam+=i;
           
           }
            
            
        }System.out.println(toplam);
   
    }
  
}
*/



//kalvyeden girilen bir sayının mutlak değerini alma





/*
public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen sayı giriniz:..");
        int sayı =scanner.nextInt();
          if(sayı<0){
              System.out.println(sayı*-1);
          }  
          else{
              System.out.println(sayı);
 
          }
    }

}
   */






//kalvyeden girilen uc kenar sayısı  (eşit ikiz coklu )ucken yazdıran  program 
/*
public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen biinci giriniz:..");
        int birk =scanner.nextInt();
        System.out.print("lütfen ikinci giriniz:..");
        int ikik =scanner.nextInt();
        System.out.print("lütfen ucuncu giriniz:..");
        int uck =scanner.nextInt();
        
        if(birk==ikik &&birk==uck)
         {
             System.out.println("girdiniz değerler eş kenar uç gene ayıtır..");
                   System.out.println("ve onun çevresi"+3*birk);
 
        }
        else if(birk==ikik  && ikik!=uck){
            
            System.out.println(" girdiniz uzunluklar bir ikiz kenara ayıtır");
  
        }
        else if(birk!=ikik || birk!=uck)  {
            
            System.out.println(" girdiniz ucgen cokl");
            
        }
        
    }

}
*/





//kalvyeden ngirilen bir tam sayı bolenleri hisablyan program
/*
public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen sayı giriniz:..");
        int sayı =scanner.nextInt();
         int toplam =0;
        for (int i=1;i<=sayı;i++){
            if(sayı%i==0){
               System.out.println(i);
                toplam +=i;
            }
        }System.out.println("toplamınız: "+toplam);
    }
}
*/


/*
public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen  1 sayı giriniz:..");
        int sayı =scanner.nextInt();
        System.out.println("lütfen ikinci sayı giriniz: ..");
        int say2=scanner.nextInt();
        int c=(sayı-say2);
        int a=1;
        while(sayı>0){
            a=a*sayı;
            sayı--;
        }int o=1 ;
        while(say2>0){
            o*=say2;
            say2--;    
        }
        int w=1;
        while(c>0){
            w*=c;
            c--;
            
        } System.out.println(a/(o*w));
    }

}
*/


//signum işaret fonksiyona göre uygulamayı yaoan program 
/*
public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen sayı giriniz:..");
        int x =scanner.nextInt();
        int c=x*x-5*x+3;
        if(c<0){
            System.out.println("-1"); }
        else if(x>0){
            System.out.println("1");}
        else {
            System.out.println("0");}
 }

}
*/




// kalvyeden girile saat ile dakka arasındaki açı bulduran program
/*
public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen saat giriniz: ");
        int saat =scanner.nextInt();
        System.out.println("lütfen dakika giriniz: ");
        int dak=scanner.nextInt();
        if(saat>12){
            saat=saat%12;
        }
        double c=(saat*60-dak*11);
        if (c<0){
            c*=-1;
        }
        c=c/2; 
        System.out.println(c);
          
    }

}
*/
// kLVYEDEN GİRİLEN İKİ SAYI ÇARPMA OBERATORU KULANMADAN ÇARAPAN PROGRAM :

/*
public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen sayı giriniz:..");
        int sayı =scanner.nextInt();
        System.out.println("ikinci sayı giriniz: ");
        int sayı2=scanner.nextInt();
        
        int toplam=0;
         for (int i =1; i <=sayı2; i++) {
             toplam=toplam+sayı;
           
        }
        System.out.println(toplam);
    }

}
*/
//kalvyeden yazılıan bi sayının testen yazılış hali


/*
public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen sayı giriniz:..");
        
        int sayı =scanner.nextInt();
        System.out.println("girdiniz sayının tersi: ");
        while(sayı>0){
            System.out.print(sayı%10);
            sayı/=10;

        }
 }

}
*/

// kalvyeden giilen b tam sayı b=a^3-a^2 0ile yuz arasında bulduran program:
/*
 public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);{
        System.out.print("lütfen sayı giriniz:..");
        int x =scanner.nextInt();
        int b;
        for(int i=0;i<100;i++){
    b=(i*i*i)-(i*i);
            
        if(b==x){
                System.out.println(i);
            }
   
        }
      
        
    }
    }

}
*/



//    Sola dayalı ucgen şekli
/*
public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen sayı giriniz:..");
        int yıld =scanner.nextInt();
        for (int i = 0; i <=yıld; i++) {//satır 
            System.out.print(i+" ");//hangi satır 
            for (int sut = 0; sut < i; sut++) {
                System.out.print("*");
            }
              System.out.println("");
        }

    }

}
*/




//  sola dayalı azalan bir yıldız sayısı: 
/*
public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen  uzunluk giriniz:..");
        int uzunluk =scanner.nextInt();
        for (int satır = 0; satır <= uzunluk; satır++) {
            System.out.print(satır+" ");
            for(int sutun=uzunluk;sutun>satır;sutun--){
                
                System.out.print("*");

            }
            System.out.println("");
            
            
        }
 
    }

}
*/

//sağa dayalı üçgen şekli atırarak
//uzunluğa göre bir boşluk sayısı
/*
başla 
kulancıan bir uzunluk sayısını alınız
her satır bir artı zaman bir boşluk azalıb bir yıldız eklencek 





*/

/*
public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen sayı giriniz:");
        int uzunluk =scanner.nextInt();

        for(int satır=0;satır<=uzunluk;satır++){
            for (int boşluk=uzunluk;boşluk>satır;boşluk--){
                System.out.print(" ");
  
            }
            for (int sutun=0;sutun<satır;sutun++){
                System.out.print("*"); 
            }
            
            System.out.println("");
            
        }
 
    }

}
*/


//sağa dayalı üçgen azartalarak 
/*
satır her bir deva artı zaman boşluk bir artıyor yıldız bir eksiliyor


*/
/*
public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen sayı giriniz:..");
        int uzunluk =scanner.nextInt();
        for (int satır=0;satır<=uzunluk;satır++){
            for (int boşluk =0;boşluk<satır;boşluk++){
                System.out.print(" ");
            }
            for (int sutun=uzunluk;sutun>satır;sutun--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}

*/

/*
public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen  uzzunluğu giriniz: ");
        int uzunluk =scanner.nextInt();
        for(int satır=0;satır<uzunluk;satır++){
            
            for (int bosluk=uzunluk;bosluk>satır ; bosluk--){
                System.out.print(" ");
            }
            for(int sutun=0;sutun<=satır;sutun++){
                System.out.print("*");
            }
            for (int sutun=0;sutun<satır;sutun++){
                System.out.print("*");
            }
            System.out.println("");  //altsatıra geçmesi için 
          
        }

    }

}
*/


// ters uçgen şekli cizmek;
/*
  1  *******
  2   *****
   3   ***
   4    *
*/
/*
public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen uzunluk giriniz:..");
        int uzunluk =scanner.nextInt();
       

        for (int satır=0;satır<uzunluk;satır++){
            for (int bosluk =0;bosluk<satır;bosluk++){
                System.out.print(" ");
  
            }
            for(int sutun=uzunluk;sutun>satır;sutun--){
                System.out.print("*");
            }
            for(int sutun=uzunluk-1;sutun>satır;sutun--){
                System.out.print("*");
            }
            System.out.println("");
 
        }
        

    }

}

*/


/*baklava şekli
*/

/*
public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen uzunluk giriniz:..");
        int uzunluk =scanner.nextInt();
        //ust kısım
       for(int satır=0;satır<uzunluk;satır++){
            for (int bosluk=uzunluk;bosluk>satır;bosluk--){
                System.out.print("  ");
            }
            for(int sutun=0;sutun<=satır;sutun++){
                System.out.print("* ");
            }
            for (int sutun=0;sutun<satır;sutun++){
                System.out.print("* ");
            }
            System.out.println(" ");  //altsatıra geçmesi için 
        }
       //alt kısım
        for (int satır=0;satır<=uzunluk;satır++){
            for (int bosluk =0;bosluk<satır;bosluk++){
                System.out.print("  ");
  
            }
            for(int sutun=uzunluk;sutun>satır;sutun--){
                System.out.print("* ");
            }
            for(int sutun=uzunluk-1;sutun>satır;sutun--){
                System.out.print("* ");
            }
            System.out.println(" ");
 
        }
    }
 
}
*/



// tek kanatlı kelebek:


/*
public class vize1 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen sayı giriniz:..");
        int uzunluk =scanner.nextInt();
        for(int satır=0;satır<=uzunluk;satır++){
            for(int sutun =uzunluk;sutun>satır;sutun--){
                System.out.print("*");
            }
            System.out.println("");
            
   
        }System.out.println(" ------------@");
        
        System.out.print(" ------------@");
        for(int satır=0;satır<=uzunluk;satır++){
            for(int sutun =0;sutun<satır;sutun++){
                System.out.print("*");
            }
            System.out.println("");

        }
        

    }

}
*/
/*
public class  vize1{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("lütfen sayı giriniz: ");
        int yıld=scanner.nextInt();
        for (int i = 0; i <= yıld; i++) {
            for(int sut=0;sut<i;sut++){
                System.out.print("*");
            }
            System.out.println("");
        }   
    }
}
*/

/*
public  class vize1{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen yıldız sayısı giriniz");
        int x=scanner.nextInt();
        for(int i=0;i<=x;i++){
            for(int bosluk=0;bosluk<i;bosluk++){
                System.out.print("");
                
            }System.out.println("*");
            System.out.println("");
            
            
            
            
        }
                
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
}

*/


























