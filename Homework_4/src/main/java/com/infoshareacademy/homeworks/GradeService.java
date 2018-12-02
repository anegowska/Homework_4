package com.infoshareacademy.homeworks;


import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;


public class GradeService {

    public String[][] calculateAverage(String[][] data) {


        DecimalFormat markFormat = new DecimalFormat("0.00");

        if (data == null || data.length == 0) {
            return new String[][]{{}};
        } else {

            List<Student> students = new ArrayList<>();

            for (int i = 0; i < data.length; i++) {
                students.add(new Student(data[i][0], Double.valueOf(data[i][1])));
            }
            students.sort(new StudentsNamesComparator());


            String[][] output = new String[students.size()][2];

            List<String> namesList = students.stream()
                    .map(l -> l.getName())
                    .collect(Collectors.toList());

            List<Double> markList = students.stream()
                    .map(l -> l.getMark())
                    .collect(Collectors.toList());


            for (int i = 0; i < data.length; i++) {
                output[i][0] = namesList.get(i);
                output[i][1] = String.valueOf(markFormat.format(markList.get(i)).replace(",", "."));

            }

            return output;
        }


    }

}
