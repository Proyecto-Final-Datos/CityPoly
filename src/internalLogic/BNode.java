
package internalLogic;

/**
 *
 * @author Joseph Salas
 */
public class BNode<T> {
    
    
    static int M;  //variable to determine order of tree
    int count; // number of keys in node
    String key[];  // array of key values
    BNode<T> child[]; //array of references
    boolean leaf; //is node a leaf or not
    BNode<T> parent;  //parent of current node.

// ----------------------------------------------------
// this will be default constructor for new node      |
// ----------------------------------------------------

    public BNode()
    {}
// ----------------------------------------------------
// initial value constructor for new node             |
// will be called from BTree.java                     |
// ----------------------------------------------------

    public BNode(int pM, BNode<T> pParent)
    {
        this.M = pM;  //assign size

        this.parent = pParent; //assign parent

        key = new String[2*pM - 1];  // array of proper size REVISAR

        child = new BNode[2*pM]; // array of refs proper size REVISAR

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
