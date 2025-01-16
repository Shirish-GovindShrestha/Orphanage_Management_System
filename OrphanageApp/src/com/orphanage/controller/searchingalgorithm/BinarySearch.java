/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.orphanage.controller.searchingalgorithm;

import com.orphanage.model.OrphanModel;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author Shirish Govind Shrestha LMU ID:23057125
 */
public class BinarySearch {

    /**
     * Creates a list with the OrphanModel found at the given index.
     *
     * @param orphanList the list of OrphanModel objects
     * @param index the index where the OrphanModel is found
     * @return a list containing the OrphanModel at the index
     */
    private static ArrayList<OrphanModel> createResultList(ArrayList<OrphanModel> orphanList, int index) {
        ArrayList<OrphanModel> result = new ArrayList<>();
        result.add(orphanList.get(index));
        return result;
    }

    /**
     * Searches for an OrphanModel by its ID in a sorted list using binary
     * search.
     *
     * @param orphanList the sorted list of OrphanModel objects
     * @param left the starting index of the search range
     * @param right the ending index of the search range
     * @param target the OrphanID to search for
     * @return a list containing the OrphanModel with the target ID
     * @throws NoSuchElementException if the target is not found
     */
    public static ArrayList<OrphanModel> binarySearchbyId(ArrayList<OrphanModel> orphanList, int left, int right, short target) {
        if (left > right) {
            throw new NoSuchElementException(target + "not found");
        }
        int mid = (left + right) / 2;
        if (orphanList.get(mid).getOrphanID() == target) {
            return createResultList(orphanList, mid);
        }
        if (orphanList.get(mid).getOrphanID() < target) {
            return binarySearchbyId(orphanList, mid + 1, right, target);
        } else {
            return binarySearchbyId(orphanList, left, mid - 1, target);
        }
    }

    /**
     * Searches for an OrphanModel by its Age in a sorted list using binary
     * search.
     *
     * @param orphanList the sorted list of OrphanModel objects
     * @param left the starting index of the search range
     * @param right the ending index of the search range
     * @param target the OrphanID to search for
     * @return a list containing the OrphanModel with the target ID
     * @throws NoSuchElementException if the target is not found
     */
    public static ArrayList<OrphanModel> binarySearchbyAge(ArrayList<OrphanModel> orphanList, int left, int right, short target) {
        if (left > right) {
            throw new NoSuchElementException(target + "not found");
        }
        int mid = (left + right) / 2;

        if (orphanList.get(mid).getAge() == target) {
            return createResultList(orphanList, mid);
        }

        if (orphanList.get(mid).getAge() < target) {
            return binarySearchbyAge(orphanList, mid + 1, right, target);
        } else {
            return binarySearchbyAge(orphanList, left, mid - 1, target);
        }
    }

    /**
     * Searches for an OrphanModel by its Weight in a sorted list using binary
     * search.
     *
     * @param orphanList the sorted list of OrphanModel objects
     * @param left the starting index of the search range
     * @param right the ending index of the search range
     * @param target the OrphanID to search for
     * @return a list containing the OrphanModel with the target ID
     * @throws NoSuchElementException if the target is not found
     */
    public static ArrayList<OrphanModel> binarySearchbyWeight(ArrayList<OrphanModel> orphanList, int left, int right, short target) {
        if (left > right) {
            throw new NoSuchElementException(target + "not found");
        }
        int mid = (left + right) / 2;

        if (orphanList.get(mid).getWeight() == target) {
            return createResultList(orphanList, mid);
        }

        if (orphanList.get(mid).getWeight() < target) {
            return binarySearchbyWeight(orphanList, mid + 1, right, target);
        } else {
            return binarySearchbyWeight(orphanList, left, mid - 1, target);
        }
    }

    /**
     * Searches for an OrphanModel by its Height in a sorted list using binary
     * search.
     *
     * @param orphanList the sorted list of OrphanModel objects
     * @param left the starting index of the search range
     * @param right the ending index of the search range
     * @param target the OrphanID to search for
     * @return a list containing the OrphanModel with the target ID
     * @throws NoSuchElementException if the target is not found
     */
    public static ArrayList<OrphanModel> binarySearchbyHeight(ArrayList<OrphanModel> orphanList, int left, int right, short target) {
        if (left > right) {
            throw new NoSuchElementException(target + "not found");
        }
        int mid = (left + right) / 2;

        if (orphanList.get(mid).getHeight() == target) {
            return createResultList(orphanList, mid);
        }

        if (orphanList.get(mid).getHeight() < target) {
            return binarySearchbyHeight(orphanList, mid + 1, right, target);
        } else {
            return binarySearchbyHeight(orphanList, left, mid - 1, target);
        }
    }

    /**
     * Searches for an OrphanModel by its FirstName in a sorted list using
     * binary search.
     *
     * @param orphanList the sorted list of OrphanModel objects
     * @param left the starting index of the search range
     * @param right the ending index of the search range
     * @param target the OrphanID to search for
     * @return a list containing the OrphanModel with the target ID
     * @throws NoSuchElementException if the target is not found
     */
    public static ArrayList<OrphanModel> binarySearchbyFirstName(ArrayList<OrphanModel> orphanList, int left, int right, String target) {
        if (left > right) {
            throw new NoSuchElementException(target + "not found");
        }
        int mid = (left + right) / 2;

        if (orphanList.get(mid).getFirstName().equals(target)) {
            return createResultList(orphanList, mid);
        }

        if (orphanList.get(mid).getFirstName().compareTo(target) < 0) {
            return binarySearchbyFirstName(orphanList, mid + 1, right, target);
        } else {
            return binarySearchbyFirstName(orphanList, left, mid - 1, target);
        }
    }

    /**
     * Searches for an OrphanModel by its LastName in a sorted list using binary
     * search.
     *
     * @param orphanList the sorted list of OrphanModel objects
     * @param left the starting index of the search range
     * @param right the ending index of the search range
     * @param target the OrphanID to search for
     * @return a list containing the OrphanModel with the target ID
     * @throws NoSuchElementException if the target is not found
     */
    public static ArrayList<OrphanModel> binarySearchbyLastName(ArrayList<OrphanModel> orphanList, int left, int right, String target) {
        if (left > right) {
            throw new NoSuchElementException(target + "not found");
        }
        int mid = (left + right) / 2;

        if (orphanList.get(mid).getLastName().equals(target)) {
            return createResultList(orphanList, mid);
        }

        if (orphanList.get(mid).getLastName().compareTo(target) < 0) {
            return binarySearchbyLastName(orphanList, mid + 1, right, target);
        } else {
            return binarySearchbyLastName(orphanList, left, mid - 1, target);
        }
    }

    /**
     * Searches for an OrphanModel by its Gender in a sorted list using binary
     * search.
     *
     * @param orphanList the sorted list of OrphanModel objects
     * @param left the starting index of the search range
     * @param right the ending index of the search range
     * @param target the OrphanID to search for
     * @return a list containing the OrphanModel with the target ID
     * @throws NoSuchElementException if the target is not found
     */
    public static ArrayList<OrphanModel> binarySearchbyGender(ArrayList<OrphanModel> orphanList, int left, int right, String target) {
        if (left > right) {
            throw new NoSuchElementException(target + "not found");
        }
        int mid = (left + right) / 2;

        if (orphanList.get(mid).getGender().equals(target)) {
            return createResultList(orphanList, mid);
        }

        if (orphanList.get(mid).getGender().compareTo(target) < 0) {
            return binarySearchbyGender(orphanList, mid + 1, right, target);
        } else {
            return binarySearchbyGender(orphanList, left, mid - 1, target);
        }
    }

    /**
     * Searches for an OrphanModel by its BloodGroup a sorted list using binary
     * search.
     *
     * @param orphanList the sorted list of OrphanModel objects
     * @param left the starting index of the search range
     * @param right the ending index of the search range
     * @param target the OrphanID to search for
     * @return a list containing the OrphanModel with the target ID
     * @throws NoSuchElementException if the target is not found
     */
    public static ArrayList<OrphanModel> binarySearchbyBloodGroup(ArrayList<OrphanModel> orphanList, int left, int right, String target) {
        if (left > right) {
            throw new NoSuchElementException(target + "not found");
        }
        int mid = (left + right) / 2;

        if (orphanList.get(mid).getBloodGroup().equals(target)) {
            return createResultList(orphanList, mid);
        }

        if (orphanList.get(mid).getBloodGroup().compareTo(target) < 0) {
            return binarySearchbyBloodGroup(orphanList, mid + 1, right, target);
        } else {
            return binarySearchbyBloodGroup(orphanList, left, mid - 1, target);
        }
    }

}
