/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinariaproblemas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author eherd
 */

public class whereIsTheMarble {
    static ArrayList<Integer> marbles = new ArrayList<>();
    static ArrayList<Integer> queries = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        int aux;
        for(int i=0; i<n; i++){
            aux = sc.nextInt();
            marbles.add(aux);
        }
        
        Collections.sort(marbles);
        
        for(int i =0; i<q; i++){
            aux = sc.nextInt();
            queries.add(aux);
        }
        
        
        
        for(int i=0; i<q; i++){
            
            if(findN(queries.get(i)) !=-1){
                System.out.println(queries.get(i)+" Found on "+findN(queries.get(i)));
            }
            else{
                System.out.println(queries.get(i)+" not found");
            }
            
//            if(findN(queries.get(i))!=-1){
//                
//            }
//            else{
//                System.out.println("Not found");
//            }
               
        }
        
    }
    
    public static int findN(int q){
        double lo =0, hi=marbles.size()-1;
        double mid=-1;
        for(int i=0; i<80;i++){
            mid = Math.ceil((lo+hi)/2);
            
            
            if(marbles.get((int)mid)<q){
                lo=(int)mid;
                
            }
            else{
                hi=(int)mid;
            }
        }
        if(marbles.get((int)mid) != q){
            mid=-2;
        }

        return (int)mid+1;
    }
}
