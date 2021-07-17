/**
 * 
 */
package entity.ex1.question2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.sun.xml.internal.bind.v2.runtime.Name;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) {
		Stack<String> nameStack = new Stack<String>();
		nameStack.push("luan");
		nameStack.push("nam");
		nameStack.push("ha");
		nameStack.push("viet");
		lifo(nameStack);
		System.out.println("=====================");
		
		Queue<String> nameQueue = new LinkedList<String>();
		nameQueue.add("luan");
		nameQueue.add("nam");
		nameQueue.add("ha");
		nameQueue.add("viet");
		fifo(nameQueue);
		
		
	}
	
	public static void lifo(Stack<String > nameStack)
	{
		for (int i = nameStack.size(); i > 0; i--) {
			System.out.println(nameStack.pop());
		}
	}
	
	public static void fifo(Queue<String> nameQueue)
	{
		int  n = nameQueue.size();
		for (int i = 0; i <n; i++) {
			System.out.println(nameQueue.poll());
		}
	}
}
