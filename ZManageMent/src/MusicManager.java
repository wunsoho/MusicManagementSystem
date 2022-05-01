import java.util.ArrayList;
import java.util.Scanner;

import Music.BalladMusic;
import Music.Music;

public class MusicManager {
	ArrayList<Music> musics	 = new ArrayList<Music>();
	Scanner a;
	MusicManager(Scanner a){
		this.a = a;
	}
	
	public void addmusic() {
		int kind = 0;
		Music music;
		while (kind != 1 && kind != 2) {
			System.out.println("1 for Hiphop:");
			System.out.println("2 for Ballad");
			System.out.println("Select num for music kind between 1 and 2:");
			kind = a.nextInt();
			if(kind == 1) {
				music = new Music();
				music.getUserInput(a);
				musics.add(music);
				break;
			}
			else if (kind == 2) {
				music = new BalladMusic();
				music.getUserInput(a);
				musics.add(music);
				break;
			}
			else {
				System.out.print("Select num for music kind between 1 and 2:");
			}

			}
	}
	
	public void deletemusic() {
		System.out.println("musictitle");
		String musictitle = a.next();
		int index = -1;
		for(int i = 0; i<musics.size(); i++) {
			if (musics.get(i).getMusictitle() == musictitle) { 	
				index = i;
				break;	
			} 
		}
		
		if(index >= 0) {
			musics.remove(index);
			System.out.println("the music " + musictitle + "is deleted");
		}
		else {
			System.out.println("the music has not been registered");
			return;
		}
	}
	
	public void editmusic() {
		System.out.println("musictitle: ");
		String musictitle = a.next();
		for(int i = 0; i<musics.size(); i++) {
			Music music = musics.get(i);
			if (musics.get(i).getMusictitle() == musictitle) {
				int num = -1;
				while(num != 4) {
					System.out.println("---- your favorite music----");
					System.out.println("1. Add Music");
					System.out.println("2. Delete Music");
					System.out.println("3. Edit Music");
					System.out.println("4. View Music");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1 - 5: ");
					num = a.nextInt();

					if (num == 1) {
						System.out.print("musictitle :");
						String musictitle1 = a.next();
						music.setMusictitle(musictitle1);
					}
					else if (num == 2) {
						System.out.print("songwriter :");
						String songwriter = a.next();
						music.setSongwriter(songwriter);
					}	
					else if (num == 3) {
						System.out.print("musictime :");
						String musictime = a.next();
						music.setMusictime(musictime);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void viewmusics() {
//		System.out.println("musictitle");
//		String musictitle = a.next();
		for(int i = 0; i<musics.size(); i++) {
			musics.get(i).printInfo();
		}
	}
}
