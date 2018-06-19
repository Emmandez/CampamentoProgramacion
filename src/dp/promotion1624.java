/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author eherd
 */

public class promotion1624 {
    
    static ArrayList<item> items;
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w,p;
        
        while(n>= 1 && n<=100){
            items = new ArrayList<>();
            for(int i=0; i<n; i++){
                p = sc.nextInt();
                w = sc.nextInt();
                if( p >= 1 && p <= 1000 && w >= 1 && w<=30){
                    items.add(new item(p, w));   
                }   
            }
            
            items.sort((item i1, item i2) -> i1.getDensity()-i2.getDensity());
            
            int maxWeight = sc.nextInt();
            System.out.println(greedy(maxWeight));
            n = sc.nextInt();
        }
    }
    
    static int greedy(int maxWeight){
        int totalWeight=0, totalPrice=0;
        for(int i=0; i<items.size(); i++){
            if(totalWeight + items.get(i).getWeight() <= maxWeight){
                totalWeight +=items.get(i).getWeight();
                totalPrice += items.get(i).getPrice();
            }
        }
        
        return totalPrice;
    }
}




class item {
    int price, weight;
    int density;
    
    item(int price, int weight){
        this.price=price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public int getDensity(){
        return weight/price;
    }

    @Override
    public String toString() {
        return "Price: "+price+" Weight: "+weight;
    }
    
    

}
