package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Double> l1 = makeTest("cases\\test1.txt");
        LinkedList<Double> l2 = makeTest("cases\\test2.txt");
        NumberFormat format = new DecimalFormat("#0.00");      
        Iterator<Double> it1 = l2.iterator();
        Iterator<Double> it2 = l2.iterator();
        Double m1=mean(l1,it1);
        Double m2= mean(l2,it2);
        System.out.println("Mean Test 1: " + m1);        
        System.out.println("Standard Deviation Test 1: " + format.format(stdDev(l1,it1,m1)));
        System.out.println("Mean Test 2: " + m2);
        System.out.println("Standard Deviation Test 2: " + format.format(stdDev(l2,it2,m2)));
    }

    public static LinkedList<Double> makeTest(String path) throws Exception {
        LinkedList<Double> l = new LinkedList<Double>();
        File file = new File(path);
        BufferedReader buf = new BufferedReader(new FileReader(file));
        Double data;
        String d;
        d = buf.readLine();
        while (d != null) {
            data = Double.parseDouble(d);
            l.add(data);
            d = buf.readLine();
        }
        buf.close();
        return l;
    }

    public static Double mean(LinkedList<Double> l, Iterator<Double> it) {
        Double suma = 0.0;
        Double data;
        while (it.hasNext()) {
            data = it.next();
            suma += data;
        }
        return suma / l.size();
    }

    public static Double stdDev(LinkedList<Double> l, Iterator<Double> it, Double m) {
        
        Double sum = 0.0;        
        Double val;
        while (it.hasNext()) {
            val = it.next() - m;
            sum += val * val;
        }
        sum /= l.size() - 1;
        return Math.sqrt(sum);
    }
}
