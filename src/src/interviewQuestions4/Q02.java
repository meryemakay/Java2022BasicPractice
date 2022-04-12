package src.interviewQuestions4;

import java.util.ArrayList;
import java.util.List;

public class Q02 {

    public static void main(String[] args) {
// int array list oluşturun 10 elemandan oluşmalı
// random ekle isinde void bir metod oluşturun  ve parametresi int array list olsun.
// bu metod array list içinde 0' dan 20 ye kadar değer atasın.
// eğer çift sayı atarsa o elemaının yerine 111 yazsın
// eğer çift sayı yoksa çift sayı yoktur mesajını versin.

        ArrayList<Integer> list = new ArrayList<Integer>();

        randomEkle(list);

    }

    private static void randomEkle(ArrayList<Integer> list) {

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 20)); //0-20 arası random sayı ekler
                                                   // double verı tıpıne sahıp
        }                                         //random classı hata verıdıgınden ınt a casting yaptık

         System.out.println("random lıste :" + list);
int sayac=0;
        for (int i = 0; i <list.size(); i++) {//random olusturuln elemnlera bakılıyor
            if (list.get(i)%2==0){ //cıft sayılar
                sayac++;
                list.set(i,111);


            }

        }
        System.out.println("111 ler eklendıkten sonra random lıste :" + list);
if(sayac==0){
    System.out.println("lıstede cıft sayı yoktur");
}
        System.out.println("listenın son hali:" + list);
    }


}
