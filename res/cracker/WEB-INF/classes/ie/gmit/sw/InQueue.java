package ie.gmit.sw;

import java.util.LinkedList;

public class InQueue{

	private static LinkedList<MessageRequest> inQueue = new LinkedList<MessageRequest>();

	public static void addLast(MessageRequest messageRequest) {
		inQueue.addLast(messageRequest);
	}

	public static MessageRequest getFirst() {
		return inQueue.getFirst();
	}

	public static void removeFirst() {
		inQueue.removeFirst();
	}

	public static void getSize(){
		System.out.println(inQueue.size());
	}

}
