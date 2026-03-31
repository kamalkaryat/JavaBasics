package core.scope_modifiers.primeNo;
public class CheckPrimeNo {
	/**
	 *	class CheckPrimeNo-----Default class not accessible in another
	 *                         class.
	 *	protected class CheckPrimeNo----Protected class not accessible
	 *                                  in another class.Gives error
	 */
	private int count;
	/**
	 * void PrimeNo_Check(int num)------Default method not accessible
	 *                             outside this class.
	 */
	public void PrimeNo_Check(int num) {
		count=0;
		for(int temNo=2; temNo<=num/2; temNo++) {
			if(num%temNo==0) {
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("Prime No");
		else
			System.out.println("Not Prime No");
	}
}
