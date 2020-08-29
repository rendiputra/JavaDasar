/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputdata;

/**
 *
 * @author Win10
 */
public class Inputdata {
    private String nis;
    private String nama;
    private String alamat;
    public Inputdata(){
        nis ="";
        nama = "";
        alamat = "";
    }
    public Inputdata(String nis, String nama, String alamat){
        this.nis = nis;
        this.nama=nama;
        this.alamat = alamat;
    }
       
    public String cek_nis(){
        return nis;
    }    
    
    public String cek_nama(){
        return nama;
    }
    
    public String cek_alamat(){
        return alamat;
    }
    
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new form1().setVisible(true);
    }
    
}
