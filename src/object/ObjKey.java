package object;

import entity.Entity;
import main.GamePanel;

public class ObjKey extends Entity{
	GamePanel gp;
	public ObjKey(GamePanel gp) {
		super(gp);
		this.gp = gp;
		type = type_consumable;
		name = "Key";
		stackable = true;
		down1 = setup("/objects/key", gp.tileSize, gp.tileSize);
		description = "(" + name + ")" + "\nThis key can open a door."; 	
		price = 25;
	}
	public boolean use(Entity entity) {
		gp.gameState = gp.dialogueState;
		int objIndex = getDetected(entity, gp.obj, "Door");
			
		if(objIndex != 999) {
			gp.ui.currentDialogue = " You use the " + name + " and open the door";
			gp.playSE(3);
			gp.obj[gp.currentMap][objIndex] = null;
			return true;
		}
		else {
			gp.ui.currentDialogue = " What are you doing? ";
			return false;
		}
		
	}
		
	
}
