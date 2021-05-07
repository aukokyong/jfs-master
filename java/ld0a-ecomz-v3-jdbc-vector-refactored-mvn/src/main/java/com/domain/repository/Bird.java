package com.domain.repository;


//Bird bird = new LivingBird();
// bird = new SingingBird();
//bird = new ToyDuck();
public abstract class Bird {
public abstract void fly();
public abstract void sound();
public abstract void breathe();
}

class LivingBird extends Bird{
	@Override
	public void fly() {
		System.out.println("Flies gracefully, but not too high");
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
	
}
class SingingBird extends Bird{
	@Override
	public void fly() {
		System.out.println("Flies gracefully, but not too high");
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
	
}

class ToyDuck extends Bird{
	@Override
	public void fly() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void breathe() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
	
}