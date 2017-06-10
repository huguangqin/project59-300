//定义一个员工类
import java.util.Date;
public class Employee{
	//设置三个属性:姓名/工资/生日
	private String name;
	private Double salary;
	private Date birthday;

	//setter/getter
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setSalary(Double salary){
		this.salary = salary;
	}
	public Double getSalary(){
		return salary;
	}
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	public Date getBirthday(){
		return birthday;
	}
}