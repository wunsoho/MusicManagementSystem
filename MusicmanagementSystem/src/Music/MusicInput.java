package Music;

import java.util.Scanner;

import exception.TitleFormatException;

public interface MusicInput {
	
	public String getMusictitle();
	
	public void setMusictitle(String musictitle);
	
	public void setSongwriter(String songwriter) throws TitleFormatException;
	
	public void setMusictime(String musictime);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setMusictitle(Scanner a); //마찬가지로 MusicInput을 다 지워줌
	
	public void setSongwriter(Scanner a);
	
	public void setMusictime(Scanner a);
}
