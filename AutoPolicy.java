//import java.util.Scanner;

public class AutoPolicy{
	
	
		private int accountNumber;
		private String MakeAndModel;
		private String State;
		
		public AutoPolicy(int accountNumber, String MakeAndModel, String State)
		{
			this. accountNumber = accountNumber ;
			this.MakeAndModel = MakeAndModel;
			this.State = State;
		}
		public void SetaccountNumber(int accountNumber)
		{
			this.accountNumber = accountNumber;
		}
		public int GetaccountNumber()
		{
			return accountNumber;
		}
		
			public void SetMakeAndModel(String MakeAndModel)
		{
			this.MakeAndModel = MakeAndModel;
		}
		public String GetMakeAndModel()
		{
			return MakeAndModel;
		}
         
			public void SetState(String State)
		{
			this.State = State;
		}
		public String GetState()
		{
			return State;
		}
	public boolean IsNoFault(){
	      
		boolean noFaultState;
		
		switch(GetState())
		{
			case "MA": 
			case "NJ": 
			case "NY": 
			case "PA": 
			noFaultState = true;
			break;
			default:
			noFaultState = false;
			break;
		}
		return noFaultState;
	}
	
	
	}

