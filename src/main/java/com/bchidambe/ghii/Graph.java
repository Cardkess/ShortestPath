/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bchidambe.ghii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 *
 * @author Blessings Chidambe
 */
public class Graph {
    
  Node start, end;

  Graph(Node start, Node end){
    this.start = start;
    this.end = end;
  }
  
  
  public void ShortestPath(){
    Queue<Node> queue = new LinkedList<>();

    start.visited = true;   
    queue.add(start); 

    while(!queue.isEmpty()){
      Node current_node = queue.poll();
     
      for(Node node: current_node.neighbors){
        if(!node.visited){
          node.visited =true;
          queue.add(node);
          node.prev = current_node;
          if(node==end){
            queue.clear();
            break;
          }
        }
      }
    }
    GetRoute();
  }
    
    
  private void GetRoute(){
    Node node = end;
    List<Node> route = new ArrayList<>();
   
    while(node != null){
      route.add(node);
      node = node.prev;
    }
    
    Collections.reverse(route);
    
    System.out.println(route);
  }

    
 }
