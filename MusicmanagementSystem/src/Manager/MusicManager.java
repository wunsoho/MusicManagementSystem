package Manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Music.BalladMusic;
import Music.HiphopMusic;
import Music.Music;
import Music.MusicInput;
import Music.MusicKind;
import Music.trotMusic;

public class MusicManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5927946064241119588L; // 느낌표를 지워주기 위해 ID를 생성함

	
	ArrayList<MusicInput> musics = new ArrayList<MusicInput>();
	transient Scanner a; // 스캐너를 저장하고 싶지 않다고 처리해줌
	MusicManager(Scanner a){
		this.a = a;
	}
	
	public void setScanner(Scanner a) {
		this.a = a;
	}
	
	public void addMusic(String title, String time, String writer) {
		MusicInput musicInput = new BalladMusic(MusicKind.Ballad);
		musicInput.getUserInput(a); 
		musics.add(musicInput);
	}
	
	public void addMusic(MusicInput musicInput) {
		musics.add(musicInput);
	}
	
	
	public void addmusic() {
		int kind = 0;
		MusicInput musicInput;
		while(kind < 1 || kind > 3) {
			try {
				System.out.println("go into add music in while");
				System.out.println("1 for trot");
				System.out.println("2 for Ballad");
				System.out.println("3 for Hiphop");
				System.out.println("Select num for music kind between 1 and 3:");
				kind = a.nextInt();
				if(kind == 1) {
					musicInput = new trotMusic(MusicKind.trot);
					musicInput.getUserInput(a);
					musics.add(musicInput);
					break;	
				}
				else if (kind == 2) {
					musicInput = new BalladMusic(MusicKind.Ballad);
					musicInput.getUserInput(a);
					musics.add(musicInput);
					break;
				}
				else if (kind == 3) {
					musicInput = new HiphopMusic(MusicKind.Hiphop);
					musicInput.getUserInput(a);
					musics.add(musicInput);
					break;
				}
				else {
					System.out.println("Select num for music kind between 1 and 2:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and  3!");
				if(a.hasNext()) {
					a.next();
				}
				kind = -1;
				
			}
		}
	}
	
	public void deletemusic() {
		System.out.println("musictitle");
		String musictitle = a.next();
		int index = findIndex(musictitle);
		removefromMusics(index, musictitle);
	}
	
	public int removefromMusics(int index, String musictitle) {
		if (index >= 0) {
			musics.remove(index);
			System.out.println("the music " + musictitle + "is deleted");
			return 1;
		}
		else {
			System.out.println("the music has not been registered");
			return -1;
		}
		 
	}
	
	public int findIndex(String muiscitle) {
		int index = -1;
		String musictitle = a.next();
		for(int i = 0; i<musics.size(); i++) {
			if (musics.get(i).getMusictitle() == musictitle) {
				index = i;
				break;
			}
		}
		return index;
		
	}
	
	public void editmusic() {
		System.out.println("musictitle: ");
		String musictitle = a.next();
		for(int i = 0; i<musics.size(); i++) {
			MusicInput music = musics.get(i);
			if(musics.get(i).getMusictitle() == musictitle) {
				int num = -1;
				while (num != 4) {
					showEditMenu();
					num = a.nextInt();
					switch(num) {
					case 1:
						music.setMusictitle(a); //music.을 찍어 Music에 있는 것을 가져오도록 함
						break;
					case 2:
						music.setSongwriter(a); //music.을 찍어 Music에 있는 것을 가져오도록 함
						break;
					case 3:
						music.setMusictime(a); //music.을 찍어 Music에 있는 것을 가져오도록 함
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
		
	}
	
	public void viewmusics() {
		for(int i =0; i<musics.size(); i++) {
			musics.get(i).printInfo();
		}
	}	
	
	public int size() {
		return musics.size();
	}
	
	public MusicInput get(int index) {
		return (Music) musics.get(index);
	}
	
	public void showEditMenu() {
		System.out.println("---- your favorite music----");
		System.out.println("1. Add Music");
		System.out.println("2. Delete Music");
		System.out.println("3. Edit Music");
		System.out.println("4. View Music");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5: ");
	} //showEditMenu 함수를 만들어 editmusic함수의 코드를 간단화 함

}
