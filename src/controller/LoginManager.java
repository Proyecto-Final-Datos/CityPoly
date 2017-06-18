<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

=======

package controller;

import internalLogic.BNode;
import internalLogic.BTree;
import visualLogic.PlayerNode;

>>>>>>> refs/remotes/origin/Joseph
/**
 *
 * @author Joseph Salas
 */
public class LoginManager {
    
<<<<<<< HEAD
=======
    private BTree treeUsers = new BTree(10);
    
    public void saveUser(String p_NickName, String p_Name, String p_Password)
    {
        PlayerNode playerUser = new PlayerNode(p_NickName, p_Name, p_Password);
        treeUsers.insert(treeUsers, playerUser);
        System.out.println("EXITOOOOO");
    }
    
    public boolean searchNickName(String NickName)
    {
        boolean stateNickName = treeUsers.search(treeUsers.getRoot(), NickName);
        
        return stateNickName;
    }
    
    public BNode searchNode(String NickName)
    {
        BNode userNode = treeUsers.searchToInsert(treeUsers.getRoot(), NickName);
        return userNode;
    }
    
>>>>>>> refs/remotes/origin/Joseph
}
