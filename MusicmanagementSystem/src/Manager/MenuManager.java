package Manager;

import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		MusicManager musicManager = new MusicManager(a);
		int num = -1;
		int exit = 0;
		while (num != 5) {
			System.out.println("---- your favorite music----");
			System.out.println("1. Add Music");
			System.out.println("2. Delete Music");
			System.out.println("3. Edit Music");
			System.out.println("4. View Music");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 - 5: ");
			num = a.nextInt();
			
			if (num == 1) {
				musicManager.addmusic();
			}
			else if (num == 2) {
				musicManager.deletemusic();
			}
			else if (num == 3) {
				musicManager.editmusic();
			}
			else if (num == 4) {
				musicManager.viewmusics();
			}
			else if (num == 5) {
				exit = -1;
				System.out.println("메뉴를 끝냅니다");
			}
			else {
				continue;
			}
		}
		
	}
	

}

