/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4sy2324;

/**
 *
 * @author josue
 */
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String FG1 = "Tekken 7" ;
        String Dim1 = "3D" ;
        int Char1 = 51;
        String FG2 = "Street Fighter 5: Champion Edition" ;
        String Dim2 = "2D" ;
        int Char2 = 40;
        String FG3 = "Guilty Gear -Strive-" ;
        String Dim3 = "2D" ;
        int Char3 = 24;
        
        int CharSum = Char1 + Char2 + Char3;
        String Compare1 = "";
        String Compare2 = "";
        
        if(Dim1 == Dim3){
            Compare1 = "true";
        } else {
            Compare1 = "false";
        }
        if(Char2 < Char1){
            Compare2 = "true";
        } else {
            Compare2 = "false";
        }
        
        System.out.println("Fighting game 1");
        System.out.println("Name: " + FG1);
        System.out.println("Dimension: " + Dim1);
        System.out.println("Number of playable characters: " + Char1);
        System.out.println("");
        System.out.println("Fighting game 2");
        System.out.println("Name: " + FG2);
        System.out.println("Dimension: " + Dim2);
        System.out.println("Number of playable characters: " + Char2);
        System.out.println("");
        System.out.println("Fighting game 3");
        System.out.println("Name: " + FG3);
        System.out.println("Dimension: " + Dim3);
        System.out.println("Number of playable characters: " + Char3);
        System.out.println("");
        System.out.println("Total characters: " + CharSum);
        System.out.println("Tekken 7 and Guilty Gear -Strive- have the same dimension: " + Compare1);
        System.out.println("Street Fighter 5: Champion Edition has less characters than Tekken 7: " + Compare2);
    }
    
}
