<em> Conversor de Divisas </em>

Este es un conversor de divisas que nos permite realizar conversiones entre diferentes divisas, utilizando tasas de cambio en tiempo real. El proyecto fue diseñado para facilitar la conversión entre una divisa a otra. 

## Funcionalidades del proyecto

- `Interfaz:` El programa ofrece un menú sencillo en el que el usuario puede seleccionar la moneda base y la moneda destino.
- `Conversión de monedas:` Los usuarios pueden convertir entre varias monedas, tales como USD, CLP, BRL, ARS.
- `Tasas de cambio en tiempo real:` El conversor utiliza un servicio externo para obtener tasas de cambio en tiempo real. 
- `Otros comandos:` El programa permite salir de la aplicación en cualquier momento seleccionando la opción "Salir".

 ## Cómo Usar
 
1. En la clase CredencialApi hay un String llamado API_KEY en el cual debe colocar la contraseña proporcionada por el sitio: https://www.exchangerate-api.com/
   
2. El programa mostrará un menú con las siguientes opciones:
   
   * Convertir de Dólar a Peso colombiano.

   * Convertir de Peso colombiano a Dólar.

   * Convertir de Euro a Peso colombiano.

   * Convertir de Peso colombiano a Euro.

   * Convertir de Peso colombiano a Dólar australiano.

   * Convertir de Dólar australiano a Peso colombiano.

   * Salir.
 
3. Elige el número correspondiente a la opción que prefieras y luego ingresa el valor a convertir.

4. El programa mostrará la tasa de cambio actual y el valor convertido.
   
5. Para cerrar el programa, bastará con ingresar la opción 7, que finalizará la operación y despedirá al usuario. 

## Herramientas Utilizadas: ## 

   * Java: El lenguaje de programación orientado a objetos para implementar un conversor de divisas.

   * API de tasas de cambio (https://www.exchangerate-api.com): Utilizado para obtener tasas de cambio en tiempo real entre diferentes monedas.

   * Scanner (Java): Permite capturar la entrada del usuario desde la consola.
