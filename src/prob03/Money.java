package prob03;

public class Money {

	private int amount;

	public Money(int amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
		
	}

	public Money add(Money money) {
		int result = this.amount + money.getAmount();

		Money newMoney = new Money(result);
		return newMoney;
	}

	public Money minus(Money money) {
		int result = this.amount - money.getAmount();

		Money newMoney = new Money(result);
		return newMoney;
	}

	public Money multiply(Money money) {
		int result = this.amount * money.getAmount();

		Money newMoney = new Money(result);
		return newMoney;
	}

	public Money devide(Money money) {
		int result = this.amount / money.getAmount();

		Money newMoney = new Money(result);
		return newMoney;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
