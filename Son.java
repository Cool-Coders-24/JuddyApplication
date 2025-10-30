class Father
{
	String property="100 acers";
	String collection="2 cars and 2 bikes";
	String shop="Vegetable shop";
}
class  Son extends Father
{
	//reused data
	//----property and collection
	//existing data modify
	String shop="Toy shop";
	//new data added
	String degree="Mtech";
	public static void main(String[] args) 
	{
		Son s = new Son();
		System.out.println(s.property);
		System.out.println(s.collection);
		System.out.println(s.shop);
		System.out.println(s.degree);
	}
}
