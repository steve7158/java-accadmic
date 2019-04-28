import java.awt.*;
class Main extends Frame{
	Main(){
		Button b=new Button("clik me");
		b.setBounds(30, 100, 80, 39);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String args[]){
		Main m=new Main();
	}
}

