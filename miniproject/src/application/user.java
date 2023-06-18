//package application;
//
//public class user {
//	
//	private int id;
//	private String name;
//	private String type;
//	
//	public user (String name, int id, String type) {
//		this.id = id;
//		this.name = name;
//		this.type = type;
//	}
//	
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//	
//}




package application;

public class user {

 private String shop_id,product_type,shop_name,floor;

public user(String shop_id, String product_type, String shop_name, String floor) {
	
	this.shop_id = shop_id;
	this.product_type = product_type;
	this.shop_name = shop_name;
	this.floor = floor;
}

public String getShop_id() {
	return shop_id;
}

public void setShop_id(String shop_id) {
	this.shop_id = shop_id;
}

public String getProduct_type() {
	return product_type;
}

public void setProduct_type(String product_type) {
	this.product_type = product_type;
}

public String getShop_name() {
	return shop_name;
}

public void setShop_name(String shop_name) {
	this.shop_name = shop_name;
}

public String getFloor() {
	return floor;
}

public void setFloor(String floor) {
	this.floor = floor;
}

public static void add(user user) {
	// TODO Auto-generated method stub
	
}

//public Object shop_idProperty() {
//	// TODO Auto-generated method stub
//	return null;
//}
 
 
    
//    public table(String shop_id, String product_type, String shop_name, String floor) {
//	super();
//	this.shop_id = shop_id;
//	this.product_type = product_type;
//	this.shop_name = shop_name;
//	this.floor = floor;
//}


//	shops_data(String id, String name, String type)
//    {      
//       this.shop_id = new SimpleStringProperty(id);
//       this.shop_name = new SimpleStringProperty(name);
//       this.product_type =  new SimpleStringProperty(type);
//    
//    }
//    
//
//	public String getshop_id() {
//        return shop_id.get();
//    }
//
//    public void setshop_id(String id) {
//        this.shop_id.set(id);
//    }
//    
//   
//  
//    public String getshop_name() {
//        return shop_name.get();
//    }
//
//    public void setshop_name(String name) {
//        shop_name.set(name);
//    }
//     
//    
//    public String getproduct_type() {
//        return product_type.get();
//    }
//
//    public void setproduct_type(String type) {
//        product_type.set(type);
//    }


//	public Object IDProperty() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
    

