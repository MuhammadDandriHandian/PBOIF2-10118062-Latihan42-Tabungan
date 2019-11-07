/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tabungan {
    private int saldo;
    public int ambilUang;
    public int saldoakhir;
   
     
    
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public int AmbilUang(){
        return saldo-saldoakhir;
    }
    
    public void setAmbilUang(int ambilUang){
        this.ambilUang = ambilUang;
    }
    
    public void Tabungan(int saldo){
        Scanner scanner = new Scanner(System.in);   
        System.out.println("======Program Penarikan Uang======");
        System.out.print("Masukan Saldo Awal : ");
        this.saldo = scanner.nextInt();
        System.out.print("Jumlah uang yang diambil : ");
        int jumlah = scanner.nextInt();            
    }
    
    public void tampilhasil(){
        System.out.println("======Program Penarikan Uang======");
        System.out.println("Masukan Saldo Awal : " + getSaldo());
        System.out.println("Jumlah uang yang diambil : " + getambilUang());
    }
    
    public int getSaldoakhir(){
        return saldoakhir;
    }
    
    public void setsaldoAkhir(int saldoakhir){
        this.saldoakhir = saldoakhir;
        
    }
    
    
}
