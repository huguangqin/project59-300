//定义经理类,继承自员工类
public class Manager extends Employee{
	//属于经理的奖金属性
	private Double bonus;

	//奖金的getter/setter
	public Double getBonus(){
		return bonus;
	}
	public void setBonus(Double bonus){
		this.bonus = bonus;
	}
}