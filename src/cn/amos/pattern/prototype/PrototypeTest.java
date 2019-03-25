package cn.amos.pattern.prototype;

import java.io.IOException;
import java.util.Date;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		Monkey monkey = new Monkey(180.0, 100.0, new Date(), new JinGuBang(200.0, 36458.0));
		Monkey shallowClone = monkey.shallowClone();
		Monkey deepClone = monkey.deepClone();

		System.out.println(monkey==shallowClone);
		System.out.println(monkey==deepClone);
		System.out.println(shallowClone==deepClone);

		System.out.println("shallow:"+(shallowClone.getJinGuBang()==monkey.getJinGuBang()));
		System.out.println("deep:"+(deepClone.getJinGuBang()==monkey.getJinGuBang()));

	}

}
