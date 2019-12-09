package Bai1;

public class MyChar implements CharSequence{
	private String content;
//	private 
	String dao() {
		StringBuilder str = new StringBuilder();
		for (int i = content.length()-1; i >=0 ; i--) {
			str.append(content.charAt(i));
		}
		return str.toString();
		
	}
	@Override
	public char charAt(int index) {
		return dao().charAt(index);
	}

	@Override
	public int length() {
		return dao().length();
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		StringBuilder str = new StringBuilder();
		for (int i = start; i < end ; i++) {
			str.append(dao().charAt(i));
		}
		return str.toString();
		
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
