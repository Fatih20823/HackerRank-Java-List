package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        
        int x = input.nextInt();        
        for(int i=0;i<x;i++){          
            int y = input.nextInt();
            arr.add(y);
        }
        
        x = input.nextInt();
       while(x-- >0) {
        String vote = input.next();
            if(vote.equalsIgnoreCase("Insert")){
            int a = input.nextInt();
            int b = input.nextInt();
            arr.add(a, b);
          
            }else {
                  int c = input.nextInt();
                 arr.remove(c);          
            }
        }              
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
       
        input.close();

	}

}
