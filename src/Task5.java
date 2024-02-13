
public class Task5 {
	public static void main(String[] args) {// ArrayIndexOutOFBoundsException//
		int[] nums = { 24, 6, 82, 95, 56 };
		System.out.println(nums[0]);
		try {
			System.out.println(nums[8]);
			System.out.println(nums[3]);

		} catch (ArrayIndexOutOfBoundsException f) {
			System.out.println(f);
		} finally {
			System.out.println(" code completed");
		}

	}
}
