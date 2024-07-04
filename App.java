import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Ret.Retangulo rect = new Ret.Retangulo();

    System.out.println("Entre com a largura do retangulo:");
    rect.width = sc.nextDouble();
    System.out.println("Entre com a altura do retangulo:");
    rect.height = sc.nextDouble();

    System.out.printf("ÁREA = %.2f%n", rect.area());
    System.out.printf("PERÍMETRO = %.2f%n", rect.perimeter());
    System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
    }
}
