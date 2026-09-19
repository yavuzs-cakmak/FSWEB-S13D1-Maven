package org.example;



public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp (true, 1));  //true dönmeli(Gece 1'de köpeğimiz havlıyor)

        System.out.println(shouldWakeUp (false, 2));  //false dönmeli.(köpek havlamıyor.)

        System.out.println(shouldWakeUp (true, 8));  //false dönmeli.(8'den sonra ise tepki vermeliyiz.)

        System.out.println(shouldWakeUp (true, -1));  //false dönmeli(-1 geçersiz değer)
        System.out.println("hasTeen Testleri asagida:");
        System.out.println(hasTeen(9, 99, 19)); // true olmali
        System.out.println(hasTeen(23, 15, 42)); // true olmali
        System.out.println(hasTeen(22, 23, 34)); // false olmali
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        // Köpeğimiz akşam 8 ile sabah 8 arasında havlıyorsa metod true değer dönmeli.
        // Diğer şartlar altında metodumuz false değer dönmeli.
        // İkinci parametre 0'dan küçükse ya da 23'den büyükse metodumuz yine false değer dönmeli.
        if(isBarking && (clock < 0 || clock > 23)){
            return false;
        }
        if(isBarking && (clock >= 20 || clock < 8) ){
            return true;
        }

            return false;


    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if(firstAge >=13 && firstAge <=19 || secondAge >=13 && secondAge <=19 || thirdAge >=13 && thirdAge <=19){
            return true;
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer && (temp>=25 && temp<=45) || !isSummer && (temp>=25 && temp<=35) ){
            return true;
        }
        return false;
    }

    public static double area(double width, double height) {
      if(width < 0 || height <0 ){
          return -1;
      }
        return width * height;
    }

    public static double area(double radius) {
        if(radius <0 ){
            return -1;
        }
        return radius*radius*Math.PI;
    }
}
