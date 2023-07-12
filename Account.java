class Account
{
	private int acc_No;
  	private String acc_Type;
  	private String open_date;
  	private int amount;
  	public Account(int acno,String actype,String od,int amt)
  	{
   		this.acc_No=acno;
   		this.acc_Type=actype;
   		this.open_date=od;
   		this.amount=amt;
  	}
  	public int getAccountNumber()
  	{
   		return acc_No;
  	}
  	public String getAccountType()
  	{
  		return acc_Type;
  	}
  	public String getOpeningDate()
  	{
   		return open_date;
   	}
  	public int getAmount()
  	{
   		return amount;
  	}
}
class Transaction
{
	private int trans_ID;
	private int acc_No;
	private String trans_Date;
	private String typeOf_Trans;
	private int amount;
	public Transaction(int tid,int acno;String td;String tot,int amt)
	{
		this.trans_ID = tid;
		this.acc_No = acno;
		this.trans_Date = td;
		this.typeOf_Trans = tot;
		this.amount = amt;
	}
	public int getTransactionID()
	{
		return trans_ID;
	}
	public int getAccountNumber()
	{
		return acc_No;
	}
	public String getTransactionDate()
	{
		return trans_Date;
	}
	public String getTransactionType()
	{
		return typeOf_Trans;
	}
	public int getAmount()
	{
		return amount;
	}
}
