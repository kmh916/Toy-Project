package pokemongame_;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.*;
public class Bgm {
	private String fileName;
	private Player bgm;
	
	public Bgm(String fileName) {
		this.fileName = fileName;
	}
	
	public void close() {
		if(bgm !=null)
			bgm.close();
	}
	
	public void play() {
		
		try {
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			bgm = new Player(bis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		new Thread() {
			public void run() {
				try {bgm.play();}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}.start();
		
	}
	
	
}
