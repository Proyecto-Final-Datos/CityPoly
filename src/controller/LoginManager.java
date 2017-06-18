
package controller;

import internalLogic.BNode;
import internalLogic.BTree;
import visualLogic.PlayerNode;

/**
 *
 * @author Joseph Salas
 */
public class LoginManager {
    
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
    
}
