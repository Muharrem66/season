import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaçıncı AY ? : ");
        int ay = input.nextInt();
        System.out.println(" Swith- case cevap: ");
        switch (ay){
            case 12, 1, 2-> System.out.println("kış");
            case 3, 4, 5-> System.out.println("ilkbahar");
            case 6, 7, 8-> System.out.println("Yaz");
            case 9, 10, 11-> System.out.println("Sonbahar");
            default -> System.out.println("Ay 1-12 arasındaolmalıdır!!!!");
        }
    }
}
