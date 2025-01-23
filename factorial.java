import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresa un número: ");
            int num = scanner.nextInt();

            int fact = 1; 
        
            for(int i=1; i <= num; i++){
                fact = fact * i; 
            }

            System.out.println("El factorial es: " + fact);

        scanner.close();
    }
}