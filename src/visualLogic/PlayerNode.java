<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualLogic;

/**
 *
 * @author Joseph Salas
 */
public class PlayerNode {
    
=======

package visualLogic;


public class PlayerNode {
    
    private String _Name;
    private String _NickName;
    private String _Password;
    
    public PlayerNode(String p_NickName, String p_Name, String p_Password)
    {
        this._NickName = p_NickName;
        this._Name = p_Name;
        this._Password = p_Password;
    }

    public String getName() {
        return _Name;
    }

    public void setName(String _Name) {
        this._Name = _Name;
    }

    public String getNickName() {
        return _NickName;
    }

    public void setNickName(String _NickName) {
        this._NickName = _NickName;
    }

    public String getPassword() {
        return _Password;
    }

    public void setPassword(String _Password) {
        this._Password = _Password;
    }
    
    
    
>>>>>>> refs/remotes/origin/Joseph
}
