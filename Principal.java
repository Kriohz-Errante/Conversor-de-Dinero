import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;

        String menu = """
                *******************************************************************
                Bienvenido al Conversor de Divisas: 
                
                1- Dolar ==> Peso Chileno
                2- Peso Chileno ==> Dolar
                3- Dolar ==> Real Brasileño
                4- Real Brasileño ==> Dolar
                5- Dolar ==> Peso Argentino
                6- Peso Argentino ==> Dolar
                7- Salir
                Escriba el número de la opción que desea convertir:
                """;
        Scanner lectura = new Scanner(System.in);
        while (opcion != 7) {
            System.out.println(menu);
            opcion = lectura.nextInt();
            String monedaBase = "";
            String monedaDestino = "";

            ConsultaMonedas consulta = new ConsultaMonedas();

            if (opcion < 1 || opcion > 7) {
                System.out.println("Opción invalida. Favor ingrese otra opción.");
                continue; //Continua la Iteración.

            }
            if (opcion == 7) {
                System.out.println("Gracias por preferirnos");
                break;
            }
            System.out.println("Favor ingresar el valor a convertir: ");
            double valorAConvertir = lectura.nextDouble();
                switch (opcion) {
                    case 1:
                        monedaBase = "USD";
                        monedaDestino = "CLP";
                        break;
                    case 2:
                        monedaBase = "CLP";
                        monedaDestino = "USD";
                        break;
                    case 3:
                        monedaBase = "USD";
                        monedaDestino = "BRL";
                        break;
                    case 4:
                        monedaBase = "BRL";
                        monedaDestino = "USD";
                        break;
                    case 5:
                        monedaBase = "USD";
                        monedaDestino = "ARS";
                        break;
                    case 6:
                        monedaBase = "ARS";
                        monedaDestino = "USD";
                        break;
                }

            try {
                Monedas resultado = consulta.buscarMonedas(monedaBase, monedaDestino, (valorAConvertir));
                System.out.println("Tasa de cambio de " + monedaBase + " a " + monedaDestino + ": " + resultado.conversion_rate());
                System.out.println("El valor de " + valorAConvertir + " [" + monedaBase + "] " + "corresponde al valor final de: ==> " + resultado.conversion_result());
            } catch (Exception e) {
                System.out.println("No se ha podido obtener la tasa de cambio");
            }
        }
    }
}