import  java.util.Scanner;
public class Ejemplo1 {
    //variables (propiedades o atributos)
    //metodos o funciones
    //main
    // static, significa que para utilizarlo no es necesario crear un objeto
    // void, significa que no se retornan datos

    //variables
    private String nombre;
    private float nota;

    //métodos
    public void capturaDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el nombre:");
        nombre = sc.nextLine();
        System.out.println("Digite la nota");
        nota = sc.nextFloat();
        sc.close();
    }

    public void imprimir(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Nota: "+ nota);
    }

    public void aprobar(){
        if (nota>=3){
            System.out.println("Aprobó");
        }else{
            System.out.println("No aprobó");
        }
    }

    // main
    public static void main(String[] args){
        Ejemplo1 obj1 = new Ejemplo1();
        obj1.capturaDatos();
        obj1.imprimir();
        obj1.aprobar();

    }
}
