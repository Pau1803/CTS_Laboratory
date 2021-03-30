package ro.ase.csie.cts.gr1094.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Tree3DModel {

	String color;
	int height;
	
	ArrayList<Integer> points;
	
	public Tree3DModel(String color, int height) {
		this.color=color;
		this.height=height;
		
		System.out.println("Loading the 3D model...");
		try {
			Thread.sleep(2000);
			Random random = new Random(1000);
			for(int i = 0; i<20;i++) 
				this.points.add(random.nextInt(100));
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
		System.out.println("MOdel loaded.");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Tree3DModel copy = new Tree3DModel(this.color, this.height);
		copy.color=this.color;
		copy.height=this.height;
		copy.points = (ArrayList<Integer>)this.points.clone();
		return copy();
	}

	private Object copy() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
