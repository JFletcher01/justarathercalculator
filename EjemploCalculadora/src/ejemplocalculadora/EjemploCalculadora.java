
package ejemplocalculadora;
import java.util.Scanner;

public class EjemploCalculadora {

   
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int menu,a,b,c;
        double numero1,numero2,sum,res,multi,div,resultado;
        boolean i=true;
        while (i=true){
            System.out.println("------------MENÚ---------------");
            System.out.println("BIENVENIDO A MI CALCULADORA");
            System.out.println("PRESIONE 1 PARA SUMAR");
            System.out.println("PRESIONE 2 PARA RESTAR");
            System.out.println("PRESIONE 3 PARA MULTIPLICAR");
            System.out.println("PRESIONE 4 PARA DIVIDIR");
            System.out.println("PRESIONE 5 PARA UNA POTENCIA");
            System.out.println("PRESIONE 6 PARA UNA ECUACIÓN DE SEGUNDO GRADO(ax2+bx+c=0)");
            System.out.println("-------------------------------");
            menu=teclado.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Has elegido suma");
                    System.out.println("Introduce el primer número");
                    numero1=teclado.nextDouble();
                    System.out.println("Introduce el segundo número");
                    numero2=teclado.nextDouble();
                    resultado = numero1+numero2;
                    System.out.println("El resultado es: "+resultado);
                    break;
                case 2:
                    System.out.println("Has elegido resta");
                    System.out.println("Introduce el primer número");
                    numero1=teclado.nextDouble();
                    System.out.println("Introduce el segundo número");
                    numero2=teclado.nextDouble();
                    resultado = numero1-numero2;
                    System.out.println("El resultado es: "+resultado);
                    break;
                case 3:
                    System.out.println("Has elegido multiplicacion");
                    System.out.println("Introduce el primer número");
                    numero1=teclado.nextDouble();
                    System.out.println("Introduce el segundo número");
                    numero2=teclado.nextDouble();
                    resultado = numero1*numero2;
                    System.out.println("El resultado es: "+resultado);
                    break;
                case 4:
                    System.out.println("Has elegido division");
                    System.out.println("Introduce el primer número");
                    numero1=teclado.nextDouble();
                    System.out.println("Introduce el segundo número");
                    numero2=teclado.nextDouble();
                    resultado=numero1/numero2;
                    System.out.println("El resultado es: "+resultado);
                    break;
                case 5:
                    int base,operador;
                    System.out.println("Has elegido potencia");
                    System.out.println("Introduce la base");
                    base=teclado.nextInt();
                    System.out.println("Introduce el operador");
                    operador=teclado.nextInt();
                    resultado=Math.pow(base,operador);
                    System.out.println("El resultado es: "+resultado);
                    break;
                case 6:
                    double resultado2;
                    System.out.println("Has elegido ecuacion de segundo grado");
                    System.out.println("Introduce el numero a");
                    a=teclado.nextInt();
                    System.out.println("Introduce el numero b");
                    b=teclado.nextInt();
                    System.out.println("Introduce el numero c");
                    c=teclado.nextInt();
                    resultado=(-b+(Math.sqrt((Math.pow(b,2)-4*a*c)))/2*a);
                    resultado2=(-b+(Math.sqrt((Math.pow(b,2)-4*a*c)))/2*a);
                    System.out.println("El resultado de x1 es: "+resultado+" y el resultado de x2 es "+resultado2);
                    break;
                    
            }
                
            
        }
    
    
    }
   
}
