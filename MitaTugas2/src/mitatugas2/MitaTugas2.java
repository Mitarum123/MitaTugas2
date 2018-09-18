/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mitatugas2;

/**
 *
 * @author ACER
 */
public class MitaTugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah = 5;
        for(int a=0; a<jumlah; a++){
            for(int c=0; c<jumlah; c++){
                if (a==0 || a==4 || c==0 || c==4){
                    System.out.print("#");
                }
                else{     
                    System.out.print("*");
                }
            }
        System.out.println();
        }
    }
}
    
    
