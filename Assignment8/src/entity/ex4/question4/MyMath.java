/**
 * 
 */
package entity.ex4.question4;

/**
 * @author luant
 *
 */
public class MyMath<T extends Number> {
	
	public T sum(T a, T b)
	{
		Double d = a.doubleValue() + b.doubleValue();
		return (T) d;
		
	}
	
	public T sum(T a, T b, T c)
	{
		Double d = a.doubleValue() + b.doubleValue() +  c.doubleValue();
		return (T) d;
	}
	
	public T sum(T a, T b, T c, T d)
	{
		Double dd = a.doubleValue() + b.doubleValue() +  c.doubleValue() + d.doubleValue();
		return (T) dd;
	}
	
	public T subtraction(T a, T b)
	{
		Double d = a.doubleValue() - b.doubleValue();
		return (T) d;
		
	}
	

	public T soMu(T a, T b)
	{
		Double double1 = Math.pow(a.doubleValue(), b.doubleValue());
		return (T) double1;
	}
	
	
}