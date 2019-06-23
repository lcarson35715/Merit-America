import java.util.ArrayList;

public class JavaPuzzle {
	public static void main(String[] args){
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
			arr1.add(3);
			arr1.add(5);
			arr1.add(1);
			arr1.add(2);
			arr1.add(7);
			arr1.add(9);
			arr1.add(8);
			arr1.add(13);
			arr1.add(25);
			arr1.add(32);

		
		System.out.println(arr1);
		int sum = 0;
		
		for(int i = 0; i < arr1.size(); i++){
			sum+=arr1.get(i);

				}
				System.out.println(sum);

		for(int i = 0; i < arr1.size(); i++){
			if(arr1.get(i) > 10){
				System.out.println(arr1.get(i));
			}
		}


	}

}

