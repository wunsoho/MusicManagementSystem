package Manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager{
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		
		Scanner a = new Scanner(System.in);
		MusicManager musicManager = getObject("musicmanager.ser");
		if(musicManager == null) {
			musicManager = new MusicManager(a); //musicManager가 널일 때 뉴 생성자를 하라고 처리해줌
		}
		
		WindowFrame frame = new WindowFrame(musicManager);
		selectMenu(a, musicManager);
		putObject(musicManager, "musicmanager.ser");
	}
	
	public static void selectMenu(Scanner a, MusicManager musicManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = a.nextInt();
				switch(num) { 
				case 1:
					musicManager.addmusic();
					logger.log("add a music");	
					break;
				case 2:
					musicManager.deletemusic();
					logger.log("delete a music");
					break;
				case 3:
					musicManager.editmusic();
					logger.log("edit a music");
					break;
				case 4:
					musicManager.viewmusics();
					logger.log("view a music");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) { 
				System.out.println("Please put an integer between 1 and 5!");
				if(a.hasNext()) {
					a.next();
				}
				num = -1;
			} //정수 이외를 넣었을 때 InputMismatchException 오류를 없애기 위해 try와 catch를 활용
		}
		
	}
	public static void showMenu() {
		System.out.println("---- your favorite music----");
		System.out.println("1. Add Music");
		System.out.println("2. Delete Music");
		System.out.println("3. Edit Music");
		System.out.println("4. View Music");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5: ");
	} //showMenu함수를 만들어 while문의 코드를 간단화함
	
	public static MusicManager getObject(String filename) {
		MusicManager musicManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			musicManager = (MusicManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return musicManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return musicManager; 
		
	}
	
	public static void putObject(MusicManager musicManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(musicManager); //저장 된 후 파일네임으로 출력
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}

