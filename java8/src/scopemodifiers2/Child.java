package scopemodifiers2;

import scopeofmodifier.Parent;

public class Child extends Parent {
	public static void main(String[] args) {
		Parent p= new Parent();
//		p.m4(); not visible outside of the class.
//		p.m3(); default modifier scope is limited within the same package.
//		p.m2(); protected modifier scope is also outside of the package but you can access only with the
//		help of child class reference.(means here, this class should be the child of parent class)
		Child c=new Child();
		c.m2();
		p.m1(); //(public modifier scope = no restriction)
	}
}
