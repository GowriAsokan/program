 abstract class GenericCalculator<T>
 	{
	 abstract public T add(T num1, T num2);
	 abstract public T subtract(T num1, T num2);
 	 abstract public T multiply(T num1, T num2);
	 abstract public T divide(T num1, T num2);
 	}


public class Calculator extends GenericCalculator<Number>
	{
		public Number add(Number num1, Number num2)
		{
			return(num1.doubleValue() + num2.doubleValue());
			
			
		}
		public Number subtract(Number num1, Number num2)
		{
			return(num1.doubleValue() - num2.doubleValue());
		}
		public Number multiply(Number num1, Number num2)
		{
			return(num1.doubleValue() * num2.doubleValue());
		}
		public Number divide(Number num1, Number num2)
	 	{
			return(num1.doubleValue() / num2.doubleValue());
	 	}
		
//		"/lsknfkcsd nkfncds kln"
	}
