package test.multithreading13.producerconsumerdemo;

public class Stock {

	long qtyProduced;
	long qtyConsumed;
	
	public Stock() {
		
	}
	
	public void produce(){
		qtyProduced++;
	}
	
	public void consume(){
		qtyConsumed++;
	}

	public long getQtyProduced() {
		return qtyProduced;
	}

	public long getQtyConsumed() {
		return qtyConsumed;
	}

	public long getStockSurplus(){
		return qtyProduced-qtyConsumed;
	}
}
