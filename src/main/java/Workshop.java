import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
      if (a>= b && a >=c) return a;
    if (b>=c) return b;  
      return c;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] resultado = new int[limite];
        for (int i = 0; i < limite; i++) {
            resultado[i] = numero * (i + 1);
        }
        return resultado;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
       if (n<0) throw new IllegalArgumentException("n debe ser positivo");
       int resultado = 1;
       for (int i = 1; i <= n; i++) {
           resultado *= i;
       }
       return resultado;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n debe ser positivo");
        }

        int[] serie = new int[n];
        if (n > 0) {
            serie[0] = 0;
        }
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
        int suma = 0;
        for (int numero : arreglo) {
            suma += numero;
        }
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        if (arreglo.length == 0) {
            return 0.0;
        }

        int suma = 0;
        for (int numero : arreglo) {
            suma += numero;
        }
        return (double) suma / arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int numero : arreglo) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int numero : arreglo) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int numero : arreglo) {
            if (numero == elemento) {
                return true;
            }
        }
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        int[] ordenado = arreglo.clone();
        java.util.Arrays.sort(ordenado);
        return ordenado;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        int cantidadUnicos = 0;

        for (int i = 0; i < arreglo.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (arreglo[i] == arreglo[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                cantidadUnicos++;
            }
        }

        int[] resultado = new int[cantidadUnicos];
        int posicion = 0;

        for (int i = 0; i < arreglo.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (arreglo[i] == arreglo[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                resultado[posicion] = arreglo[i];
                posicion++;
            }
        }

        return resultado;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] resultado = new int[arreglo1.length + arreglo2.length];

        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i];
        }

        for (int i = 0; i < arreglo2.length; i++) {
            resultado[arreglo1.length + i] = arreglo2[i];
        }

        return resultado;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        if (arreglo.length == 0) {
            return new int[0];
        }

        int[] resultado = new int[arreglo.length];
        int posicionesReales = posiciones % arreglo.length;

        if (posicionesReales < 0) {
            posicionesReales += arreglo.length;
        }

        for (int i = 0; i < arreglo.length; i++) {
            int nuevaPosicion = (i + posicionesReales) % arreglo.length;
            resultado[nuevaPosicion] = arreglo[i];
        }

        return resultado;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        return cadena.length();
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
       StringBuilder invertida = new StringBuilder(cadena);
       return invertida.reverse().toString();
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        cadena = cadena.toLowerCase().replace(" ", "");
        String invertida = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(invertida);
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        String[] palabras = cadena.trim().split("\\s+");
        return palabras.length;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
       return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        return correo.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        double suma = 0.0;
        for (int numero : lista) {
            suma += numero;
        }
        return suma / lista.size();
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        if (eleccionUsuario == null) {
            return "Entrada inválida";
        }

        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        String eleccionComputadora = opciones[(int)(Math.random() * opciones.length)];

        String usuario = eleccionUsuario.trim().toLowerCase();
        String computadora = eleccionComputadora.toLowerCase();

        boolean ganaUsuario =
                (usuario.equals("Piedra") && (computadora.equals("Tijera") || computadora.equals("Lagarto"))) ||
                        (usuario.equals("Papel") && (computadora.equals("Piedra") || computadora.equals("Spock"))) ||
                        (usuario.equals("Tijera") && (computadora.equals("Papel") || computadora.equals("Lagarto"))) ||
                        (usuario.equals("Lagarto") && (computadora.equals("Spock") || computadora.equals("Papel"))) ||
                        (usuario.equals("Spock") && (computadora.equals("Tijera") || computadora.equals("Piedra")));

        if (usuario.equals(computadora)) {
            return "Empate";
        } else if (ganaUsuario) {
            return "Ganaste";
        } else {
            return "Perdiste";
        }
    }

    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
        return "";
    }

    public double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public String zoodiac(int day, int month) {
        if (day <= 0 || month <= 0 || month > 12 || day > 31) {
            return "Invalid Date";
        }
        switch (month) {
            case 1:
                return (day < 20) ? "Capricornio" : "Acuario";
            case 2:
                return (day < 19) ? "Acuario" : "Piscis";
            case 3:
                return (day < 21) ? "Piscis" : "Aries";
            case 4:
                return (day < 20) ? "Aries" : "Tauro";
            case 5:
                return (day < 21) ? "Tauro" : "Géminis";
            case 6:
                return (day < 21) ? "Géminis" : "Cáncer";
            case 7:
                return (day < 23) ? "Cáncer" : "Leo";
            case 8:
                return (day < 23) ? "Leo" : "Virgo";
            case 9:
                return (day < 23) ? "Virgo" : "Libra";
            case 10:
                return (day < 23) ? "Libra" : "Escorpio";
            case 11:
                return (day < 22) ? "Escorpio" : "Sagitario";
            case 12:
                return (day < 22) ? "Sagitario" : "Capricornio";
            default:
                return "Fecha inválida";
        }
    }


}

