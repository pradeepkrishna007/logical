/**
 * 
 */

/**
 * @author PRADEEP KUMAR
 *
 */
public class ReturnCheckFromTryFinally {

	/**
	 * @param args
	 */
	public static Boolean methodCall(){
		try{
			return true;
		}finally{
			return false;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(methodCall());
	}

}
