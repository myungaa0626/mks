package ex04_thread;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.util.Iterator;
import java.util.Random;
import javax.swing.JFrame;

public class GraphicThread 
				extends JFrame implements Runnable {
	int x , y , num;
	Color color;
	Random random;
	public GraphicThread(int num) {// 생성자함수 - 초기화
		this.num = num;
		color = Color.MAGENTA;
		random = new Random();
		setSize(500, 400);// 프레임 (화면) 크기 - 너비, 높이
		setVisible(true); // 화면 보여주기
		setLocation(300, 150); // 보여질 프레임(화면)의 위치 조정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기
	}
	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, 5, 5);
//		g.fillOval(x, y, 100, 100);
	}
	@Override
	public void run() {  // 스레드 실행부 (구현부)
		Rectangle rect = getBounds();
		for( int i = 0; i<num; i++) {
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);
			repaint();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
	} // end run()

	public static void main(String[] args) {
		//1.
//		GraphicThread gt = new GraphicThread(100);
//		Thread t1 = new Thread(gt);
//		t1.start();
		
		//2.
		new Thread(new GraphicThread(200)).start();
	}
}
