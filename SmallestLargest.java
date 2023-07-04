
public class SmallestLargest
{
	public static void main(String[] args)
	{
		double cancel = 293;
		double smallest = 0;
		double largest = 1.0;
		double value = 0;
		boolean value2 = true;

		cancel = IO.readDouble();
		do{
			value = IO.readDouble();
			if(value == cancel && value2 == true){
				smallest = 0;
				largest = 0;
				break;
			}
			else if(value == cancel && value2 == false){
				break;
			}
			else if(value >= largest && value2 == false){
				largest = value;
			}
			else if(value <= smallest && value2 == false && value != cancel){
				smallest = value;
			}
			else if (value == 0){
				value2 = false;
			}
			else if(value2 == true){
				smallest = value;
				largest = value;
				value2 = false;
			} 
		}while(value != cancel);
		IO.outputDoubleAnswer(smallest);
		IO.outputDoubleAnswer(largest);
	}
}