import java.util.*;
class Demo{
   private int[] my_data;
   public Demo(int[] my_vals){
      my_data = new int[my_vals.length];
      for (int i = 0; i < my_data.length; i++){
         my_data[i] = my_vals[i];
      }
   }
   public void display_data(){
      System.out.println(Arrays.toString(my_data));
   }
}
public class Deep_Copying{
   public static void main(String[] args){
      int[] my_vals = {56, 89, 91};
      Demo my_inst = new Demo(my_vals);
      my_inst.display_data();
      my_vals[0] = 65;
      my_inst.display_data();
   }
}