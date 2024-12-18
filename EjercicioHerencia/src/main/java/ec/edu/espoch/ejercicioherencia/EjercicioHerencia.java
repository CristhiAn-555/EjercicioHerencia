/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.ejercicioherencia;

/**
 *
 * @author SO-LAB1-PC14
 */
public class EjercicioHerencia {

    public static void main(String[] args) {

        //  Cuenta de Ahorros
        System.out.println("Cuenta de Ahorros:");
        CuentaAhorros cuentaAhorros = new CuentaAhorros(15000, 0.05f);
        cuentaAhorros.consignar(5000);
        cuentaAhorros.retirar(2000);
        cuentaAhorros.retirar(3000);
        cuentaAhorros.retirar(2000);
        cuentaAhorros.retirar(5000); 
        cuentaAhorros.extractoMensual();
        cuentaAhorros.imprimir();

        //  Cuenta Corriente
        System.out.println("Cuenta Corriente:");
        CuentaCorriente cuentaCorriente = new CuentaCorriente(10000, 0.04f);
        cuentaCorriente.consignar(2000);
        cuentaCorriente.retirar(5000);
        cuentaCorriente.retirar(8000); 
        cuentaCorriente.consignar(3000); 
        cuentaCorriente.extractoMensual();
        cuentaCorriente.imprimir();
    }
}
    

