

public class FindingUniqueInArray {

	public static void main(String[] args) {
		String[] arry={"A","B","C","A","E","B","C","E","F"};
		String resut=null;
		for(int index=0;index<arry.length;index++){
			int flag=0;
			for (int i = 0; i < arry.length; i++) {
				if(arry[index].equals(arry[i])){
					flag++;

				}//if closed
			}//inner for closed
			if(flag==1){
				resut=arry[index];
				break;
			}
		}//outer for closed
		System.out.println(resut);	
	}
}
