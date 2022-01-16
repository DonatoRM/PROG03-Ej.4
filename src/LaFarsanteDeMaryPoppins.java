import java.util.Scanner;
/**
 * Ejercicio 4 de PROG03
 * @author Donato Ramos Martínez
 */
public class LaFarsanteDeMaryPoppins {

    /**
     * @param args No es necesario introducir argumentos
     */
    public static void main(String[] args) {
        // Declaración de variables
        int casos; // Númerom de casos del problema
        String frase; // Frase de comprobar
        boolean mayuscula; // Indica si el primer caracter está en mayúsculas
        final int LETRAS_MAXIMO=40; // Máximo de caracteres en palabra
        int punteroCadena; // Posición en donde se almacenará un caracter
        String palabraFinal; // Palabra ya convertida
        Scanner leer=new Scanner(System.in);
        
        // Programa
        casos=leer.nextInt(); // Leemos el número de casos de prueba
        leer.nextLine();
        for(int contador=0;contador<casos;contador++){
            frase=leer.nextLine(); // Leemos la palabra a invertir
           /*
            Si la palabra supera los 40 vamos a trabajar con el número máximo
            de caracteres indicado en la constante LETRAS_MAXIMO
            */
            if(frase.length()>LETRAS_MAXIMO) frase=frase.substring(0, LETRAS_MAXIMO-1);
            /*
            Comprobamos si el primer caracter de la cadena está en mayúscula o
            en minúscula.
            */
            mayuscula=Character.isUpperCase(frase.charAt(0));
            // Convertimos la palabra a minúsculas para trabajar con ella
            frase=frase.toLowerCase();
            // Creamos el array miCadena del String
            char[] miCadena=frase.toCharArray();
            /* 
            Creamos un array vacío con el mismo número de posiciones que el 
            anterior.
            */
            char[] miCadenaReves=new char[miCadena.length];
            // Posicionamos el puntero al final de la cadena nueva
            punteroCadena=miCadena.length-1;
            // Bucle que recorre el array miCadena mostrando los caracteres
            for(char letra:miCadena){
                // Copia el caracter en la posición idónea del array miCadenaReves
                miCadenaReves[punteroCadena--]=letra;
            }
            /*
            Si la palabra estaba en mayúsculas pone en mayúscula la primera 
            letra de este nuevo.
            */
            if(mayuscula==true) miCadenaReves[0]=Character.toUpperCase(miCadenaReves[0]);
            // Convierte el array en un String
            palabraFinal=String.valueOf(miCadenaReves);
            // Muestra el resultado final por pantalla
            System.out.println(palabraFinal);
        }
    }
}
