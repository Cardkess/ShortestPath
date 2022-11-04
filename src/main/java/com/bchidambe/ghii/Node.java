/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bchidambe.ghii;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Blessings Chidambe
 */
public class Node {
    
  String name;
  List<Node> neighbors;
  boolean visited = false;
  Node prev = null;

  Node(String name){
    this.name = name;
    this.neighbors = new ArrayList<>();
  }

  void AddNeighbor(Node node){
    this.neighbors.add(node);
    node.neighbors.add(this);
  }


  public String toString(){
    return this.name;
  }
    
}
