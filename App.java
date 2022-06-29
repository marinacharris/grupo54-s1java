public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // variables:
        /*
         para declara una variables se puede de dos formas:
         i)tipoVaribale nombre = datoInicial;
         ii) var nombre = datoInicial;   

         */
        int num = 25;
        var nombre = "Marina";
        System.out.println(nombre);
        System.out.println(num);
        System.out.println(nombre.getClass().getSimpleName());
        System.out.println(((Object)num).getClass().getSimpleName());
    }
}
