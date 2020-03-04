//Cole Constantino | Greatest contiguous sub-array of size K in an Array
import java.util.*;

public class SubArray{
  
  public int calculate(int[] arr, int k){
    int indexRange = arr.length - k;
    int count = 0;
    int num = 0;
    LinkedList<Integer> listOfChoices = new LinkedList<Integer>();
    
    for(int j = indexRange; j>=0; j--){
      int[] temp = new int[k];
      for(int i= 0; i<k; i++){
        temp[i] = arr[i+count];
      }
      StringBuilder sb = new StringBuilder();
      for(int x = 0; x <temp.length; x++){
        sb.append(temp[x]);
      }
      String tempString = sb.toString();
      int tempNum = Integer.parseInt(tempString);
      listOfChoices.add(tempNum);
      count++;
    }
    int number = 0;
    for(int q = 0; q<listOfChoices.size()-1; q++){
      if(listOfChoices.get(q)<listOfChoices.get(q+1))
        number = q+1;
    }
    int maxNumber = listOfChoices.get(number);
    return maxNumber;
  }
  
  public static void main(String[] args){
    SubArray sa = new SubArray();
    int[] array = {1,2,3,4,5,6};
    System.out.println(sa.calculate(array, 4));
  }
}