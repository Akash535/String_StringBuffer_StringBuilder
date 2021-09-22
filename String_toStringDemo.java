package String;

class box{
	double width,length,depth;

	public box(double width, double length, double depth) {
		super();
		this.width = width;
		this.length = length;
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "[width=" + width + ", length=" + length + ", depth=" + depth + "]";
	}
	
}

public class String_toStringDemo {

	public static void main(String[] args) {
		box b=new box(11, 15, 21);
		String s="Dimensions = "+b;
		System.out.println(b);
		System.out.println(s);
	}

}

/*
 OutPut :
 
[width=11.0, length=15.0, depth=21.0]
Dimensions = [width=11.0, length=15.0, depth=21.0]

*/