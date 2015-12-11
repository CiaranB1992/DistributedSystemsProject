package ie.gmit.sw;

import java.util.HashMap;
import java.util.Map;

public class OutQueue {

	private static Map<Long, Object> outQueue = new HashMap<Long, Object>();

	public static void add(long jobNumber, Object object){
		outQueue.put(jobNumber, object);
	}

	public static void remove(long jobNumber){
		outQueue.remove(jobNumber);
	}
	
	public static boolean getJob(long job){
		return outQueue.keySet().contains(job);
	}

}
