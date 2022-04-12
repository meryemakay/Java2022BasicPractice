package src.interviewQuestions4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QO5 {
     /*
Problem Tanımı :
getSum isminde bir method oluşturun.
Parametresi ArrayList'tir.
Dizideki tüm $ ları kaldır ve tüm sayıları topla
return yaptğımız veri tipi 'int' olmalıdır.
sonuç 0'dan küçükse, -1 yazdırın.

Örnek1:
ArrayList = $13, $15, $20
Cevap = 48 olmalı

Örnek 2 :
ArrayList= $-13, $0, $0
Cevap = -1 olmalı.
 */
     public static void main(String[] args) {
         List<String> arrlist = new ArrayList<String>(Arrays.asList("$13", "$15", "$20"));
       //  List<String> arrlist = new ArrayList<String>(Arrays.asList("$13", "$15", "$-30"));


         System.out.println("toplam : "+  getSum(arrlist));



     }

    private static int getSum(List<String> arrlist) {
         int toplam = 0;

        for (String each:arrlist) {
            String str=each.replace("$" ,"");


            toplam+=Integer.parseInt(str);

        }


        if (toplam<0) {

            return -1;

        }else
            return toplam;
    }

}
