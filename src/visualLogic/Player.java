
package visualLogic;

/**
 *
 * @author Joseph Salas
 */
public class Player {
    
    private String _NickName;
    private double _Stars;

    public Player(String p_NickName, double p_Stars) {
        this._NickName = p_NickName;
        this._Stars = p_Stars;
    }

    public String getNickName() {
        return _NickName;
    }

    public void setNickName(String _NickName) {
        this._NickName = _NickName;
    }

    public double getStars() {
        return _Stars;
    }

    public void setStars(double _Stars) {
        this._Stars = _Stars;
    }
    
    
    
    
}
