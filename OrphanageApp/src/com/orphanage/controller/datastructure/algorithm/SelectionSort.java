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
public class SelectionSort {

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

            OrphanModel temp = dataToSort.get(current);
            dataToSort.set(current, dataToSort.get(i));
            dataToSort.set(i, temp);
        }

        return dataToSort;
    }

    /**
     *
     * @param unsortedData
     * @param isDesc
     * @return
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

            OrphanModel temp = dataToSort.get(current);
            dataToSort.set(current, dataToSort.get(i));
            dataToSort.set(i, temp);
        }

        return dataToSort;
    }

    /**
     *
     * @param unsortedData
     * @param isDesc
     * @return
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

            OrphanModel temp = dataToSort.get(current);
            dataToSort.set(current, dataToSort.get(i));
            dataToSort.set(i, temp);
        }

        return dataToSort;
    }

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

            OrphanModel temp = dataToSort.get(current);
            dataToSort.set(current, dataToSort.get(i));
            dataToSort.set(i, temp);
        }

        return dataToSort;
    }
}
