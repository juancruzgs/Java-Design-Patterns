package Image;

public class ProxyImage implements Image {

	RealImage realImage;
	String fileName;
	
	public ProxyImage(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null) {
			//Only load image from disk the first time
			realImage = new RealImage(fileName);
		}
		
		realImage.display();
	}
}
