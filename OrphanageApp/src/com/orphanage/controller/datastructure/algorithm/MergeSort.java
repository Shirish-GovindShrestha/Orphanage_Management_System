/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.orphanage.controller.datastructure.algorithm;

import com.orphanage.model.OrphanModel;
import java.util.ArrayList;

/**
 *
 * @author Shirish Govind Shrestha LMU ID:23057125
 */
public class MergeSort {

    /**
     * Sorts a list of OrphanModel objects by their weight or Height in
     * ascending or descending order using Merge Sort.
     *
     * @param unsortedData the list of OrphanModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @param attribute specifies which attribute to sort by
     * @return the sorted list
     */
    public static ArrayList<OrphanModel> mergeSort(ArrayList<OrphanModel> unsortedData, boolean isDesc, String attribute) {
        if (unsortedData.size() < 2) {
            return unsortedData;
        }
        int mid = unsortedData.size() / 2;
        ArrayList<OrphanModel> left = new ArrayList<>(unsortedData.subList(0, mid));
        ArrayList<OrphanModel> right = new ArrayList<>(unsortedData.subList(mid, unsortedData.size()));

        left = mergeSort(left, isDesc, attribute);
        right = mergeSort(right, isDesc, attribute);

        if (attribute.equals("Weight")) {
            return mergeByWeight(left, right, isDesc);
        } else {
            return mergeByHeight(left, right, isDesc);
        }
    }

    /**
     * Merges two sorted lists of OrphanModel objects based on their weight in
     * either ascending or descending order.
     *
     * @param left the first sorted list of OrphanModel objects
     * @param right the second sorted list of OrphanModel objects
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return a new list containing all OrphanModel objects, sorted by weight
     */
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

    /**
     * Merges two sorted lists of OrphanModel objects based on their height in
     * either ascending or descending order.
     *
     * @param left the first sorted list of OrphanModel objects
     * @param right the second sorted list of OrphanModel objects
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return a new list containing all OrphanModel objects, sorted by height
     */

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
