/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.orphanage.controller.datastructure;

import com.orphanage.model.OrphanModel;
import java.util.LinkedList;


/**
 *
 * @author victus
 */
public class Queue {

    private final LinkedList<OrphanModel> arr;
    private final int capacity;

    public Queue(int capacity) {
        if(capacity<0){
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        arr = new LinkedList();
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return arr.isEmpty();
    }

    public boolean isFull() {
            return arr.size() == capacity;

    }
    
    //need to put in try catch
    public OrphanModel peek(){
        try{
            return arr.getFirst();
        }catch(Exception ex){
            throw new IllegalStateException("Empty Queue Found");
        }
    }
    
    public int poll(){
        return arr.size();
    }
    
    public void enqueue(OrphanModel x) {
        if (!isFull()) {
            arr.add(x);
        }else{
            throw new IllegalStateException("Queue Found Full");
        }
    }

    public OrphanModel dequeue() {
        try{
            return arr.removeFirst();
        }catch(Exception e){
            throw new IllegalStateException("Empty Queue Found");
        }
    }

}
