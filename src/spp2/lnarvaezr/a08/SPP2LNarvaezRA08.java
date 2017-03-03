/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lnarvaezr.a08;
import java.util.Scanner;
/**
 *
 * @author Vianey_Narváez
 */
public class SPP2LNarvaezRA08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int promedio, SumaPar=0, SumaNon=0, cont=0;
    int [][] matrix = {{10,30,89,48,56},
                       {32,23,84,20,19},
                       {72,108,71,402,8}};
    for (int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length; j=j+2){
            SumaPar=SumaPar+matrix[i][j];
            cont++;
        }
    }
    promedio=SumaPar/cont;
        System.out.println("El promedio es "+promedio);
        
    for (int i=0;i<matrix.length;i++){
    for (int j=1;j<matrix[i].length;j=j+2){
        SumaNon=SumaNon+matrix[i][j];
}
    
}
        System.out.println("La suma es "+SumaNon);
    }}
