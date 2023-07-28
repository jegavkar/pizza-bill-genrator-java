package PizzaProject;
import java.util.Scanner;
public class Pizzabase
{
	  int a=300;
	  int b=400;
	  int AddExtraCheez=150;
	  int AddExtraPopins=100;
	  void extra()//String add)
    {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
    	if(i==1) 
    {
       System.out.println("YOUR CHOISE IS VEG==>"+this.a);
       System.out.println("you want to add extra cheeze or popins");
  	   System.out.println("ADD EXTRA CHEEZE==>"+AddExtraCheez);
  	   System.out.println("ADD  EXTRA POPINS==>"+AddExtraPopins);
         String add=sc.next();
    	switch(add)
    	{
    	case "cheeze":
    		System.out.println("EXTRA CHEEZE ADDED===>"+(this.a+this.AddExtraCheez));
    	break;
    	case "popins":
    		System.out.println("EXTRA POPINS ADDED===>"+(this.a+this.AddExtraPopins));
    	break;
    	case "onlycheeze":
    		System.out.println("EXTRA ONLYCHEEZE ADDED===>"+this.AddExtraCheez);
    	break;
    	case "onlypopins":
    		System.out.println("EXTRA ONLYPOPINS ADDED====>"+this.AddExtraPopins);
    	break;
    	case "cheeze&popins":
    		System.out.println("EXTRA CHEEZE&POPINS ADDED===>"+(this.AddExtraCheez+this.AddExtraPopins+this.a));
    	break;
    	default :
    		System.out.println("NOT ADDED");
    	}
    }
    	else if (i==2)
    	{
    		 System.out.println("YOUR CHOIS IS===>"+this.b);
    		 System.out.println("you want to add extra cheeze or popins");
    		 System.out.println("ADD EXTRA CHEEZE==>"+AddExtraCheez);
    		 System.out.println("ADD  EXTRA POPINS==>"+AddExtraPopins);
            String add=sc.next();
       	switch(add)
       	{
       	case "cheeze":
       		System.out.println("EXTRA CHEEZE ADDED===>"+(this.b+this.AddExtraCheez));
       	break;
       	case "popins":
       		System.out.println("EXTRA POPINS ADDED===>"+(this.b+this.AddExtraPopins));
       	break;
       	case "onlycheeze":
       		System.out.println("EXTRA ONLYCHEEZE ADDED===>"+this.AddExtraCheez);
       	break;
       	case "onlypopins":
       		System.out.println("EXTRA ONLYPOPINS ADDED====>"+this.AddExtraPopins);
       	break;
       	case "cheeze&popins":
       		System.out.println("EXTRA CHEEZE&POPINS ADDED===>"+(this.AddExtraCheez+this.AddExtraPopins+this.b));
       		break;
       	default :
       		System.out.println("NOT ADDED");
       	}
    	}
    }
	public static void main(String[] args) 
	{
		 System.out.println("Price of VegPizza is ===>300");
		 System.out.println("Price of NonVegPizza is ===>400");
		 System.out.println("ENTER A CHOISE FOR VEG CLICK 1 AND FOR NONVEG  CLICK 2 ===>");
		//	Scanner sc=new Scanner(System.in);
		Pizzabase obj=new Pizzabase();
		//obj.choise();
		obj.extra();
		}
	}
    
	
  