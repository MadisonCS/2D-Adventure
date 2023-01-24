package object;

import entity.Entity;
import main.GamePanel;
//
public class ObjSwordExcalibur extends Entity{

	public ObjSwordExcalibur(GamePanel gp) {
		super(gp);
		type = type_excalibur;
		name = "Excalibur";
		down1 = setup("/objects/sword_excalibur", gp.tileSize,gp.tileSize);
		attackValue = 10;
		attackArea.width = 36;
		attackArea.height = 36;
		description = "(" + name + ")" +"\nWhere's the stone?"; 
		price = 9999;
		knockBackPower = 4;
	
	}

}


/*
	I am thinking about creating a weapons class in between the weapons and the entity class to handle weapon specific stuff. 
*/