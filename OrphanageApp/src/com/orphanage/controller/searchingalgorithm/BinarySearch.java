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
 * @author victus
 */
public class BinarySearch {

    /**
     *
     * @param orphanList
     * @param left
     * @param right
     * @param target
     * @return
     */
    public static ArrayList<OrphanModel> binarySearchbyId(ArrayList<OrphanModel> orphanList, int left, int right, int target) {
        if (left > right) {
            throw new NoSuchElementException(target + "not found");
        }
        int mid = (left + right) / 2;
        if (orphanList.get(mid).getOrphanID() == target) {
            ArrayList<OrphanModel> result = new ArrayList<>();
            result.add(orphanList.get(mid));
            return result;
        }
        if (orphanList.get(mid).getOrphanID() < target) {
            return binarySearchbyId(orphanList, mid + 1, right, target);
        } else {
            return binarySearchbyId(orphanList, left, mid - 1, target);
        }
    }

    /**
     *
     * @param orphanList
     * @param left
     * @param right
     * @param target
     * @return
     */
    public static ArrayList<OrphanModel> binarySearchbyAge(ArrayList<OrphanModel> orphanList, int left, int right, short target) {
        if (left > right) {
            throw new NoSuchElementException(target + "not found");
        }
        int mid = (left + right) / 2;

        if (orphanList.get(mid).getAge() == target) {
            ArrayList<OrphanModel> result = new ArrayList<>();
            result.add(orphanList.get(mid));
            return result;
        }

        if (orphanList.get(mid).getAge() < target) {
            return binarySearchbyAge(orphanList, mid + 1, right, target);
        } else {
            return binarySearchbyAge(orphanList, left, mid - 1, target);
        }
    }

    /**
     *
     * @param orphanList
     * @param left
     * @param right
     * @param target
     * @return
     */
    public static ArrayList<OrphanModel> binarySearchbyWeight(ArrayList<OrphanModel> orphanList, int left, int right, short target) {
        if (left > right) {
            throw new NoSuchElementException(target + "not found");
        }
        int mid = (left + right) / 2;

        if (orphanList.get(mid).getWeight() == target) {
            ArrayList<OrphanModel> result = new ArrayList<>();
            result.add(orphanList.get(mid));
            return result;
        }

        if (orphanList.get(mid).getWeight() < target) {
            return binarySearchbyWeight(orphanList, mid + 1, right, target);
        } else {
            return binarySearchbyWeight(orphanList, left, mid - 1, target);
        }
    }

    /**
     *
     * @param orphanList
     * @param left
     * @param right
     * @param target
     * @return
     */
    public static ArrayList<OrphanModel> binarySearchbyHeight(ArrayList<OrphanModel> orphanList, int left, int right, short target) {
        if (left > right) {
            throw new NoSuchElementException(target + "not found");
        }
        int mid = (left + right) / 2;

        if (orphanList.get(mid).getHeight() == target) {
            ArrayList<OrphanModel> result = new ArrayList<>();
            result.add(orphanList.get(mid));
            return result;
        }

        if (orphanList.get(mid).getHeight() < target) {
            return binarySearchbyHeight(orphanList, mid + 1, right, target);
        } else {
            return binarySearchbyHeight(orphanList, left, mid - 1, target);
        }
    }

    /**
     *
     * @param orphanList
     * @param left
     * @param right
     * @param target
     * @return
     */
    public static ArrayList<OrphanModel> binarySearchbyFirstName(ArrayList<OrphanModel> orphanList, int left, int right, String target) {
        if (left > right) {
            throw new NoSuchElementException(target + "not found");
        }
        int mid = (left + right) / 2;

        if (orphanList.get(mid).getFirstName().equals(target)) {
            ArrayList<OrphanModel> result = new ArrayList<>();
            result.add(orphanList.get(mid));
            return result;
        }

        if (orphanList.get(mid).getFirstName().compareTo(target) < 0) {
            return binarySearchbyFirstName(orphanList, mid + 1, right, target);
        } else {
            return binarySearchbyFirstName(orphanList, left, mid - 1, target);
        }
    }

    /**
     *
     * @param orphanList
     * @param left
     * @param right
     * @param target
     * @return
     */
    public static ArrayList<OrphanModel> binarySearchbyLastName(ArrayList<OrphanModel> orphanList, int left, int right, String target) {
        if (left > right) {
            throw new NoSuchElementException(target + "not found");
        }
        int mid = (left + right) / 2;

        if (orphanList.get(mid).getLastName().equals(target)) {
            ArrayList<OrphanModel> result = new ArrayList<>();
            result.add(orphanList.get(mid));
            return result;
        }

        if (orphanList.get(mid).getLastName().compareTo(target) < 0) {
            return binarySearchbyLastName(orphanList, mid + 1, right, target);
        } else {
            return binarySearchbyLastName(orphanList, left, mid - 1, target);
        }
    }

    /**
     *
     * @param orphanList
     * @param left
     * @param right
     * @param target
     * @return
     */
    public static ArrayList<OrphanModel> binarySearchbyGender(ArrayList<OrphanModel> orphanList, int left, int right, String target) {
        if (left > right) {
            throw new NoSuchElementException(target + "not found");
        }
        int mid = (left + right) / 2;

        if (orphanList.get(mid).getGender().equals(target)) {
            ArrayList<OrphanModel> result = new ArrayList<>();
            result.add(orphanList.get(mid));
            return result;
        }

        if (orphanList.get(mid).getGender().compareTo(target) < 0) {
            return binarySearchbyGender(orphanList, mid + 1, right, target);
        } else {
            return binarySearchbyGender(orphanList, left, mid - 1, target);
        }
    }

    /**
     *
     * @param orphanList
     * @param left
     * @param right
     * @param target
     * @return
     */
    public static ArrayList<OrphanModel> binarySearchbyBloodGroup(ArrayList<OrphanModel> orphanList, int left, int right, String target) {
        if (left > right) {
            throw new NoSuchElementException(target + "not found");
        }
        int mid = (left + right) / 2;

        if (orphanList.get(mid).getBloodGroup().equals(target)) {
            ArrayList<OrphanModel> result = new ArrayList<>();
            result.add(orphanList.get(mid));
            return result;
        }

        if (orphanList.get(mid).getBloodGroup().compareTo(target) < 0) {
            return binarySearchbyBloodGroup(orphanList, mid + 1, right, target);
        } else {
            return binarySearchbyBloodGroup(orphanList, left, mid - 1, target);
        }
    }

}
