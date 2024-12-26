/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.orphanage.controller.DataStructure;

import com.orphanage.model.OrphanModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victus
 */
public class Sort {

    public void sortByChildId(List<OrphanModel> unsortedData, boolean isDesc) {
        List<OrphanModel> dataToSort = new ArrayList();
        dataToSort.addAll(unsortedData);
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            int min = i;
            for (int j = 0; i < dataToSort.size(); i++) {
                if (unsortedData.get(j).getOrphanID() < unsortedData.get(i).getOrphanID()) {
                    min = j;
                }

            }
            OrphanModel temp = dataToSort.get(min);
            dataToSort.set(min, dataToSort.get(i));
            dataToSort.set(i, temp);
            
        }

    }
    
    // insertion in string

}
