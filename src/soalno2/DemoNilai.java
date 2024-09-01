/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalno2;

/**
 *
 * @author Acer
 */
public class DemoNilai {
    public static void main(String[] args) {
        
        Nilai mhs1 = new Nilai("231321001", "Aamon", 100, 70, 80, 95);
        Nilai mhs2 = new Nilai("231321002", "Fanny", 100, 80, 85, 95);
       
        System.out.println("=================================================");
        System.out.println("\t\tData Nilai Mahasiswa");
        System.out.println("=================================================");
        mhs1.cetakNilai();
        System.out.println("=================================================");
        mhs2.cetakNilai();
        System.out.println("=================================================");
    }
}
