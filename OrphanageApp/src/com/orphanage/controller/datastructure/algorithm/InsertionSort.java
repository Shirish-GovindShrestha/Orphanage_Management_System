/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.orphanage.controller.datastructure.algorithm;

import com.orphanage.model.OrphanModel;
import java.util.ArrayList;

/**
 *
 * @author victus
 */
public class InsertionSort {

    /**
     *
     * @param unsortedData
     * @param isDesc
     * @return dataToSort
     */
    public static ArrayList<OrphanModel> sortByLastName(ArrayList<OrphanModel> unsortedData, boolean isDesc) {
        ArrayList<OrphanModel> dataToSort = new ArrayList<>();
        dataToSort.addAll(unsortedData);

        for (int i = 1; i < dataToSort.size(); i++) {
            OrphanModel current = dataToSort.get(i);
            int j = i - 1;

            while (j >= 0 && (isDesc
                    ? dataToSort.get(j).getLastName().compareTo(current.getLastName()) < 0
                    : dataToSort.get(j).getLastName().compareTo(current.getLastName()) > 0)) {
                dataToSort.set(j + 1, dataToSort.get(j));
                j--;
            }

            dataToSort.set(j + 1, current);
        }

        return dataToSort;
    }

    /**
     *
     * @param unsortedData
     * @param isDesc
     * @return dataToSort
     */
    public static ArrayList<OrphanModel> sortByAge(ArrayList<OrphanModel> unsortedData, boolean isDesc) {
        ArrayList<OrphanModel> dataToSort = new ArrayList<>();
        dataToSort.addAll(unsortedData);

        for (int i = 1; i < dataToSort.size(); i++) {
            OrphanModel current = dataToSort.get(i);
            int j = i - 1;

            while (j >= 0 && (isDesc
                    ? dataToSort.get(j).getAge() < current.getAge()
                    : dataToSort.get(j).getAge() > current.getAge())) {
                dataToSort.set(j + 1, dataToSort.get(j));
                j--;
            }

            dataToSort.set(j + 1, current);
        }

        return dataToSort;
    }

    

}
