import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 
 */

/**
 * @author PRADEEP KUMAR Program to find the source and destination station
 *         inputs given in string format with delimiter as |.
 *
 */
public class FindSourceAndDestinationPoint {

	public static void main(String[] args) {
		String inputs = "2-3|4-5|3-4|6-7|5-6|1-2";
		String stationRange[] = inputs.split(Pattern.quote("|"));
		List<String> source = new ArrayList<>();
		List<String> destination = new ArrayList<>();

		for (int i = 0; i < stationRange.length; i++) {
			String tempHoldSourDest[] = stationRange[i].split(Pattern.quote("-"));
			source.add(tempHoldSourDest[0]);// adding sources 
			destination.add(tempHoldSourDest[1]);// adding destinations 
		} // created sources and destinations

		Iterator<String> itr = destination.iterator();
		while (itr.hasNext()) {
			String tempString = itr.next();
			if (source.contains(tempString)) {
				source.remove(tempString);
				itr.remove();
			}
		} // while closed
		
		/*Display the results*/
		System.out.println("Source :: " + source.get(0));
		System.out.println("Destination :: " + destination.get(0));
	}
}
