
package visualLogic;

import internalLogic.ArcGraph;
import internalLogic.GraphNode;
import java.util.ArrayList;

/**
 *
 * @author Joseph Salas
 */
public class Player {
    
    private String NickName;
    private String Password;
    private double Stars;
    private ArrayList<ChallengesDeck> Challenges;
    private ArrayList<ArcGraph> ChallengePath;
    private GraphNode StartNode;

    public Player(String pNickName, String pPassword,double pStars) {
        this.NickName = pNickName;
        this.Password = pPassword;
        this.Stars = pStars;
    }

    public double getStars() {
        return Stars;
    }

    public void setStars(double _Stars) {
        this.Stars = _Stars;
    }

    public ArrayList<ChallengesDeck> getChallenges(){
      return this.Challenges;
    }

    public void setChallenges(ArrayList<ChallengesDeck> pChallenges){
      this.Challenges = pChallenges;
    }

    public ArrayList<ArcGraph> getChallengePath(){
      return this.ChallengePath;
    }

    public void setChallengePath(ArrayList<ArcGraph> pChallengePath){
      this.ChallengePath = pChallengePath;
    }

    public GraphNode getStartNode(){
      return this.StartNode;
    }

    public void setStartNode(GraphNode pNode){
      this.StartNode = pNode;
    } 

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    
    
}
