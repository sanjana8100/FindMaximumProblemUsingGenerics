package com.bridgelabz;

public class FindMaximum {

    public static void maximumOfInteger(Integer x, Integer y, Integer z){
        Integer max= x;
        if((y.compareTo(max))>0) max=y;
        if((z.compareTo(max))>0) max=z;
        System.out.println("Maximum of "+x+", "+y+" and "+z+" is: "+max);
    }

    public static void main(String[] args) {
        Integer int1= 3, int2= 4, int3= 5;

        //TestCase1.1
        maximumOfInteger(int3,int1,int2);
        //TestCase1.2
        maximumOfInteger(int1,int3,int2);
        //TestCase1.3
        maximumOfInteger(int1,int2,int3);

    }
}
