public class Condicional {
    public static void main(String[] args) throws Exception {  
        int temperatura = 38;
        if (temperatura >37){
            System.out.println("Tiene fiebre");
        }else if(temperatura >= 36 && temperatura <= 37){ // operadores lógicos=> and: &&, or: ||, not:!
            System.out.println("Temperatura ok");
        }else{
            System.out.println("Temperatura baja");
        }

        //forma corta del if
        String respuesta = (temperatura>37)?"Temperatura alta":"Temperatura ok";
        System.out.println(respuesta);

        

}
}