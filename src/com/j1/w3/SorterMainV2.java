/*
 * This is java programming homework. (week 3)
 */

package com.j1.w3;
import java.util.Date;
import com.j1.w2.WeightTurtle;

public class SorterMainV2 {
    public static void main(String[] args) {
        Date d1=new Date(1996,5,25);
        Date d2=new Date(1995,11,6);
        Date [] d1d2 = {d1 , d2};
        Comparator dateComp=new DateComparator();
        Sorter.sort(d1d2, dateComp);
        
        for(int i=0; i<d1d2.length; i++)
            System.out.println("DateArray["+i+"]="+d1d2[i]);
        /*
         * date return
         * DateArray[i] = day month date hour
         * LeeSuJin's birthday is 1995.11.6. And my birthday is 1996.5.25
         * So, birthday sort -> 1.SuJin's birthday  2.my birthday
         */

        WeightTurtle wt30 = new WeightTurtle(30);
        WeightTurtle wt10 = new WeightTurtle(10);
        WeightTurtle wt20 = new WeightTurtle(20);
        WeightTurtle[] wts={wt30, wt10, wt20};
        Comparator turtleComp=new TurtleComparator();
        Sorter.sort(wts, turtleComp);
        
        for(int i=0; i<wts.length; i++)
            System.out.println("WeightTurtleArray["+i+"]="+wts[i].getWeight());
        /*
         * Turtle sort is very Good!
         */
        
        String[] reverseArray = {"A","C"};
        Comparator reverseComp = new ReverseComparator();
        Sorter.sort(reverseArray,reverseComp);
        
        for(int i=0; i<reverseArray.length; i++)
          System.out.println("ReverseArray["+i+"]="+reverseArray[i]);
    }
}

class Sorter {
  public Sorter() {}
    public static void sort(Object[] data, Comparator comp) {
        for(int i=data.length-1; i>=1; i--) {
            int indexOfMax=0;
            for(int j=1; j<=i; j++) {
                if(comp.compare(data[j], data[indexOfMax]) > 0)
                    indexOfMax=j;
                }
                Object temp=data[i];
                data[i]=data[indexOfMax];
                data[indexOfMax]=temp;
        }
    }
}


interface Comparator {
    public int compare(Object o1, Object o2);
    public boolean equals(Object o);
}



class DateComparator implements Comparator {
    public DateComparator() {}
    public int compare(Object o1, Object o2) {
      return ((Date) o1).compareTo((Date) o2);
    }
}

class ReverseComparator implements Comparator {
    private final Comparator c;
    public ReverseComparator(Comparator c) {this.c = c; }
    public int compare(Object o1, Object o2) {
        return c.compare(o2, o1);
    }
}


class TurtleComparator implements Comparator {
    public int compare(Object t1, Object t2) {
        return ((WeightTurtle)t1).getWeight()-((WeightTurtle)t2).getWeight();
    }
}
