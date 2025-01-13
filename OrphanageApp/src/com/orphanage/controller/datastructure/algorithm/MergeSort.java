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
public class MergeSort {

    public static ArrayList<OrphanModel> mergeSort(ArrayList<OrphanModel> unsortedData, boolean isDesc, String attribute) {
        if (unsortedData.size() < 2) {
            return unsortedData;
        }
        int mid = unsortedData.size() / 2;
        ArrayList<OrphanModel> left = new ArrayList<>(unsortedData.subList(0, mid));
        ArrayList<OrphanModel> right = new ArrayList<>(unsortedData.subList(mid, unsortedData.size()));

        left = mergeSort(left, isDesc, attribute);
        right = mergeSort(right, isDesc, attribute);
        
        if(attribute.equals("Weight")){
            return mergeByWeight(left, right, isDesc);
        }else{
            return mergeByHeight(left, right, isDesc);
        }
    }

    private static ArrayList<OrphanModel> mergeByWeight(ArrayList<OrphanModel> left, ArrayList<OrphanModel> right, boolean isDesc) {
        ArrayList<OrphanModel> merged = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            if (isDesc) {
                if (left.get(i).getWeight() > right.get(j).getWeight()) {
                    merged.add(left.get(i++));
                } else {
                    merged.add(right.get(j++));
                }
            } else {
                if (left.get(i).getWeight() < right.get(j).getWeight()) {
                    merged.add(left.get(i++));
                } else {
                    merged.add(right.get(j++));
                }
            }
        }

        while (i < left.size()) {
            merged.add(left.get(i++));
        }

        while (j < right.size()) {
            merged.add(right.get(j++));
        }

        return merged;
    }
    
    
    private static ArrayList<OrphanModel> mergeByHeight(ArrayList<OrphanModel> left, ArrayList<OrphanModel> right, boolean isDesc) {
        ArrayList<OrphanModel> merged = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            if (isDesc) {
                if (left.get(i).getHeight() > right.get(j).getHeight()) {
                    merged.add(left.get(i++));
                } else {
                    merged.add(right.get(j++));
                }
            } else {
                if (left.get(i).getHeight() < right.get(j).getHeight()) {
                    merged.add(left.get(i++));
                } else {
                    merged.add(right.get(j++));
                }
            }
        }

        while (i < left.size()) {
            merged.add(left.get(i++));
        }

        while (j < right.size()) {
            merged.add(right.get(j++));
        }

        return merged;
    }

}
