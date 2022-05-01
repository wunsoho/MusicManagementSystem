package Music;

import java.util.Scanner;

public class BalladMusic extends Music {
	
	public void getUserInput(Scanner a) {
		System.out.println("musictitle");
		String musictitle = a.next();
		this.setMusictitle(musictitle);
		
		System.out.println("songwriter");
		String songwriter = a.next();
		this.setSongwriter(songwriter);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("do you have a another writer (Y/N");
			answer = a.next().charAt(0);
			if(answer == 'y' ||	 answer == 'Y') {
				System.out.println("another writer:");
				String writer = a.next();
				this.setSongwriter(writer);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setSongwriter("");
				break;
			}
		
		System.out.println("musictime");
		String musictime = a.next();
		this.setMusictime(musictime);
	    }
	}
}

