package org.pltw.examples.sodaadviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 20hunbra on 11/28/2017.
 */

public class SodaExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("Grape")) {
            brands.add("Welch's Grape Soda");
            brands.add("Fanta Grape");
        }
        else if (color.equals("Orange")) {
            brands.add("Sunkist");
            brands.add("Fanta Orange");
        }
        else if (color.equals("Lime")) {
            brands.add("7 Up");
            brands.add("Sprite");
        }
        else {
            brands.add("Pepsi");
            brands.add("Coke");
        }
        return brands;
    }
}
