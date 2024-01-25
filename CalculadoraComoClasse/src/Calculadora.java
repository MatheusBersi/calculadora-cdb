
public class Calculadora {	
	
	public double calcular(double v1, double v2, char op)
	{
		switch (op)
		{
		case '+': 
		return soma(v1, v2);
		
		case '-': 
		return sub(v1, v2);
		
		case '*': 
		return mult(v1, v2);
		
		case '/': 
		return div(v1, v2);		
		}

		return 0;		
	}
	
	private double soma(double v1, double v2)
	{
		return v1 + v2;
	}
	
	private double sub(double v1, double v2)
	{
		return v1 - v2;
	}
	
	private double mult(double v1, double v2)
	{
		return v1 * v2;
	}
	
	private double div(double v1, double v2)
	{
		return v1 / v2;
	}	

}
	