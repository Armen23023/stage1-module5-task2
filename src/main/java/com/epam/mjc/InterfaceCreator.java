package com.epam.mjc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        Operation operation = (x) -> {
            List<Integer> list = new ArrayList<>();
            Iterator<Integer> iterator = x.iterator();
            while (iterator.hasNext()){
                Integer next = iterator.next();
                list.add(next/divider);
            }
            return list;
        };
        return operation;
    }
}
