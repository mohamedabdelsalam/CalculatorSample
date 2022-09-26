package main.java.com.example;

import com.google.common.base.Strings;
import IDriver

/**
 * This is java doc.
 * @author maboubakr
 *
 */
public class Driver implements IDriver {

    /**
     */
    private final String name;

    /**
     * This is the java documentation.
     * @param name
     */
    public Calculator(final String name) {
        if (Strings.isNullOrEmpty(name)) {
            this.name = "Standard";
        } else {
            this.name = name;
        }
    }

    /**
     * This is java documentation.
     * @param x documentation
     * @param y documentation
     * @return the sum.
     */
    public int add(final int x, final int y) {
        if (x < 0 || y < 0) {
            throw new RuntimeException("wrong");
        }

        return x + y;
    }

    /**
     * This is java documentation for subtraction.
     * @param x
     * @param y
     * @return the subtraction.
     */
    public int subtract(final int x, final int y) {
        return x - y;
    }

    /**
     * This is java doc.
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * This is a java doc.
     * @param args
     */
    public static void main(final String[] args) {
        Calculator cal = new Calculator("Mohamed");
        System.out.println(cal.toString());
        System.out.println(cal.add(4, 6));
    }
}
