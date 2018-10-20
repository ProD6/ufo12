import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Ufo {
	/* UOFO 1 */
	 private int numOfSoldiers          = 30;
	 private int soldierLength          = 68;
	 private int newValue               = 160;
	 
	 private int timeUnits              = 42;
	 private int stamina                = 44;
	 private int health                 = 43;
	 private int reactions              = 45;
	 private int firing                 = 47;
	 private int throwing               = 48;
	 private int strength               = 46;
	 
	 private int psiStrength            = 50;
	 private int psiSkill               = 51;
	 /* UOFO 1 */
	
	/* UOFO 2
	private int numOfSoldiers          = 8;
	private int soldierLength          = 70;
	private int newValue               = 160;
	
	private int timeUnits              = 26;
	private int stamina                = 28;
	private int health                 = 27;
	private int reactions              = 69;
	private int firing                 = 33;
	private int throwing               = 29;
	private int strength               = 34;

	 private int psiStrength            = ???;
	 private int psiSkill               = ???;
/* UOFO 2 */
	
	public void nop() {
		this.searchAbilities();
		this.crack();
	}
	
	private void searchAbilities() {
		try {
			String             monoStr = new String();
			
			File               f       = new File("./data/soldier.dat");
			FileInputStream    fis     = new FileInputStream(f);
			InputStreamReader  isr     = new InputStreamReader(fis);
			BufferedReader     br      = new BufferedReader(isr);
			
			String             linea   = br.readLine();
			while(linea != null) {
				monoStr += linea;
				linea = br.readLine();
			}
			
			fis.close();
			
			System.out.println("Romano: "     + monoStr.indexOf("Romano"));
			System.out.println("Silvio: "     + monoStr.indexOf("Silvio"));
			System.out.println("Gianfranco: " + monoStr.indexOf("Gianfranco"));
			System.out.println("Piero: "      + monoStr.indexOf("Piero"));
			System.out.println();
			
			System.out.println("Time Units: " + monoStr.indexOf((char) 56));
			System.out.println("Time Units: " + monoStr.indexOf((char) 58));
			System.out.println();
			
			System.out.println("Stamina: " + monoStr.indexOf((char) 44));
			System.out.println("Stamina: " + monoStr.indexOf((char) 41));
			System.out.println();
			
			System.out.println("Health: " + monoStr.indexOf((char) 36));
			System.out.println("Health: " + monoStr.indexOf((char) 30));
			System.out.println();
			
			System.out.println("Bravery: " + monoStr.indexOf((char) 30));
			System.out.println("Bravery: " + monoStr.indexOf((char) 50));
			System.out.println();
			
			System.out.println("Reactions: " + monoStr.indexOf((char) 58));
			System.out.println("Reactions: " + monoStr.indexOf((char) 50));
			System.out.println();
			
			System.out.println("Firing: " + monoStr.indexOf((char) 48));
			System.out.println("Firing: " + monoStr.indexOf((char) 55));
			System.out.println();
			
			System.out.println("Throwing: " + monoStr.indexOf((char) 58));
			System.out.println("Throwing: " + monoStr.indexOf((char) 68));
			System.out.println();
			
			System.out.println("Strength: " + monoStr.indexOf((char) 39));
			System.out.println("Strength: " + monoStr.indexOf((char) 20));
			System.out.println();
			
			System.out.println("PSI strength: " + monoStr.indexOf((char) 53));
			System.out.println("PSI strength: " + monoStr.indexOf((char) 82));
			System.out.println();
			
			System.out.println("PSI skill: " + monoStr.indexOf((char) 22));
			System.out.println("PSI skill: " + monoStr.indexOf((char) 19));
			System.out.println();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void crack() {
		try {
			File               fIn     = new File("./data/soldier.dat");
			FileReader         fr      = new FileReader(fIn);
			char[]             out     = new char[(int) fIn.length()];
			for (int i = 0; i < fIn.length(); i++) out[i] = (char) fr.read();
			fr.close();
			
			for (int soldierI = 0; soldierI < this.numOfSoldiers; soldierI++) {
				out[this.soldierLength * soldierI + this.timeUnits]   = (char) this.newValue;
				out[this.soldierLength * soldierI + this.stamina]     = (char) this.newValue;
				out[this.soldierLength * soldierI + this.health]      = (char) this.newValue;
				out[this.soldierLength * soldierI + this.reactions]   = (char) this.newValue;
				out[this.soldierLength * soldierI + this.firing]      = (char) this.newValue;
				out[this.soldierLength * soldierI + this.throwing]    = (char) this.newValue;
				out[this.soldierLength * soldierI + this.strength]    = (char) this.newValue;

				out[this.soldierLength * soldierI + this.psiStrength] = (char) this.newValue;
				out[this.soldierLength * soldierI + this.psiSkill]    = (char) this.newValue;
			}
			
			File               fOut    = new File("./data/newSoldier.dat");
			
			FileWriter         fw      = new FileWriter(fOut);
			fw.write(out);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}