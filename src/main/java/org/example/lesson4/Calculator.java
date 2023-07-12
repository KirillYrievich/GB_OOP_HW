package org.example.lesson4;

import java.util.LinkedList;
import java.util.List;

public class Calculator implements Methods<Number> {
    @Override
    public Number add(List<Number> items) {
        double sum = 0;
        for (Number value : items) {
            sum += value.doubleValue();
        }
        return sum;
    }

    @Override
    public Number divide(List<Number> items) {
        double result = items.get(0).doubleValue();
        for (int i = 1; i < items.size(); i++) {
            result = result / items.get(i).doubleValue();
        }
        return result;
    }

    @Override
    public Number multiply(List<Number> items) {
        double result = items.get(0).doubleValue();
        for (int i = 1; i < items.size(); i++) {
            result = result * items.get(i).doubleValue();
        }
        return result;
    }

    @Override
    public List<String> toBinary(List<Object> items) {
        List<String> result = new LinkedList<>();
        for (Object value : items) {
            int number;
            if (value.getClass() == String.class) {
                number = Integer.parseInt((String) value);
                result.add(Integer.toBinaryString(number));
            } else {
                result.add(Integer.toBinaryString((int) value));
            }
        }
        return result;
    }

}