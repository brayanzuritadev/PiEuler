package pieuler;

import java.util.ArrayList;

/**
 *
 * @author Brayan
 */
public class PiEuler {

    ArrayList<Integer> primos = new ArrayList();

    public void obtenerNumerosPrimos(long num) {
        primos.add(1);
        int verificador = 3;
        int contador = 0;
        for (int i = 0; i <= Math.ceil(Math.sqrt(num)); i++) {
            if (num % 2 == 0) {
                quitarRepeticionesPrimos(2);
                num = num / 2;
            }
            if (num % 2 != 0) {
                while (contador != -1) {
                    if (num % verificador == 0) {
                        quitarRepeticionesPrimos(verificador);
                        num = num / verificador;
                        contador++;
                    }
                    if (contador == 0) {
                        verificador += 2;
                    }
                    if (contador > 0) {
                        contador = 0;
                    }
                    if ((num == 1) || (num % 2 == 0)) {
                        contador = -1;
                    }
                }
            }
        }
    }

    public void quitarRepeticionesPrimos(int num) {
        boolean bandera = true;
        for (int i = 0; i < primos.size(); i++) {
            if (primos.get(i).equals(num)) {
                bandera = false;
            }
        }

        if (bandera == true) {
            primos.add(num);
        }
    }

    public long obtenerPiEuler(long num) {
        double num1 = 1;
        long num2 = 0;
        obtenerNumerosPrimos(num);
        for (int i = 1; i < primos.size(); i++) {
            num1 = num1 * (1 - (1 / (double) primos.get(i)));
        }
        num2 = (long) (num * num1);
        return num2;
    }

}
