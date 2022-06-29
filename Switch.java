import java.util.Scanner;
public class Switch {
    public static void main(String[] args) throws Exception {
        // Switch
        Scanner mesObj = new Scanner(System.in); // crear un objeto scanner
        System.out.println("Ingree el mes:");
        int mes = mesObj.nextInt();
        mesObj.close();
        switch (mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
                        
        }
}
}
