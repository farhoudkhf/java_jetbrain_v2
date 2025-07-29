package c03_ObjectOrientedProgramming.c3ch3_Inheritance.ch3_Challenge_MySolution;

import java.util.ArrayList;

public class ModArrayList<D> extends ArrayList<D> {

    public D getUsingMod(int idx) {
        int validIndex = Math.abs(idx) % this.size();
        return this.get(validIndex);
    }

}
