package coding_Practises;

public class TrappedRain {
   public static int trappedRainWater(int height[]) {
	   int n = height.length;
	   //LeftMax
	   int leftmax[] = new int [n];
	   leftmax [0] = height[0];
	   for(int i=1;i<n;i++) {
		   leftmax[i] = Math.max(height[i], leftmax[i-1]);
	   }
	   
	   //rightMax
	   
	   int rightmax[] = new int[n];
	   rightmax [n-1] = height[n-1];
	   for(int i = n-2; i>=0;i--) {
		   rightmax[i] = Math.max(height[i],rightmax[i+1]);
	   }
	   
	   //loop
	   int trappedWater =0;
	   for(int i=0;i<n;i++) {
		   int waterlevel = Math.min(leftmax[i], rightmax[i]);
		   trappedWater += waterlevel - height[i];
	   }
	return trappedWater;
	   
   }
   public static void main(String args[]) {
	   int height[]= {4,2,0,6,3,2,5};
	   System.out.println(trappedRainWater(height));
   }
   
   
}
