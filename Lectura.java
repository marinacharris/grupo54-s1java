import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) throws Exception {   
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite nombre, edad y ventas");
        String nombre = entrada.nextLine();
        int edad = entrada.nextInt();
        double ventas = entrada.nextDouble();
        entrada.close();
        System.out.println("Nombre: " + nombre + " ventas: " + ventas+" edad: " + edad);

    
}}
