package org.ejercicio.banco;
public class Main{
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("AlanK", 190982);
        CuentaBancaria cuenta1 = new CuentaBancaria(89865,cliente1,100000);
    }
}