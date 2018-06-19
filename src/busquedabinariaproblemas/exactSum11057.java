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
public class exactSum11057 {
     static ArrayList<Integer> books;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nbooks = sc.nextInt();
        
        books = new ArrayList<>();
        for(int i=0; i<nbooks; i++){
            books.add(sc.nextInt());
        }
        
        Collections.sort(books);
        int money=sc.nextInt();
        
        int i=0, j =books.size()-1;
        int bi=0, bj=0;
        
        while(i<j){
            
            if(books.get(i) + books.get(j) < money){
                j++;
            }
            else if(books.get(i) + books.get(j) == money){
                bi = i;
                bj = j;
                j--;
                i++;
            }
            else{
                j--;
            }    
        }
        
        System.out.println("compra libros "+books.get(bi)+" y "+books.get(bj));
        
        
        
                
    
    }
    
    
}
