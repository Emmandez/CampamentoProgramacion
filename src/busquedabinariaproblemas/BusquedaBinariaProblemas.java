/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinariaproblemas;


import java.util.Scanner;


/**
 *
 * @author eherd
 */
public class BusquedaBinariaProblemas {

    static int p;
    static int q;
    static int r;
    static int s;
    static int t;
    static int u;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        
        String[] linesplit = line.split(" ");
        
        p =  Integer.parseInt(linesplit[0]);
        q =  Integer.parseInt(linesplit[1]);
        r =  Integer.parseInt(linesplit[2]);
        s =  Integer.parseInt(linesplit[3]);
        t =  Integer.parseInt(linesplit[4]);
        u =  Integer.parseInt(linesplit[5]);
        
        double x=0;

        double lo=0,hi=1;
        double mid=0;
                
        System.out.println("Evalua: "+evalua(0.7071));
        for(int i=0; i<30; i++){
            mid = (lo+hi)/2;
            if(evalua(mid) > 0){
                lo=mid;   
            }
            else{
                hi=mid;
            }
        }
        
        System.out.println(String.format("%.4f", mid));
            
            
            
        
        
        
        
        
        
    }
    
    public static double evalua(double x){
        double res = p * Math.exp(-x) + q *Math.sin(x) + r * Math.cos(x) + s*Math.tan(x) + t*Math.pow(x, 2) + u ;
        return res;
    }    
}
