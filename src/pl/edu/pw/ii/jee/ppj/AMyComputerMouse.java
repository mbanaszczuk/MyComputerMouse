package pl.edu.pw.ii.jee.ppj;

public abstract class AMyComputerMouse {

	protected String button;
	protected int howManyButtons;

	public String getButton() {
		return button;
	}

	public int getHowManyButtons() {
		return this.howManyButtons;
	}

	protected abstract void setHowManyButtons(int howManyButtons);

	protected abstract void setButton(String button);

}
