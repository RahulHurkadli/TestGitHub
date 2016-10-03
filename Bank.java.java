package in.ac.kletech;

public interface BANK                                           //INTERFACE
{
   void deposite(double Amt);
   double withdraw(double Amt);
   void transfer(Account a,Account b,double dTransfer);
}

class Account
{ 
	int iAc;
	String sName;
	double dBal;
    public Account(int iAc,String sName,double dBal)
    {
    	super();
    	this.iAc=iAc;
    	this.sName=sName;
    	this.dBal=dBal;
    }
}

class SBI implements BANK
{
	Account a=new Account(1000,"ABC",10000);
	Account b=new Account(1000,"ABC",1000);

	public void deposite(double dAmt)
	{
		a.dBal+=dAmt;
		System.out.println("Balance after depositing\t"+dAmt+"="+a.dBal);
		
	}

	
	public double withdraw(double dAmt) 
	{
		a.dBal-=dAmt;
		System.out.println("Balance after Withdrawing\t"+dAmt+"="+a.dBal);
		return a.dBal;
	}


	public void transfer(Account a, Account b, double dTransfer) 
	{
		a.dBal-=dTransfer;
		b.dBal+=dTransfer;
		System.out.println("Balance after transfer\t"+dTransfer+"="+a.dBal);
	}
}



