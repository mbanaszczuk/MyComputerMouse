package pl.edu.pw.ii.jee.ppj;

public class MyComputerMouseWithRoll extends AMyComputerMouse implements IMyComputerMouse {

	public String roll;

	public MyComputerMouseWithRoll() {
		// TODO Auto-generated constructor stub
		super();
		this.setHowManyButtons(0);
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	@Override
	public void pushButton(String button) {
		// TODO Auto-generated method stub
		setButton(button);
		System.out.println("Nacisn��e� " + getButton() + " przycisk.");
		setHowManyButtons(++this.howManyButtons);

	}

	@Override
	public void rollScroll() {
		// TODO Auto-generated method stub
		this.setRoll("k�eczko");
		System.out.println("Pokr�ci�e� " + this.getRoll());
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.print("Ilo�� przycisk�w " + getHowManyButtons());
		if (this.getRoll() != null)
			System.out.println(" i " + getRoll());
		else
			System.out.println("");
	}

	@Override
	protected void setHowManyButtons(int howManyButtons) {
		// TODO Auto-generated method stub
		this.howManyButtons = howManyButtons;
	}

	@Override
	protected void setButton(String button) {
		// TODO Auto-generated method stub
		this.button = button;
	}

}
