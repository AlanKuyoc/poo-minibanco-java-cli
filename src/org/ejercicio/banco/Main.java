package org.ejercicio.banco;
public class Main{
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("AlanK", 190982);
        CuentaBancaria cuenta1 = new CuentaBancaria(89865,cliente1,100000);

        Cliente cliente2 = new Cliente("lala", 1112244);
        CuentaBancaria cuenta2 = new CuentaBancaria(93839,cliente2, 920283);
    }
}