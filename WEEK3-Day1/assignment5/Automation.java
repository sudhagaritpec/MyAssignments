package week3.d1.assignment5;

public class Automation extends MultipleLanguage implements Language, TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation ac = new Automation();
		ac.Java();
		ac.Selenium();
		ac.python();
		ac.ruby();

	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium from Interface TestTool");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java from Interface Language");

	}

	@Override
	public void ruby() {
		System.out.println("Unimplemented menthod Ruby");

	}

}
