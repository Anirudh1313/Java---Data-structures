package com.company;
import com.sun.org.apache.xml.internal.security.algorithms.JCEMapper;

import java.util.*;
import java.util.Arrays;

public class Main {

    public static int sum(int a, int b) {

        if(check(4)) {
            return a+b;
        }

        return -1;
    }

    private static boolean check(int f) {
        return true;
    }

    public static int BinarySearch(int val, ArrayList l1) {
        int lo = 0;
        int hi = l1.size();
        while(lo <= hi)
        {
            int  mid = (lo+hi)/2;
            int m_val = (int)l1.get(mid);

            if(val > m_val)
            {
                lo = mid+1;
            }
            else if(val < m_val)
            {
                hi = mid-1;
            }
            else
            {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {


        Node k = new Node(4);

        LinkedList al1 = new LinkedList(4);

        for(int i = 0; i < 100; i++)
        {
            al1.push_back(i);
        }

        al1.push_front(10);

        al1.add(15, 4);

        al1.remove(1);

        al1.pop_front();
        al1.pop_back();

        al1.print();


        System.out.println("node K value: " + k.get_value());

//        Scanner in = new Scanner(System.in);
//
       double[] king = new double[100];
        //System.out.println("!!!!");
//
//
//        //String s = System.console().readLine("Enter new double value: ");
//        //double f = Double.parseDouble(s);
//
//        System.out.println("enter k value: ");
//        int k = in.nextInt();
//
//        System.out.println("enter k value: ");
//        float f1 = in.nextFloat();        // need to define scanner
//
//        double f2 = in.nextDouble();

        ArrayList list1 = new ArrayList();


        int f = 4;
        list1.add(2);
        list1.add(3);
        list1.add(f);
        list1.add(5);
        list1.add(6);
        list1.add(1, 10);


        Vector list2 = new Vector();

        list2.add(5);
        list2.add(5);
        list2.add(5);
        list2.add(5);
        list2.add(5);
        list2.add(5);

        System.out.println(list2.get(3));


        for(int i = 0; i < 100; i++)
        {
            Random rand = new Random();
            list1.add(rand.nextInt(100));   //generates random numbers from 0 to 100
        }


        //System.out.println("list: ");

        int node;

//        for(int i = 0; i < list1.size(); i++)
//        {
//            System.out.print(list1.get(i) + ", ");
//        }

        Collections.sort(list1);

        int count = 0;
        for(Iterator it = list1.iterator(); it.hasNext(); )
        {
            System.out.println(count + "  " + it.next());
            count++;
        }


        System.out.print("\n");

        System.out.println("value 15 is in " + BinarySearch(15, list1));

        int apb = sum(3, 4);

        System.out.println("sum is " + apb);


        //System.out.println(list1);

        if(list1.contains(f))   //checking if list1 has value in f.
        {
            System.out.println("found " + f + " in the list");

        }

        //int k = Integer.parseInt(args[0]);  // reads from an argument, you can edit or enter args in configurations
//        {
//            for(int i = 0; i < 100; i++)
//            {
//                king[i] = i;
////            StdOut.printf("i = %d \n", i);
//                System.out.println("i is " + i);
//
//            }
//        }

	// write your code here
    }


}
