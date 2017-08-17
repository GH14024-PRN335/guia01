package Metodos;
public class Utilities {
    public static void main(String[] args) {
            
        System.out.println(getResume("A partir de los seis años los niños comienzan a adquirir capacidades de comprensión en lo que a la lectura de textos se refiere"));
        String cadena = "los niños comienzan a adquirir capacidades de comprensión en lo que a la lectura de textos se refiere";
        System.out.println(capitalizar(cadena));
        System.out.print(contarCoincidencias("Compré pocas copas, pocas copas compré, como compré pocas copas, pocas copas pagaré.","copas"));
        
    }
    
    /**
     * El metodo es capaz de devolver 30 caracteres de una cadena que se es introducida
     * @param cadena Es una variable de tipo String en la cual se introduce la cadena de texto que se desea evaluar
     * @return Este metodo regresa las primeras 30 letras o caracteres que recibio de la variable texto
     */
    public static String getResume(String cadena) {
        char caracter = ' ';
        String texto = "";
        int cont = 30;

        for (int i = 0; i < cont; i++) {
            caracter = cadena.charAt(i);
            String axu = String.valueOf(caracter);
                texto += caracter;
        }
        return texto;
    }

    /**
     * Este metodo es capaz de obtener una cadena de texto y cambiar despues de un espacio letras minusculas a mayuscalas y tambien eliminar dobles espacios
     * @param cadena
     * @return 
     */
    public static String capitalizar(String cadena) {
        char[] caracteres = cadena.toCharArray();
        
        for (int i = 0; i < cadena.length(); i++) {
            caracteres[0] = Character.toUpperCase(caracteres[0]);
            if (caracteres[i] == ' ') {
                caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
            }
        }
        cadena = String.valueOf(caracteres);
        cadena = (cadena.replace("  ", " "));
        return cadena;
    }

    /**
     * Este metodo es capaz de evaluar una cadena de texto y extraer el numero de veces que se repite una palabra
     * @param palabra es una variable de tipo string que toma la palabra que se va a buscar en el parrafo introducido
     * @param cadena es la cadena de caracteres de la 
     * @return 
     */
    public static int contarCoincidencias(String palabra, String cadena) { 
        int cont = 0;

        while (palabra.indexOf(cadena) > -1) {
            palabra = palabra.substring(palabra.indexOf(cadena) + cadena.length(), palabra.length());
            cont++;
        }
        return cont;
    }
    
}
