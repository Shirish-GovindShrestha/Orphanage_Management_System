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
public class SelectionSort {

    /**
     * Sorts a list of OrphanModel objects by their orphanID in ascending or
     * descending order using Selection Sort.
     *
     * @param unsortedData the list of OrphanModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public static ArrayList<OrphanModel> sortById(ArrayList<OrphanModel> unsortedData, boolean isDesc) {
        ArrayList<OrphanModel> dataToSort = new ArrayList<>();
        dataToSort.addAll(unsortedData);

        for (int i = 0; i < dataToSort.size() - 1; i++) {
            int current = i;

            for (int j = i + 1; j < dataToSort.size(); j++) {
                if (isDesc) {
                    if (dataToSort.get(j).getOrphanID() > dataToSort.get(current).getOrphanID()) {
                        current = j;
                    }
                } else {
                    if (dataToSort.get(j).getOrphanID() < dataToSort.get(current).getOrphanID()) {
                        current = j;
                    }
                }
            }
            swap(dataToSort, current, i);
        }

        return dataToSort;
    }

    /**
     * Swaps two elements in the list.
     *
     * @param dataToSort the list of StudentModel objects
     * @param current the index of the first element
     * @param i the index of the second element
     */
    private static void swap(ArrayList<OrphanModel> dataToSort, int current, int i) {
        OrphanModel temp = dataToSort.get(current);
        dataToSort.set(current, dataToSort.get(i));
        dataToSort.set(i, temp);
    }

    /**
     * Sorts a list of OrphanModel objects by their FirstName in ascending or
     * descending order using Selection Sort.
     *
     * @param unsortedData the list of OrphanModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public static ArrayList<OrphanModel> sortByFirstName(ArrayList<OrphanModel> unsortedData, boolean isDesc) {
        ArrayList<OrphanModel> dataToSort = new ArrayList<>();
        dataToSort.addAll(unsortedData);

        for (int i = 0; i < dataToSort.size() - 1; i++) {
            int current = i;

            for (int j = i + 1; j < dataToSort.size(); j++) {
                if (isDesc) {
                    if (dataToSort.get(j).getFirstName().compareTo(dataToSort.get(current).getFirstName()) > 0) {
                        current = j;
                    }
                } else {
                    if (dataToSort.get(j).getFirstName().compareTo(dataToSort.get(current).getFirstName()) < 0) {
                        current = j;
                    }
                }
            }

            swap(dataToSort, current, i);
        }

        return dataToSort;
    }

    /**
     * Sorts a list of OrphanModel objects by their BloodGroup in ascending or
     * descending order using Selection Sort.
     *
     * @param unsortedData the list of OrphanModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public static ArrayList<OrphanModel> sortByBloodGroup(ArrayList<OrphanModel> unsortedData, boolean isDesc) {
        ArrayList<OrphanModel> dataToSort = new ArrayList<>();
        dataToSort.addAll(unsortedData);

        for (int i = 0; i < dataToSort.size() - 1; i++) {
            int current = i;

            for (int j = i + 1; j < dataToSort.size(); j++) {
                if (isDesc) {
                    if (dataToSort.get(j).getBloodGroup().compareTo(dataToSort.get(current).getBloodGroup()) > 0) {
                        current = j;
                    }
                } else {
                    if (dataToSort.get(j).getBloodGroup().compareTo(dataToSort.get(current).getBloodGroup()) < 0) {
                        current = j;
                    }
                }
            }

            swap(dataToSort, current, i);
        }

        return dataToSort;
    }
    
    /**
     * Sorts a list of OrphanModel objects by their Gender in ascending or
     * descending order using Selection Sort.
     *
     * @param unsortedData the list of OrphanModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public static ArrayList<OrphanModel> sortByGender(ArrayList<OrphanModel> unsortedData, boolean isDesc) {
        ArrayList<OrphanModel> dataToSort = new ArrayList<>();
        dataToSort.addAll(unsortedData);

        for (int i = 0; i < dataToSort.size() - 1; i++) {
            int current = i;

            for (int j = i + 1; j < dataToSort.size(); j++) {
                if (isDesc) {
                    if (dataToSort.get(j).getGender().compareTo(dataToSort.get(current).getGender()) > 0) {
                        current = j;
                    }
                } else {
                    if (dataToSort.get(j).getGender().compareTo(dataToSort.get(current).getGender()) < 0) {
                        current = j;
                    }
                }
            }

            swap(dataToSort, current, i);
        }

        return dataToSort;
    }
}
