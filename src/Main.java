import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int birthYear;
        Scanner input= new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz: ");
        birthYear = input.nextInt();
        String message = "Çin Zodyağınız: ";

        int zodiacCalculator = birthYear%12;

        if (zodiacCalculator == 0){
            System.out.println(message + "Maymun");
        }else if (zodiacCalculator == 1){
            System.out.println(message + "Horoz");
        }else if (zodiacCalculator == 2){
            System.out.println(message + "Köpek");
        }else if (zodiacCalculator == 3){
            System.out.println(message + "Domuz");
        }else if (zodiacCalculator == 4){
            System.out.println(message + "Fare");
        }else if (zodiacCalculator == 5){
            System.out.println(message + "Öküz");
        }else if (zodiacCalculator == 6){
            System.out.println(message + "Kaplan");
        }else if (zodiacCalculator == 7){
            System.out.println(message + "Tavşan");
        }else if (zodiacCalculator == 8){
            System.out.println(message + "Ejderha");
        }else if (zodiacCalculator == 9){
            System.out.println(message+ "Yılan");
        }else if (zodiacCalculator == 10){
            System.out.println(message + "At");
        }else {
            System.out.println(message + "Koyun");
        }
    }
}
