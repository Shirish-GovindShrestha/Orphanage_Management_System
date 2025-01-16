/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.orphanage.controller.datastructure.algorithm;

import com.orphanage.model.OrphanModel;
import java.util.ArrayList;

/**
 *
 * @author Shirish Govind Shrestha 
 * LMU ID:23057125
 */
public class InsertionSort {

    /**
     * Sorts a list of OrphanModel objects by their LastName in ascending or
     * descending order using Insertion Sort.
     *
     * @param unsortedData the list of OrphanModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
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
     * Sorts a list of OrphanModel objects by their Age in ascending or
     * descending order using Insertion Sort.
     *
     * @param unsortedData the list of OrphanModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
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
