package GUI;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class Example10 {
	public static void main(String[] args) {
		Frame f = new Frame("Gridlayout");
		f.setLayout(new GridLayout(3,3));
		f.setSize(300,300);
		f.setLocation(400, 300);
		for(int i = 1; i <= 9; i++) {
			Button btn = new Button("btn"+i);
			f.add(btn);
		}
		f.setVisible(true);
	}

}
