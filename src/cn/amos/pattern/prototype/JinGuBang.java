package cn.amos.pattern.prototype;

import java.io.Serializable;

public class JinGuBang implements Serializable {

	private double length;

	private double weight;

	@Override
	public String toString() {
		return "JinGuBang{" +
				"length=" + length +
				", weight=" + weight +
				'}';
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public JinGuBang(double length, double weight) {
		this.length = length;
		this.weight = weight;
	}
}
