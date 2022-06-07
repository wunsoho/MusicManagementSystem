package Music;

import java.util.Scanner;

import exception.TitleFormatException;

public interface MusicInput {
	
	public String getMusictitle();
	
	public void setMusictitle(String musictitle);
	
	public String getSongwriter();
	
	public void setSongwriter(String songwriter) throws TitleFormatException;
	
	public String getMusictime();
	
	public void setMusictime(String musictime);

	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setMusictitle(Scanner a); //���������� MusicInput�� �� ������
	
	public void setSongwriter(Scanner a);
	
	public void setMusictime(Scanner a);
}
