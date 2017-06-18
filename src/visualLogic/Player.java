<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualLogic;

=======

package visualLogic;

import internalLogic.ArcGraph;
import internalLogic.GraphNode;
import java.util.ArrayList;

>>>>>>> refs/remotes/origin/Joseph
/**
 *
 * @author Joseph Salas
 */
public class Player {
    
<<<<<<< HEAD
=======
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
    
    
    
    
>>>>>>> refs/remotes/origin/Joseph
}
