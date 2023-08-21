class SuperMarket{

	static String chocolates[]={"5Star","Cadberry","DiaryMilk","Kitkat","Campco","Parle","Amul","Lotus","Mars","Snickers","Milkyway","Tobleerone","perk","Marvles","Gems","TicTak"};
	static String biscuits[]={"Chocolate Chip Cookie","Oatmeal Raisin Cookie","Shortbread","Digestive Biscuit","Cream Cracker","Ginger Snap","Butter Biscuit","Almond Biscotti","Coconut Macaroon","Lemon Thins","Cheddar Biscuit","Anzac Biscuit","Vienna Finger","Hobnob","Gingersnap","Cinnamon Crisp","Marie Biscuit","Nilla Wafers","Oreo","Bourbon Biscuit"};
    static String soaps[]={"Lavender Bliss","Citrus Burst","Rose Petal Delight","Ocean Breeze","Coconut Dream","Honey Almond Harmony","Minty Fresh Revive","Aloe Vera Soothe","Oatmeal Calm","Eucalyptus Elixir","Chamomile Serenity","Vanilla Velvet","Tea Tree Purify","Lemongrass Zest","Cocoa Butter Comfort","Jasmine Radiance","Green Tea Rejuvenation","Shea Butter Softness","Cucumber Melon Splash","Pomegranate Passion"};
	static String vegetables[]={"Carrot","Broccoli","Spinach","Tomato","Bell Pepper","Cucumber","Zucchini","Eggplant","Potato","Sweet Potato","Cauliflower","Brussels Sprouts","Asparagus","Kale","Mushroom","Green Bean","Peas","Cabbage","Lettuce","Radish"};
	static String perfumes[]={"Eternal Elegance","Mystic Moonlight","Enchanted Garden","Velvet Whispers","Radiant Blossoms","Golden Serenity","Sapphire Dreams","Amber Embrace","Midnight Spell","Diamond Aura","Opulent Orchid","Champagne Sparkle","Azure Horizon","Pearlescent Delight","Crimson Passion","Silken Sands","Emerald Enchantment","Velour Velvet","Cedarwood Charisma","Rose Velvetine"};
	static String friuts[]={"Apple","Banana","Orange","Grapes","Strawberry","Watermelon","Mango","Pineapple","Kiwi","Pear","Peach","Cherry","Blueberry","Raspberry","Plum","Apricot","Blackberry","Cantaloupe","Fig","Pomegranate"};
	static String grocery[]={"Flour","Sugar","Salt","Pepper","Olive Oil","Vinegar","Spaghetti","Canned Beans","Rice","Cereal","Pasta Sauce","Peanut Butter","Jam","Tea Bags","Coffee","Baking Powder","Baking Soda","Canned Tuna","Frozen Vegetables","Bottled Water"};
	static String faceCreams[]={"Hydrating Glow","Radiance Revive","Youthful Essence","Vitamin C Boost","Hyaluronic Harmony","Aloe Vera Soothe","Age-Defying Elixir","Collagen Infusion","Retinol Renew","Rosehip Rejuvenation","Cucumber Freshness","Nourishing Night","Brightening Briliance","Gentle Calm","Balancing Act","Matte Magic","Silky Smoothness","Protective Shield","Energizing Elegance","Natural Radiant"};
	static String dairy[]={"Butter","Cheese","Yogurt","Ice cream","Wipped icecream","Feta","Ghee","Softcheese","Custard","Kefir","Sourcream","Roquefort","Camembert","Swiss cheese","Brie"};
	static String snacks[]={"Potato Chips","Popcorn","Pretzels","Trail Mix","Granola Bars","Cheese Crackers","Mixed Nuts","Fruit Chips","Chocolate-covered Almonds","Rice Cakes","Dried Fruit","Vegetable Sticks","Peanut Butter Cups","Yogurt-covered Raisins","Caramel Corn","Fruit Leather","Protein Bars","Crispy Seaweed","Roasted Chickpeas","Mini Sandwiches"};
	public static void main(String sanjay[]){
	System.out.println("Main Started: ");
	getSoaps(soaps);
	getChocolates(chocolates);
	getBiscuits(biscuits);
	getVegetables(vegetables);
	getFriuts(friuts);
	getPerfumes(perfumes);
	getGrocery(grocery);
	getFaceCreams(faceCreams);
	getDairy(dairy);
	getSnacks(snacks);
	System.out.println("Mains Ended:");
	
	}
public static void getSoaps(String[] soaps){
	
	System.out.println("The available Soaps are:");
		
		for (int count=0;count<soaps.length;count++){
		System.out.println("			"+count+":"+soaps[count]);
		}
	System.out.println("---------------------------------------------");
	}

public static void getBiscuits(String[] biscuits){
	
	System.out.println("The available Biscuits are:");
		
		for (int count=0;count<biscuits.length;count++){
		System.out.println("			"+count+":"+biscuits[count]);
		}
	System.out.println("---------------------------------------------");
	}

public static void getChocolates(String[] chocolates){
	
	System.out.println("The available Chocolates are:");
		
		for (int count=0;count<chocolates.length;count++){
		System.out.println("			"+count+":"+chocolates[count]);
		}
	System.out.println("---------------------------------------------");
	}


public static void getDairy(String[] dairy){
	
	System.out.println("The available Dairy products are:");
		
		for (int count=0;count<dairy.length;count++){
		System.out.println("			"+count+":"+dairy[count]);
		}
	System.out.println("---------------------------------------------");
	}


public static void getPerfumes(String[] perfumes){
	
	System.out.println("The available Perfumes are:");
		
		for (int count=0;count<perfumes.length;count++){
		System.out.println("			"+count+":"+perfumes[count]);
		}
	System.out.println("---------------------------------------------");
	}


public static void getFaceCreams(String[] faceCreams){
	
	System.out.println("The available Face creams are:");
		
		for (int count=0;count<faceCreams.length;count++){
		System.out.println("			"+count+":"+faceCreams[count]);
		}
	System.out.println("---------------------------------------------");
	}


public static void getVegetables(String[] vegetables){
	
	System.out.println("The available Vegetables are:");
		
		for (int count=0;count<vegetables.length;count++){
		System.out.println("			"+count+":"+vegetables[count]);
		}
	System.out.println("---------------------------------------------");
	}

public static void getFriuts(String[] friuts){
	
	System.out.println("The available Fruits are:");
		
		for (int count=0;count<friuts.length;count++){
		System.out.println("			"+count+":"+friuts[count]);
		}
	System.out.println("---------------------------------------------");
	}


public static void getSnacks(String[] snacks){
	
	System.out.println("The available Snacks are:");
		
		for (int count=0;count<snacks.length;count++){
		System.out.println("			"+count+":"+snacks[count]);
		}
	System.out.println("---------------------------------------------");
	}


public static void getGrocery(String[] grocery){
	
	System.out.println("The available Grocery are:");
		
		for (int count=0;count<grocery.length;count++){
		System.out.println("			"+count+":"+grocery[count]);
		}
	System.out.println("---------------------------------------------");
	}


}