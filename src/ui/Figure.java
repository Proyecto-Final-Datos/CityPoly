
package ui;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Joseph Salas
 */
public class Figure {
    
    protected int _CoorX;
    protected int _CoorY;
	
	
	//Constructors 
	public Figure()
	{
		
	}
	
	public Figure(int p_CoorX, int p_CoorY)
	{
		this._CoorX = p_CoorX;
		this._CoorY = p_CoorY;
	}
	
	
	public void paint(Graphics graphics) {
		
	}
	
	//Getters and Setters
	
	public int get_CoorX() {
		return _CoorX;
	}

	public void set_CoorX(int _CoorX) {
		this._CoorX = _CoorX;
	}

	public int get_CoorY() {
		return _CoorY;
	}

	public void set_CoorY(int _CoorY) {
		this._CoorY = _CoorY;
	}

	

    
}
