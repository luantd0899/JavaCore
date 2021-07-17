/**
 * 
 */
package entity.ex3.question4;

/**
 * @author luant
 *
 */
public class Arrayy <E> {
	int arrayInt[] = new int[3];
	float arrayFloat[] = new float[3];
	long arrayLong[] = new long[3];
	double arrayDouble[] = new double[3];
	
	public <E> void insert(E number)
	{
		arrayInt[0] = (int) number;
		
	}
}
