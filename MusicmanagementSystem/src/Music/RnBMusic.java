package Music;

import java.util.Scanner;

import exception.TitleFormatException;

public abstract class RnBMusic extends Music {
	
	public RnBMusic(MusicKind kind) {
		super(kind);
	}
	@Override
	public abstract void getUserInput(Scanner a);
	

	@Override
	public void printInfo() {
		String skind = getKindString();	
		System.out.println("kind:" + skind + " title:" + musictitle + "writer:" +  songwriter + "time:" + musictime);
	}
	
	public void setSongwriterwithYN(Scanner a) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("do you have a another writer (Y/N");
			answer = a.next().charAt(0);
			try {
				if(answer == 'y' || answer == 'Y') {
					System.out.println("another writer:");
					String writer = a.next();
					this.setSongwriter(writer);
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setSongwriter("");
					break;
				}
				else {
				} 
			}
			catch (TitleFormatException e) {
				System.out.println("Incorrect writer Format. put the writer that contains @");
			}
				
			}
		}
		
	}
