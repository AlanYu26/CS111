
public class Change
{
	
	public static void main(String[] args)
	{
		System.out.println("Enter total price:");
		double total = IO.readDouble();
		System.out.println("Enter payment:");
		double payment = IO.readDouble();
		change(total, payment);
	}
	public static void change(double saleTotal, double customerPayment)
	{
		int onethirty =0;
		int fiftyfive = 0;
		int twentyfive =0;
		int five =0;
		int one =0;
		int seventyfive =0;
		int thirty =0;
		double onecent = 0;
		double total = saleTotal;
		double payment = customerPayment;
		double change=0;
		
		if( payment >= total ){
		change = customerPayment - saleTotal;
		onethirty = (int)change/130;
		IO.outputIntAnswer(onethirty);

		change = change - (onethirty * 130);
		fiftyfive = (int)change/55;
		IO.outputIntAnswer(fiftyfive);

		change = change - (fiftyfive * 55);
		twentyfive = (int)change/25;
		IO.outputIntAnswer(twentyfive);

		change = change - (twentyfive * 25);
		five = (int)change/5;
		IO.outputIntAnswer(five);

		change = change - (five * 5);
		one = (int)change/1;
		IO.outputIntAnswer(one);

		change = change - (one * 1);
		seventyfive = (int)(change/(.75));
		IO.outputIntAnswer(seventyfive);

		change = change - (seventyfive * .75);
		thirty = (int)(change/(.3));
		IO.outputIntAnswer(thirty);

		change = change - (thirty * .30);
		onecent = (change/(.01));
		IO.outputIntAnswer((int)Math.round(onecent));
	}
	else {
		IO.reportBadInput();
		IO.outputIntAnswer(-1);
	}
}

}