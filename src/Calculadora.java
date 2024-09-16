import java.util.Scanner;
import java.lang.Math;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro digito: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite a conta desejada: (+, -, *, /, ^(potencia))");
        char operador = scanner.next().charAt(0);

        System.out.println("Digite o segundo digito: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        if(operacaoValida == true){
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if(num2 == 0){
                    System.out.println("Erro, 0 não é divisivel"); 
                }else{
                    resultado = num1 / num2;
                }   break;
            case '^':
                resultado = Math.pow(num1, num2) ;
                break;
                default:
                System.out.println("O operador escolhido não existe, tente novamente.");
                break;
               }
               System.out.println("O resultado é : " + resultado);
            } else{
                System.out.println("Erro ao calcular.");
            }

               scanner.close();
    }
}
