package pl.edu.pw.ii.jee.ppj;


public class MyComputerMouseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyComputerMouseWithRoll myMouse1;
		myMouse1 = new MyComputerMouseWithRoll();
		myMouse1.pushButton("prawy");
		myMouse1.pushButton("lewy");
		myMouse1.rollScroll();
		myMouse1.description();
		
		IMyComputerMouse myMouse2;
		myMouse2 = new MyComputerMouseWithRoll();
		myMouse2.pushButton("prawy");
		myMouse2.rollScroll();
		myMouse2.description();
	}

}
