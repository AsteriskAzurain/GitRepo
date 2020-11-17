package com.ishang;

public class Complex {

	private double real;
	private double ima;

	public Complex(double real, double ima) {
		this.real = real;
		this.ima = ima;
	}

	public Complex() {
	}

	public double getIma() {
		return ima;
	}

	public void setIma(double ima) {
		this.ima = ima;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public Complex add(Complex a) {
		//加
		return new Complex(this.real + a.real, this.ima + a.ima);
	}

	public Complex sub(Complex a) {
		//减
		return new Complex(this.real - a.real, this.ima - a.ima);
	}

	public Complex mul(Complex a) {
		//乘
		double x = this.real * a.real - this.ima * a.ima;
		double y = this.real * a.ima + this.ima * a.real;
		return new Complex(x, y);
	}

	public Complex div(Complex a) {
		//除
		double z = a.real * a.real + a.ima * a.ima;
		double x = (this.real * a.real + this.ima * a.ima) / z;
		double y = (this.ima * a.real - this.real * a.ima) / z;
		return new Complex(x, y);
	}

	public String info() {
		if (ima >= 0.0)
			return real + "+" + ima + "*i";
		else
			return real + "-" + (-ima) + "*i";
	}
}
