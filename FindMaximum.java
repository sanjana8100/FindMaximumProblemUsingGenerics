package com.bridgelabz;

public class FindMaximum {

    public static void maximumOfInteger(Integer x, Integer y, Integer z){
        Integer max= x;
        if((y.compareTo(max))>0) max=y;
        if((z.compareTo(max))>0) max=z;
        System.out.println("Maximum of "+x+", "+y+" and "+z+" is: "+max);
    }

    public static void maximumOfFloat(Float x, Float y, Float z){
        Float max=x;
        if((y.compareTo(max))>0) max=y;
        if((z.compareTo(max))>0) max=z;
        System.out.println("Maximum of "+x+", "+y+" and "+z+" is: "+max);
    }

    public static void main(String[] args) {
        Integer int1= 3, int2= 4, int3= 5;
        Float flt1=6.6f, flt2=8.8f, flt3=7.7f;

        //TestCase1.1
        maximumOfInteger(int3,int1,int2);
        //TestCase1.2
        maximumOfInteger(int1,int3,int2);
        //TestCase1.3
        maximumOfInteger(int1,int2,int3);

        System.out.println();

        //TestCase2.1
        maximumOfFloat(flt2,flt1,flt3);
        //TestCase2.2
        maximumOfFloat(flt1,flt2,flt3);
        //TestCase2.3
        maximumOfFloat(flt1,flt3,flt2);

    }
}
