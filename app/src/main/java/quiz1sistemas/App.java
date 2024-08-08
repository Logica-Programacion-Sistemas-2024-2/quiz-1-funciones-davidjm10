
package quiz1sistemas;

public class App {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int precioGeneral = 10000;
        int precioVip = 15000;
        int precioCombo1 = 40000;
        int precioCombo2 = 30000;
        int precioCombo3 = 42000;

        try {
            System.out.println("que tipo de boleta desea comprar (general/vip): ");
            String tipoBoleta = scanner.nextLine();
   
            System.out.println("cuantas boletas desea comprar: ");
            int cantidadBoletas = scanner.nextInt();
            
            System.out.println("que combo desea comprar (1,2,3): ");
            int comboDeseado = scanner.nextInt();
            
            System.out.println("cuantos combos desea comparar: ");
            int cantidadCombos = scanner.nextInt();

            int valorBoletas = (tipoBoleta) = precioGeneral * cantidadBoletas;
                return resultado;

            
            int valorCombo = 0;
            switch (comboDeseado) {
                case 1:
                    valorCombo = precioCombo1 * cantidadCombos;
                    break;
                case 2:
                    valorCombo = precioCombo2 * cantidadCombos;
                    break;
                case 3:
                    valorCombo = precioCombo3 * cantidadCombos;
                    break;
                return ;
            }
        
                int valorTotal = valorBoletas + valorCombo;

                System.out.println("factura: ");
                System.out.println("tipo de silla comprada" + tipoBoleta + );
                System.out.println("valor total de las boletas" + valorBoletas);
        
        } catch (Exception e) {
            System.out.println("El error es: " + e);     
        }
        
    }

    /*  Implemente una funcion llamada calcularValorBoleta que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero que representa la cantidad de boletas compradas
        * Retorna:
            - Un entero representando el valor total de las boletas
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularValorNetoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el numero de combo selecciondo
            - Un entero representando la cantidad de combos comprados
        * Retorna:
            - Un entero representando el valor neto del combo
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularDescuentoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero representando el valor neto del combo
        * Retorna:
            - Un entero representando el valor del descuento
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularValorFactura que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor neto del combo
            - Un entero representando el valor de las boletas
            - Un entero representando el valor del descuento del combo
        * Retorna:
            - Un entero representando el valor total de la factura
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------
}
