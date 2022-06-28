import java.util.Scanner;

public class Calcular {
    public void capaturaDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite primer valor");
        float valor1 = sc.nextFloat();
        System.out.println("Digite segundo valor");
        float valor2 = sc.nextFloat();
        sc.close();
        float suma, resta, multi, div;
        suma = suma(valor1, valor2);
        resta = resta(valor1, valor2);
        multi = multi(valor1, valor2);
        div= divi(valor1, valor2);
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multi);
        System.out.println(div);
    }
    public float suma(float v1, float v2){
        float suma = v1 + v2;
        return suma;
    }
    public float resta(float v1, float v2){
        float resta = v1 - v2;
        return resta;
    }
    public float multi(float v1, float v2){
        float mul = v1 * v2;
        return mul;
    }
    public float divi(float v1, float v2){
        float div = v1 / v2;
        return div;
    }
    public static void main(String[] args) {
         Calcular obj1 = new Calcular();
         obj1.capaturaDatos();   
    }
    
    
}
