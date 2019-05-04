import java.awt.Image;

public class Card_32 extends Card {
	String name;
	Image img;
	public Card_32(String name, Image img){
		this.name = name;
		this.img = img;
		
	}
	@Override
	public String getName(){
		return name;
	}
	public Image getImage(){
		return img;
	}
	@Override
	public boolean playCard() {
		if(!(super.playerHolder.getRoom().roomName.equals ("ECS 302") 
				|| super.playerHolder.getRoom().roomName.equals ("Cecs Conference Room")
				|| super.playerHolder.getRoom().roomName.equals ("ECS 308")
				|| super.playerHolder.getRoom().roomName.equals ("Eat Club")
				|| super.playerHolder.getRoom().roomName.equals ("Computer Lab")
				|| super.playerHolder.getRoom().roomName.equals ("Room of Retirement")
				|| super.playerHolder.getRoom().roomName.equals ("Elevators")
				|| super.playerHolder.getRoom().roomName.equals ("North Hall")
				|| super.playerHolder.getRoom().roomName.equals ("South Hall")
				|| super.playerHolder.getRoom().roomName.equals ("Forbidden Parking")
				|| super.playerHolder.getRoom().roomName.equals ("Lactation Lounge")
				) 
				){
			
			switch((String) getSkillChipReward()){
			case "Integrity":
				super.playerHolder.addIntegrity(1);
				break;
				
			case "Craft":
				super.playerHolder.addCraft(1);
				break;
				
			case "Learning":
				super.playerHolder.addLearn(1);
				break;
				
			default:
				
		
		}
			
			

			return true;
		}
		
		if((super.playerHolder.getRoom().roomName.equals ("ECS 302") 
				|| super.playerHolder.getRoom().roomName.equals ("Cecs Conference Room")
				|| super.playerHolder.getRoom().roomName.equals ("ECS 308")
				|| super.playerHolder.getRoom().roomName.equals ("Eat Club")
				|| super.playerHolder.getRoom().roomName.equals ("Computer Lab")
				|| super.playerHolder.getRoom().roomName.equals ("Room of Retirement")
				|| super.playerHolder.getRoom().roomName.equals ("Elevators")
				|| super.playerHolder.getRoom().roomName.equals ("North Hall")
				|| super.playerHolder.getRoom().roomName.equals ("South Hall")
				|| super.playerHolder.getRoom().roomName.equals ("Forbidden Parking")
				|| super.playerHolder.getRoom().roomName.equals ("Lactation Lounge")
				)){
			super.playerHolder.addQuality(-2);
		}
		
		
		
		
		
			return false;

	

	}
}
