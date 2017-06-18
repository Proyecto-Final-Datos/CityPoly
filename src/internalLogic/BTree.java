<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalLogic;

=======

package internalLogic;

import visualLogic.PlayerNode;

>>>>>>> refs/remotes/origin/Joseph
/**
 *
 * @author Joseph Salas
 */
public class BTree {
<<<<<<< HEAD
    
=======
    // here are variables available to tree

    static int order; // order of tree

   private BNode root;  //every tree has at least a root node

    public BNode getRoot() {
        return root;
    }

    public void setRoot(BNode root) {
        this.root = root;
    }


// ---------------------------------------------------------
// here is the constructor for tree                        |
// ---------------------------------------------------------


    public BTree(int order)
    {
        this.order = order;

        root = new BNode(order, null);

    }

    public boolean search(BNode root, String key)
    {
        int i = 0;//we always want to start searching the 0th index of node.

        while(i < root.count && key.compareTo(root.key[i]) > 0)//keep incrementing in node while key > current value.
        {
            i++;
        }

        if(i <= root.count && key.equals(root.key[i]))//obviously if key is in node we went to return node.
        {
            return true;
        }

        if(root.leaf)//since we've already checked root if it is leaf we don't have anything else to check
        {
            return false;
        }
        else//else if it is not leave recurse down through ith child
        {
            return search(root.getChild(i),key);
        }
    }
//  --------------------------------------------------------
//  this will be the split method.  It will split node we  |
//  want to insert into if it is full.                     |
//  --------------------------------------------------------

        public void split(BNode x, int i, BNode y)
    {
        BNode z = new BNode(order,null);//gotta have extra node if we are to split.

        z.leaf = y.leaf;//set boolean to same as y

        z.count = order - 1;//this is updated size

        for(int j = 0; j < order - 1; j++)
        {
            z.key[j] = y.key[j+order]; //copy end of y into front of z
        }
        
        if(!y.leaf)//if not leaf we have to reassign child nodes.
        {
            for(int k = 0; k < order; k++)
            {
                z.child[k] = y.child[k+order]; //reassing child of y
            }
        }

        y.count = order - 1; //new size of y

        for(int j = x.count ; j> i ; j--)//if we push key into x we have
        {				 //to rearrange child nodes
            x.child[j+1] = x.child[j]; //shift children of x

        }
        
        x.child[i+1] = z; //reassign i+1 child of x

        for(int j = x.count; j> i; j--)
        {
            x.key[j + 1] = x.key[j]; // shift keys
        }
        
        x.key[i] = y.key[order-1];//finally push value up into root.

        y.key[order-1 ] = ""; //erase value where we pushed from REVISAR

        for(int j = 0; j < order - 1; j++)
        {
            y.key[j + order] = ""; //'delete' old values REVISAR
        }
        
        x.count ++;  //increase count of keys in x
    }

// ----------------------------------------------------------
// this will be insert method when node is not full.        |
// ----------------------------------------------------------

    public void nonfullInsert(BNode x, PlayerNode key)
    {
        int i = x.count; //i is number of keys in node x

        if(x.leaf)
        {
            while(i >= 1 && key.getNickName().compareTo(x.key[i-1]) < 0)//here find spot to put key.
            {
                x.key[i] = x.key[i-1];//shift values to make room

                i--;//decrement
            }

            x.key[i] = key.getNickName();//finally assign value to node REVISAR
            x.count ++; //increment count of keys in this node now.

        }


        else
        {
            int j = 0;
            while(j < x.count  && key.getNickName().compareTo(x.key[j]) > 0)//find spot to recurse on correct child 
            {			             		
                j++;
            }
            if(x.child[j].count == order*2 - 1)
            {
                split(x,j,x.child[j]);//call split on node x's ith child

                if(key.getNickName().compareTo(x.key[j]) > 0)
                {
                    j++;
                }
            }

            nonfullInsert(x.child[j],key);//recurse
        }
    }
//--------------------------------------------------------------
//this will be the method to insert in general, it will call    |
//insert non full if needed.                                    |
//--------------------------------------------------------------

    public void insert(BTree t, PlayerNode key)
    {
        BNode r = t.root;//this method finds the node to be inserted as 
                         //it goes through this starting at root node.
        if(r.count == 2*order - 1)//if is full
        {
            BNode s = new BNode(order,null);//new node
            t.root = s;   
            s.leaf = false;
            s.count = 0;                      
            s.child[0] = r;

            split(s,0,r);//split root
            nonfullInsert(s, key); //call insert method
        }
        else
            nonfullInsert(r,key);//if its not full just insert it
    }

// ---------------------------------------------------------------------------------
// this will be method to print out a node, or recurses when root node is not leaf |
// ---------------------------------------------------------------------------------


    public void print(BNode n)
    {
        for(int i = 0; i < n.count; i++)
        {
            System.out.print(n.getValue(i)+" " );//this part prints root node
        }

        if(!n.leaf)//this is called when root is not leaf;
        {
            for(int j = 0; j <= n.count  ; j++)//in this loop we recurse
            {                             //to print out tree in
                if(n.getChild(j) != null) //preorder fashion.
                {			  //going from left most
                System.out.println();	  //child to right most
                print(n.getChild(j));     //child.
                }
            }
        }
    }

// ------------------------------------------------------------
// this will be method to print out a node                    |
// ------------------------------------------------------------

    /*public void SearchPrintNode(BTree pTree, PlayerNode pKey)
    {
        BNode temp= new BNode(order,null);

        temp= search(pTree.root,pKey);

        if (temp==null)
        {
        System.out.println("The Key does not exist in this tree");
        }

        else
        {
        print(temp);
        }

    }*/
    
    
     public BNode searchToInsert(BNode root, String key)
    {
        int i = 0;//we always want to start searching the 0th index of node.

        while(i < root.count && key.compareTo(root.key[i]) > 0)//keep incrementing in node while key > current value.
        {
            i++;
        }

        if(i <= root.count && key.equals(root.key[i]))//obviously if key is in node we went to return node.
        {
            return root;
        }

        if(root.leaf)//since we've already checked root if it is leaf we don't have anything else to check
        {
            return null;
        }
        else//else if it is not leave recurse down through ith child
        {
            return searchToInsert(root.getChild(i),key);
        }
    }
>>>>>>> refs/remotes/origin/Joseph
}
