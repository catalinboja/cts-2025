package ro.ase.csie.cts.groups.composite;

public class TestComposite {

	public static void main(String[] args) {

		AbstractGroupNode group = new Group();
		AbstractGroupNode npc1 = new NPC("Hero 1", "blue");
		AbstractGroupNode npc2 = new NPC("Hero 2", "red");
		
		group.addNode(npc2);
		group.addNode(npc1);
		
		AbstractGroupNode newGroup = new Group();
		
		group.addNode(newGroup);
		
		newGroup.addNode(new NPC("Hero 3", "green"));
		
		group.move(20);
	}

}
