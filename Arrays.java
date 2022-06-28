public class Arrays {
    public static void main(String[] args) {
        int[] numeros = {84,52,14,17};
        for (int i: numeros){
            System.out.println(i);
        }
        System.out.println("---------------------------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        int[][] matriz = {{29,45,12},{36,99,18}};
        // 29   45  12
        // 36   99  18
        System.out.println("---------------------------");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }

        }

        System.out.println("---------------------------");

        for (int x[]:matriz){
            for (int y:x){
                System.out.println(y);
            }
        }


    }
}
