package herenciaejercicio03;

import Herencia.Electrodomestico;
import Herencia.Lavadora;
import Herencia.Televisor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Guille
 */
public class HerenciaEjercicio03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Electrodomestico> listaElectrodomestico = new ArrayList();

        for (int i = 0; i < 4; i++) {
            System.out.println("que tipo de electrodomestico desea lavadora o televisor?");
            String tipo = leer.next();
            if (tipo.equalsIgnoreCase("lavadora")) {
                Lavadora lavadora = new Lavadora();
                lavadora.creaLavadora();
                listaElectrodomestico.add(lavadora);

            } else if (tipo.equalsIgnoreCase("televisor")) {
                Televisor televisor = new Televisor();
                televisor.crearTelevisor();
                listaElectrodomestico.add(televisor);
            }
        }
        Integer cont=0;
        for (Electrodomestico electrodomestico : listaElectrodomestico) {
            
            electrodomestico.precioFinal();
            cont = cont+electrodomestico.getPrecio();
           
        }
        System.out.println("La suma de todos los electrodomesticos: $"+cont);
    }
}
//Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
//Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
//televisores, con valores ya asignados.
//Luego, recorrer este array y ejecutar el método precioFinal() en cada
//electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
//es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
//eso, también deberemos mostrar, la suma del precio de todos los
//Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
//y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//electrodomésticos, 2000 para lavadora y 5000 para televisor.

