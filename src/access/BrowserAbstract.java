package access;

public abstract class BrowserAbstract {

	public String name;
	public float version;
	
	public void display() {
		
	}
	
	public abstract void OpenBrowser();
	
	public abstract void CloseBrowser();
}
