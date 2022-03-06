public class AutoPolicyTest
{
	public static void main(String[] args)
	{
		AutoPolicy policy1= new AutoPolicy (1111111, "Toyota Camery" , "NJ");
		AutoPolicy policy2= new AutoPolicy(2222222, "fORD Fusion" , "ME");
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
	}
		
		
		
		public static void policyInNoFaultState(AutoPolicy policy)
		{
			System.out.println("the auto policy");
			
			System.out.printf("Account no %d%n name of car %s%n  state %s no fault state%n ", 
			policy.GetaccountNumber(), policy.GetMakeAndModel(), (policy.IsNoFault() ? "is" : "is not"));
			
		}
	
}