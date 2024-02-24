import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz : ");        //sınır sayısı sor ve number'e ata
        number = input.nextInt();

        System.out.println("4'ün kuvvetleri");
        System.out.println("------------------------");
        for (int i = 1; Math.pow(4, i) <= number; i++) { //sınır sayısını geçmediği taktirde üssü bir arttır ve işleme devam et
            System.out.println(Math.pow(4, i));
        }
        System.out.println("------------------------");
        System.out.println("5'in kuvvetleri");
        for (int i = 1; Math.pow(5, i) <= number; i++) { ////sınır sayısını geçmediği taktirde üssü bir arttır ve işleme devam et
            System.out.println(Math.pow(5, i));

        }
    }
} //Ali Eren KÖSE 24/02/2024 17:48