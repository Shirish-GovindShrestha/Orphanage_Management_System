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
        ArrayList<OrphanModel> dataToSort = new ArrayList();
        dataToSort.addAll(unsortedData);
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            int min = i;
            for (int j = i+1; j < dataToSort.size(); j++) {
                if (dataToSort.get(j).getOrphanID() < dataToSort.get(i).getOrphanID()) {
                    min = j;
                }

            }
            OrphanModel temp = dataToSort.get(min);
            dataToSort.set(min, dataToSort.get(i));
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
        ArrayList<OrphanModel> dataToSort = new ArrayList();
        dataToSort.addAll(unsortedData);
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            int min = i;
            for (int j = i+1; j < dataToSort.size(); j++) {
                if (dataToSort.get(j).getFirstName().compareTo(dataToSort.get(i).getFirstName())<0){
                    min = j;
                }

            }
            OrphanModel temp = dataToSort.get(min);
            dataToSort.set(min, dataToSort.get(i));
            dataToSort.set(i, temp);
            
        }
        
        return dataToSort;

    }
    // insertion in string

}
