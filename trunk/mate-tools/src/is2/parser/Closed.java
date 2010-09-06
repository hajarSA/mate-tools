package is2.parser;

import is2.data.Parse;


final public class Closed  {

	public float p;
	short b,e,m;
	byte dir;
	
	Closed d;
	Open u;

	public Closed(short s, short t, int m, int dir,Open u, Closed d, float score) {
		this.b = s;
		this.e = t;
		this.m = (short)m;
		this.dir = (byte)dir;
		this.u=u;
		this.d =d;
		p=score;
	}


	public void createTree(Parse parse) {
		if (u != null) u.createTree(parse);
		if (d != null) d.createTree(parse);
	}
}


