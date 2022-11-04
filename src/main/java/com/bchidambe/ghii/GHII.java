/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.bchidambe.ghii;


/**
 *
 * @author Blessings Chidambe
 */
public class GHII {

    public static void main(String[] args) {
        
        //create nodes
      Node node_A = new Node("Bunda_Turnoff");
      Node node_B = new Node("Ma_Tank_Petroda");
      Node node_C = new Node("Likuni_RB");
      Node node_D = new Node("Institute_for_Youth");
      Node node_E = new Node("Town_Hall_RB");
      Node node_F = new Node("Shoprite");
      Node node_G = new Node("Mchinji_RB");
      Node node_H = new Node("CrossRoads_RB");
      Node node_I = new Node("Chilambula_RB");
      Node node_J = new Node("KCH_RB");
      Node node_K = new Node("Lilongwe_Sanctuary");
      Node node_L = new Node("Bwandiro_TJ");
      Node node_M = new Node("Bingu_Stadium_RB");
      Node node_N = new Node("Area18_Interchange");
      Node node_O = new Node("Parliament_RB");
      Node node_P = new Node("Area25");
      Node node_Q = new Node("Kanengo");

     
      node_A.AddNeighbor(node_C);
      node_A.AddNeighbor(node_B);
      node_B.AddNeighbor(node_D);
      node_B.AddNeighbor(node_E);
      node_C.AddNeighbor(node_E);
      node_C.AddNeighbor(node_G);
      node_E.AddNeighbor(node_F);
      node_D.AddNeighbor(node_K);
      node_F.AddNeighbor(node_J);
      node_F.AddNeighbor(node_H);
      node_G.AddNeighbor(node_H);
      node_G.AddNeighbor(node_M);
      node_H.AddNeighbor(node_I);
      node_H.AddNeighbor(node_L);
      node_I.AddNeighbor(node_J);
      node_J.AddNeighbor(node_K);
      node_L.AddNeighbor(node_N);
      node_K.AddNeighbor(node_O);
      node_M.AddNeighbor(node_P);
      node_M.AddNeighbor(node_N);
      node_N.AddNeighbor(node_O);
      node_N.AddNeighbor(node_Q);
      node_P.AddNeighbor(node_Q);
      
      new Graph(node_A, node_H).ShortestPath();        
    }
}
