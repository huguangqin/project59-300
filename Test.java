import java.util.Date;

public class Test{
	public static void main(String[] args){
		//实例化对象employee
		Employee em = new Employee();
		em.setName("zhangsan");
		em.setSalary(3400.56);
		em.setBirthday(new Date());

		//实例化对象manager
		Manager ma = new Manager();
		ma.setName("lisi");
		ma.setSalary(12345.00);
		ma.setBirthday(new Date());
		ma.setBonus(567890.99);

		//输出各自属性
		System.out.println("员工的姓名:"+em.getName());
		System.out.println("员工的薪资:"+em.getSalary());
		System.out.println("员工的生日:"+em.getBirthday());
		System.out.println("经理的姓名:"+ma.getName());
		System.out.println("经理的薪资:"+ma.getSalary());
		System.out.println("经理的生日:"+ma.getBirthday());
		System.out.println("经理的奖金:"+ma.getBonus());
		}
	
}