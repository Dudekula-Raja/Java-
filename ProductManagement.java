import java.util.*;
class Product{
	String name;
	double price;
	int rating;
	public Product(String name,Double price,int rating){
		this.name=name;
		this.price=price;
		this.rating=rating;
	}
	public String toString(){
		return "Name:"+name+",Price:"+price+",rating:"+rating;
	}
}
class ProductManagement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		Product[] pds=new Product[n];
		for(int i=0;i<n;i++){
			System.out.println("enter productName:");
			String s=sc.next();
			System.out.println("enter productPrice:");
			Double p=sc.nextDouble();
			System.out.println("enter productRating:");
			int r=sc.nextInt();
			pds[i]=new Product(s,p,r);
		}
		for(Product ps:pds){
			System.out.println(ps);
		}
		Product[] pa=pds.clone();
		Arrays.sort(pa,Comparator.comparing(r->r.price));
		System.out.println("Sorting the products by price in ascending order:");
		for(Product p1:pa){
			System.out.println(p1);
		}
		Product[] pb=pds.clone();
		Arrays.sort(pb,Comparator.comparing((Product m)->m.price).reversed());
		System.out.println("Sorting the products by price in decending order:");
		for(Product p2:pb){
			System.out.println(p2);
		}
	}
}
