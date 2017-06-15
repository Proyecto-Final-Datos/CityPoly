/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author albertoobando
 */
public class BNode {
    
    static int M;  //variable to determine order of tree

    int count; // number of keys in node

    String key[];  // array of key values

    BNode child[]; //array of references

    boolean leaf; //is node a leaf or not

    BNode parent;  //parent of current node.

// ----------------------------------------------------
// this will be default constructor for new node      |
// ----------------------------------------------------

    public BNode()
    {}
// ----------------------------------------------------
// initial value constructor for new node             |
// will be called from BTree.java                     |
// ----------------------------------------------------

    public BNode(int pM, BNode parent)
    {
        this.M = pM;  //assign size

        this.parent = parent; //assign parent

        key = new String[Math.round(pM * 2/3)];  // array of proper size REVISAR

        child = new BNode[pM * 2]; // array of refs proper size REVISAR

        leaf = true; // everynode is leaf at first;

        count = 0; //until we add keys later.
    }

// -----------------------------------------------------
// this is method to return key value at index position|
// -----------------------------------------------------

    public String getValue(int pIndex)
    {
        return key[pIndex];
    }

// ----------------------------------------------------
// this is method to get ith child of node            |
// ----------------------------------------------------

    public BNode getChild(int pIndex)
    {
        return child[pIndex];
    }
    
}
