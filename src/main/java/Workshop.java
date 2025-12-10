import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }

        return mayor;

}
    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int lim) {
        int[] tb = new int[lim];

        for (int i = 0; i < lim; i++) {
            tb[i] = numero * (i + 1);
        }

        return tb;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {if (n < 0) {
        throw new IllegalArgumentException("El factorial no está definido para números negativos.");
    }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        int cont=0,b=0;
        // TODO: Implementar el método para verificar si un número es primo.
        // Ejemplo: Si numero = 7, el resultado debería ser true.
        do{
            cont++;
            if(numero%cont==0){
                b=b+1;
            }
            else{}

        }while(cont<numero);
        if(b==2){
            return true;
        }
        else{
        return false;}
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n no puede ser negativo");
        }
        if (n == 0) {
            return new int[0];
        }

        int[] serie = new int[n];
        serie[0] = 0;
        if (n > 1) {
            serie[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }
        return serie;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser null");
        }
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma;
    }

    public double promedioElementos(int[] arreglo) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser null");
        }

        if (arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío");
        }

        int suma = 0;

        for (int num : arreglo) {
            suma += num;
        }

        return (double) suma / arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser null");
        }
        if (arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío");
        }

        int mayor = arreglo.length > 0 ? arreglo[0] : 0;

        for (int num : arreglo) {
            if (num > mayor) {
                mayor = num;
            }
        }

        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {

        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser null");
        }

        if (arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío");
        }

        int menor = arreglo[0];

        for (int num : arreglo) {
            if (num < menor) {
                menor = num;
            }
        }

        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser null");
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return true;
            }
        }

        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser null");
        }

        int[] invertido = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }

        return invertido;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser null");
        }

        int[] copia = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }

        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = 0; j < copia.length - 1 - i; j++) {
                if (copia[j] > copia[j + 1]) {
                    int temp = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temp;
                }
            }
        }

        return copia;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser null");
        }

        if (arreglo.length == 0) {
            return new int[0];
        }

        int[] copia = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }

        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = 0; j < copia.length - 1 - i; j++) {
                if (copia[j] > copia[j + 1]) {
                    int temp = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temp;
                }
            }
        }

        int contador = 1;
        for (int i = 1; i < copia.length; i++) {
            if (copia[i] != copia[i - 1]) {
                contador++;
            }
        }

        // --- 3. Crear arreglo final sin duplicados ---
        int[] resultado = new int[contador];
        int index = 0;
        resultado[index++] = copia[0];

        for (int i = 1; i < copia.length; i++) {
            if (copia[i] != copia[i - 1]) {
                resultado[index++] = copia[i];
            }
        }

        return resultado;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        if (arreglo1 == null || arreglo2 == null) {
            throw new IllegalArgumentException("Ningún arreglo puede ser null");
        }

        int[] combinado = new int[arreglo1.length + arreglo2.length];

        for (int i = 0; i < arreglo1.length; i++) {
            combinado[i] = arreglo1[i];
        }

        for (int i = 0; i < arreglo2.length; i++) {
            combinado[arreglo1.length + i] = arreglo2[i];
        }

        return combinado;
    }

    // Método que rota un arreglo n posiciones hacia la derecha
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser null");
        }
        int n = arreglo.length;
        if (n == 0) {
            return new int[0];
        }
        posiciones = posiciones % n;
        if (posiciones < 0) {
            posiciones += n;
        }

        int[] resultado = new int[n];
        int inicio = n - posiciones;
        int index = 0;
        for (int i = inicio; i < n; i++) {
            resultado[index++] = arreglo[i];
        }
        for (int i = 0; i < inicio; i++) {
            resultado[index++] = arreglo[i];
        }
        return resultado;
    }

    // Método que cuenta los caracteres en una cadena manualmente
    public int contarCaracteres(String cadena) {
        if (cadena == null) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            contador++;
        }
        return contador;
    }
    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        if (cadena == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder(cadena);
        return sb.reverse().toString();
    }
    public boolean esPalindromo(String cadena) {
        if (cadena == null) {
            return false;
        }
        String limpia = cadena
                .toLowerCase()
                .replaceAll("[^a-z0-9áéíóúñ]", "");
        String invertida = new StringBuilder(limpia).reverse().toString();
        return limpia.equals(invertida);
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        }
        String[] palabras = cadena.trim().split("\\s+");
        return palabras.length;
    }
    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        if (cadena == null) {
            return null;
        }
        return cadena.toUpperCase(); // Convierte toda la cadena a MAYÚSCULAS
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        if (cadena == null) {
            return null;
        }
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        if (cadena == null || antiguaSubcadena == null || nuevaSubcadena == null) {
            return null;
        }
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        if (cadena == null || subcadena == null) {
            return -1;
        }
        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        if (correo == null) {
            return false;
        }
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return correo.matches(regex);
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            return 0.0;
        }
        double suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma / lista.size();
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        if (numero == 0) {
            return "0";
        }
        if (numero < 0) {
            return "-" + convertirABinario(-numero);
        }
        StringBuilder binario = new StringBuilder();
        int n = numero;
        while (n > 0) {
            binario.append(n % 2);
            n /= 2;
        }
        return binario.reverse().toString();
    }

    public String convertirAHexadecimal(int numero) {
        if (numero == 0) {
            return "0";
        }
        if (numero < 0) {
            return "-" + Integer.toHexString(Math.abs(numero)).toUpperCase();
        }
        return Integer.toHexString(numero).toUpperCase();
    }

    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        if (eleccionUsuario == null) return "Empate";

        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        String computadora = opciones[(int)(Math.random() * 5)];

        String u = eleccionUsuario.toLowerCase();
        String c = computadora.toLowerCase();

        if (u.equals(c)) {
            return "Empate";
        }

        boolean ganaUsuario =
                (u.equals("piedra") && (c.equals("tijera") || c.equals("lagarto"))) ||
                        (u.equals("papel") && (c.equals("piedra") || c.equals("spock"))) ||
                        (u.equals("tijera") && (c.equals("papel") || c.equals("lagarto"))) ||
                        (u.equals("lagarto") && (c.equals("spock") || c.equals("papel"))) ||
                        (u.equals("spock") && (c.equals("tijera") || c.equals("piedra")));

        return ganaUsuario ? "Ganaste" : "Perdiste";
    }

    public String pptls2(String game[]) {
        if (game == null || game.length != 2) {
            throw new IllegalArgumentException("El arreglo debe tener dos elementos");
        }

        String p1 = game[0].toUpperCase();
        String p2 = game[1].toUpperCase();

        // Empate
        if (p1.equals(p2)) {
            return "Empate";
        }

        // Reglas
        boolean ganaP1 =
                (p1.equals("S") && (p2.equals("P") || p2.equals("L"))) || // Tijera
                        (p1.equals("P") && (p2.equals("R") || p2.equals("V"))) || // Papel
                        (p1.equals("R") && (p2.equals("L") || p2.equals("S"))) || // Piedra
                        (p1.equals("L") && (p2.equals("V") || p2.equals("P"))) || // Lagarto
                        (p1.equals("V") && (p2.equals("S") || p2.equals("R")));   // Spock

        if (ganaP1) {
            return "Player 1";
        } else {
            return "Player 2";
        }
    }

    public double areaCirculo(double radio) {
        return Math.PI * radio; // INCORRECTO científicamente
    }


    public String zoodiac(int day, int month) {
        if (month < 1 || month > 12) {
            return "fecha invalida";
        }
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (day < 1 || day > diasMes[month - 1]) {
            return "fecha invalida";
        }
        switch (month) {
            case 1:  return (day <= 19) ? "Capricornio" : "Aquario";
            case 2:  return (day <= 18) ? "Aquario" : "Piscis";
            case 3:  return (day <= 20) ? "Piscis" : "Aries";
            case 4:  return (day <= 19) ? "Aries" : "Tauro";
            case 5:  return (day <= 20) ? "Tauro" : "Gemini";
            case 6:  return (day <= 20) ? "Gemini" : "Cancer";
            case 7:  return (day <= 22) ? "Cancer" : "Leo";
            case 8:  return (day <= 22) ? "Leo" : "Virgo";
            case 9:  return (day <= 22) ? "Virgo" : "Libra";
            case 10: return (day <= 22) ? "Libra" : "Scorpio";
            case 11: return (day <= 21) ? "Scorpio" : "Sagitario";
            case 12: return (day <= 21) ? "Sagitario" : "Capricornio";
        }

        return "fecha invalida";
    }


}

