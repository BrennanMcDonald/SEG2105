// The Fibonacci numbers are generated by setting F0=0, F1=1, and then using the recursive formula
// F(n) = F(n-1) + F(n-2)


public class FibonacciSequence extends Sequence{
   private 

   int current_element, next_element;  // value of current element and the next element
   int F0, F1;
   
   public FibonacciSequence (int e1, int e2){
      F0 = current_element = e1;
      F1 = next_element = e2;
      indx = 0;
   }
   public FibonacciSequence(){
      F0 = current_element = 0;
      F1 = next_element = 1;
      indx = 0;
   }
   public int get_element(){
      return current_element;
   }
   private void reset(){   // reset the sequence to initial state
      current_element = F0;
      next_element = F1;
      indx = 0;
   }
   public int get_next_element(){
      int val = next_element;
      next_element = current_element + next_element;
      current_element = val;
      indx++;
      return val;
   }
   public int get_prev_element(){
      indx--;
      int prev_element = next_element - current_element;
      next_element = current_element;
      current_element = prev_element;
      return current_element;
   }
   public int get_element_by_index(int index){
        if (indx >= index) {
           index = Math.abs(index - indx);
           while (index-- > 0) this.get_prev_element();
       } else {
           index = Math.abs(index - indx);
           while (index-- > 0) this.get_next_element();
       }

       return this.get_element();
   }
   public int get_sum_of_elements(int start_index, int end_index){
      int sum = 0;
      get_element_by_index(start_index);
      for(int i = 0; i < end_index; i++){
         sum += current_element;
         get_next_element();
      }
      return sum;
   }
}
