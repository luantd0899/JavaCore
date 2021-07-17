/**
 * 
 */
package entity.ex3.question1;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * @author luant
 *
 */
public class CPU {
	double price ;
	
	public class Processor{
		double coreAmount;
		String  manufacture;
		
		public Processor()
		{
			
		}

		public double getCoreAmount() {
			return coreAmount;
		}

		public void setCoreAmount(double coreAmount) {
			this.coreAmount = coreAmount;
		}

		public String getManufacture() {
			return manufacture;
		}

		public void setManufacture(String manufacture) {
			this.manufacture = manufacture;
		}
		
		public float getCahe()
		{
			return 4.3f;
		}
		
	}
	
	public class Ram{
		int memory;
		String manufacture;
		
		
		public Ram() {
			super();
		}
		
		public float getClockSpeed()
		{
			return 5.5f;
		}
		
	}
}	
