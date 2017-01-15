package com.techwaly.point;

public class Point3D extends Point2D {
	private float z;

	public Point3D() {
		this.z = 0f;
	}

	public Point3D(float z) {
		this.z = z;
	}

	public float getZ() {
		return z;
	}

	public void setX(float z) {
		this.z = z;
	}

	public void setXYZ(float x, float y, float z) {
		this.z = z;
		super.setX(x);
		super.setY(y);
	}

	public float[] getXYZ() {
		float[] arr = new float[3];
		arr[0] = super.getX();
		arr[1] = super.getY();
		arr[2] = this.z;
		return arr;
	}

	public String toString() {
		return "MyPoint[(x,y,z)=(" + super.getX() + "," + super.getY() + "," + this.z + ")]";
	}

}
