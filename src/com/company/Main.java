package com.company;
import java.util.Collection;
import java.util.PriorityQueue;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Vegetables v[] = new Vegetables[7];
        v[0] = new Vegetables("Potatoes",2021,500);
        v[1] = new Vegetables("Tomato",2021,50);
        v[2] = new Vegetables("Cucumber",2020,250);
        v[3] = new Vegetables("Onion",2020,300);
        v[4] = new Vegetables("Cabbage",2021,450);
        v[5] = new Vegetables("Pumpkin",2021,480);
        v[6] = new Vegetables("Garlic",2020,450);

        System.out.println("Vegetables of the current year");
        for(int i=0;i<v.length;i++) {
            if (v[i].name.equals("vegetables")) {
                if (v[i].years >2020){
                    System.out.println(v[i].toString());
                }
            }
        }
        int x=0,n=0;
        for(int i=0;i< v.length;i++){
            x+=v[i].weight;
            n=x/v.length;
        }
        System.out.println("total weight of all vegetables = "+n);

        PriorityQueue <String> queue1 = new PriorityQueue<String>();
        queue1.offer("Potatoes");
        queue1.offer("Tomato");
        queue1.offer("Cucumber");
        queue1.offer("Onion");
        queue1.offer("Cabbage");
        queue1.offer("Pumpkin");
        queue1.offer("Garlic");

        System.out.println("by name : ");
        while (queue1.size()>0){
            System.out.println(queue1.remove()+" ");

        }

    }
}
