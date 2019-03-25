package cn.amos.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Monkey implements Serializable,Cloneable {

	private double height;

	private double weight;

	private Date birth;

	private JinGuBang jinGuBang;


	public Monkey shallowClone() throws CloneNotSupportedException {
		return (Monkey) super.clone();
	}

	public Monkey deepClone() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bai);
		return (Monkey) ois.readObject();
	}

	@Override
	public String toString() {
		return "Monkey{" +
				"height=" + height +
				", weight=" + weight +
				", birth=" + birth +
				", jinGuBang=" + jinGuBang +
				'}';
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public JinGuBang getJinGuBang() {
		return jinGuBang;
	}

	public void setJinGuBang(JinGuBang jinGuBang) {
		this.jinGuBang = jinGuBang;
	}

	public Monkey(double height, double weight, Date birth, JinGuBang jinGuBang) {
		this.height = height;
		this.weight = weight;
		this.birth = birth;
		this.jinGuBang = jinGuBang;
	}
}
