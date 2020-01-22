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
        NumberFormat formatter = new DecimalFormat("#0.00");      
        System.out.println("Mean Test Case 1: " + (mean(l1)));
        System.out.println("Mean Test Case 2: " + formatter.format(mean(l2)));
        System.out.println("Standard Deviation Test Case 1: " + formatter.format(stdDev(l1)));
        System.out.println("Standard Deviation Test Case 2: " + formatter.format(stdDev(l2)));
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

    public static Double mean(LinkedList<Double> l) {
        Double suma = 0.0;
        Iterator<Double> iterator = l.iterator();
        Double data;
        while (iterator.hasNext()) {
            data = iterator.next();
            suma += data;
        }
        return suma / l.size();
    }

    public static Double stdDev(LinkedList<Double> l) {
        Double mean = mean(l);
        Double sum = 0.0;
        Iterator<Double> iterator = l.iterator();
        Double val;
        while (iterator.hasNext()) {
            val = iterator.next() - mean;
            sum += val * val;
        }
        sum /= l.size() - 1;
        return Math.sqrt(sum);
    }
}
