
package application;

public class shops_data {

 private String shop_id,product_type,shop_name,floor;

public shops_data(String shop_id, String product_type, String shop_name, String floor) {
	
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

public static void add(shops_data shops_data) {
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
    
