import java.awt.*;
import javax.swing.JFrame;

public class Marko extends JFrame {
	public static void main(String[] args) {

		DisplayMode dm = new DisplayMode(800, 600, 16, DisplayMode.REFRESH_RATE_UNKNOWN);
		Marko b = new Marko();
		b.run(dm);

	}

	public void run(DisplayMode dm) {
		setBackground(Color.PINK);
		setForeground(Color.WHITE);
		setFont(new Font("Arial", Font.PLAIN, 24));

		Screen s = new Screen();

		try {
			s.setFullScreen(dm, this);
			try {
				Thread.sleep(5000);
			}catch (Exception ex){
				
			}
		}finally{
			s.restoreScreen();
		}
	}
	
	public void paint(Graphics g){
		g.drawString("This is gonna be awesome", 200, 200);
	}

	public static void threadTest() {
		Thread t1 = new Thread(new Apple("one"));
		Thread t2 = new Thread(new Apple("two"));
		Thread t3 = new Thread(new Apple("three"));

		t1.start();
		t2.start();
		t3.start();

	}
}
