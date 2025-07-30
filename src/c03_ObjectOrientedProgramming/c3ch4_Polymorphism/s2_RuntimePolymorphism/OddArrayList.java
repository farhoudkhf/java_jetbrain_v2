package c03_ObjectOrientedProgramming.c3ch4_Polymorphism.s2_RuntimePolymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class OddArrayList extends ArrayList<Integer> {

    public OddArrayList(Integer... nums) {
        super(Arrays.stream(nums)
                .filter(OddArrayList::isOdd)
                .collect(Collectors.toSet()));
    }

     @Override
    public void add(int Index, Integer element) {
          if (Math.abs(element) % 2 == 1) {
              super.add(Index, element);
          }
     }

     @Override
    public boolean add(Integer element) {
         if (isOdd(element)) {
             return super.add(element);
         } else {
             return false;
         }
     }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return super.addAll(index, c);
    }

    public static boolean isOdd(Integer element) {
         return Math.abs(element) % 2 == 1;
     }


}
