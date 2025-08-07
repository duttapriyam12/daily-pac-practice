package coding_Practises;

public class TrappedRain_pac1 {
	public static int trappedRainWater(int height[]) {
		int n = height.length;
		//leftMax
		int leftmax[] = new int[n];
		leftmax[0]=height[0];
		for(int i=1;i<n;i++) {
			leftmax[i]=Math.max(height[i], leftmax[i-1]);
		}
		//RightMax
		int rightmax[] = new int[n];
		rightmax[n-1]=height[n-1];
		for(int i=n-2;i>0;i--){
			rightmax[i]=Math.max(height[i], rightmax[i+1]);
		}
		int trappedWater=0;
		for(int i=1;i<n;i++) {
			int Waterlevel= Math.min(leftmax[i], rightmax[i]);
			trappedWater+=Waterlevel-height[i];
		}
		return trappedWater;
		}
	public static void main(String args[]) {
		//int height[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		int height[]= {4,2,0,3,2,5};
		System.out.println(trappedRainWater(height));
		
	}

}
