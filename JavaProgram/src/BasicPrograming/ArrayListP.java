package BasicPrograming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class ArrayListP {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(20);
		al.add(30);
//		System.out.println(al.size());
//		System.out.println(al.get(2));
//		System.out.println(al);
		al.forEach(x->{
			System.out.println(x);
		});
		
		Iterator<Integer> it = al.iterator();
		it.forEachRemaining(x->{
			System.out.println(x);
		});
//		
//		for(int i = 0;i<=al.size()-1;i++) {
//			System.out.println(al.get(i));
//		}
//		for(int i:al)
//			System.out.println(i);
		
//		Iterator it = al.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
		
//		Employee e1 = new Employee("Tom", 34, "dept1");
//		Employee e2 = new Employee("Rin", 33, "English");
//		Employee e3 = new Employee("pil", 39, "Math");
//		
//		ArrayList<Employee> list = new ArrayList<Employee>();
//		list.add(e1);
//		list.add(e2);
//		list.add(e3);
//		for (Employee emp: list) {
//			System.out.println(emp.name +" : "+emp.age +" "+emp.dept);
//		}
//		
//		list.set(0, e3);
//		System.out.println(list);
//		for (Employee emp: list) {
//			System.out.println(emp.name +" : "+emp.age +" "+emp.dept);
//		}
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		System.out.println(ll);
		ll.set(0, 0);
		System.out.println(ll);
		for(int i = 0;i<=ll.size()-1;i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("======================================");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
	}

}
