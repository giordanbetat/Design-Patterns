
public class Salesman {
	
	private String name = "";
	private float totalSales = 0.0F;
	
	public Salesman(String name, float totalSales){
		this.name = name;
		this.totalSales = totalSales;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(float totalSales) {
		this.totalSales = totalSales;
	}
	
	public Memento createMemento() {
		Memento memento = new Memento(name, totalSales);
		return memento;
	}
	
	public void retoreMemeneto(Memento memento){
		this.name = memento.getName();
		this.totalSales = memento.getTotalSales();
	}

}