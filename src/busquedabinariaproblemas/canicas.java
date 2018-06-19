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
public class canicas {
    static ArrayList<Integer> canicas;
    static int[] queries;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int nc = sc.nextInt();
        int nq = sc.nextInt();
        
        queries = new int[nq];
        canicas = new ArrayList<>();
        
        //Llena canicas
        for(int i=0; i<nc; i++){
            canicas.add(sc.nextInt());
        }
        
        //ordena
        Collections.sort(canicas);
        
        //llena queries
        for(int i=0; i<nq; i++){
            queries[i]=sc.nextInt();
        }

        
        for(int i=0; i<nq; i++){    
            if(findN(queries[i])!=-1){
                System.out.println(queries[i]+" found on "+findN(queries[i]));
            }else{
                System.out.println(queries[i]+" not found");
            }
        }
        
    }
    
    public static int findN(int x){
        int lo =0, hi=canicas.size()-1, mid=0;
        while(lo<hi){
            mid = (lo+hi)/2;
//            System.out.println(mid+" con "+x);
            if(canicas.get(mid)>=x){
                hi=mid;
            }else{
                lo=mid+1;
            }
        }
        mid = (lo+hi)/2;
        
//        System.out.println("array: "+canicas.get(mid));
//        System.out.println("Q: "+x+" array:"+canicas.get(mid)+" position:"+mid);
        if(canicas.get(mid)!=x){
            mid=-2;
        }
        return mid+1;
        
        
        
    }
}
