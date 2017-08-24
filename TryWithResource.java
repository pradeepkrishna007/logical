
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TryWithResource implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i;
	String j;

	public TryWithResource(int i, String j) {

		this.i = i;
		this.j = j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryWithResource tryWithResource = new TryWithResource(1,"Pradeep");
				try(FileOutputStream fos=new FileOutputStream(new File("F:\\ser.txt"));
						ObjectOutputStream oos=new ObjectOutputStream(fos)){
					oos.writeObject(tryWithResource);
					System.out.println("Written sucessfully");
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}

	}

}
