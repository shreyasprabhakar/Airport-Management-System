package application;

public class users {
    // String AN,Name,Contact_no,address,sbNo;
    private String emp_id,emp_name,emp_age,emp_job,emp_salary, employee_pwd;
    

public users(String emp_id, String emp_name, String emp_age, String emp_job, String emp_salary,
			String employee_pwd) {
		
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_age = emp_age;
		this.emp_job = emp_job;
		this.emp_salary = emp_salary;
		this.employee_pwd = employee_pwd;
	}



	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(String emp_age) {
		this.emp_age = emp_age;
	}

	public String getEmp_job() {
		return emp_job;
	}

	public void setEmp_job(String emp_job) {
		this.emp_job = emp_job;
	}
	
	public String getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(String emp_salary) {
		this.emp_salary = emp_salary;
	}

	public String getEmployee_pwd() {
		return employee_pwd;
	}


	public void setEmployee_pwd(String employee_pwd) {
		this.employee_pwd = employee_pwd;
	}

}

//    public table(String emp_id,String emp_name, String emp_age,
//    		String emp_job, String emp_salary, String employee_pwd) {
//		
//		this.emp_id = new SimpleStringProperty(emp_id);
//		this.emp_name = new SimpleStringProperty(emp_name);
//		this.emp_age = new SimpleStringProperty(emp_age);
//		this.emp_job = new SimpleStringProperty(emp_job);
//		this.emp_salary = new SimpleStringProperty(emp_salary);
//		this.employee_pwd = new SimpleStringProperty(employee_pwd);
//	}

    
    
//	public String getEmp_id() {
//		return emp_id;
//	}
//	
////	public SimpleStringProperty Emp_idProperty() {
////      return emp_id;
////  }
//
//	public void setEmp_id(String emp_id) {
//		this.emp_id = emp_id;
//	}
//
//	public SimpleStringProperty getEmp_name() {
//		return emp_name;
//	}
//
//	public void setEmp_name(SimpleStringProperty emp_name) {
//		this.emp_name = emp_name;
//	}
//
//	public SimpleStringProperty getEmp_age() {
//		return emp_age;
//	}
//
//	public void setEmp_age(SimpleStringProperty emp_age) {
//		this.emp_age = emp_age;
//	}
//
//	public SimpleStringProperty getEmp_job() {
//		return emp_job;
//	}
//
//	public void setEmp_job(SimpleStringProperty emp_job) {
//		this.emp_job = emp_job;
//	}
//
//	public SimpleStringProperty getEmp_salary() {
//		return emp_salary;
//	}
//
//	public void setEmp_salary(SimpleStringProperty emp_salary) {
//		this.emp_salary = emp_salary;
//	}
//
//	public SimpleStringProperty getEmployee_pwd() {
//		return employee_pwd;
//	}
//
//	public void setEmployee_pwd(SimpleStringProperty employee_pwd) {
//		this.employee_pwd = employee_pwd;
//	}
//    
//}   



    //----------------------------------------------------------------



//	public table(String AN, String name,
//                    String contact_no, String address,
//                    String sbNo) {
//        this.emp_id = new SimpleStringProperty(AN);
//        this.Name = new SimpleStringProperty(name);
//        this.Contact_no = new SimpleStringProperty(contact_no);
//        this.address = new SimpleStringProperty(address);
//        this.sbNo = new SimpleStringProperty(sbNo);
//        this.sbNo = new SimpleStringProperty(sbNo);
//    }

//    public String getAN() {
//        return AN.get();
//    }
//
//    public SimpleStringProperty ANProperty() {
//        return AN;
//    }
//
//    public void setAN(String AN) {
//        this.AN.set(AN);
//    }
//
//    public String getName() {
//        return Name.get();
//    }
//
//    public SimpleStringProperty nameProperty() {
//        return Name;
//    }
//
//    public void setName(String name) {
//        this.Name.set(name);
//    }
//
//    public String getContact_no() {
//        return Contact_no.get();
//    }
//
//    public SimpleStringProperty contact_noProperty() {
//        return Contact_no;
//    }
//
//    public void setContact_no(String contact_no) {
//        this.Contact_no.set(contact_no);
//    }
//
//    public String getAddress() {
//        return address.get();
//    }
//
//    public SimpleStringProperty addressProperty() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address.set(address);
//    }
//
//    public String getSbNo() {
//        return sbNo.get();
//    }
//
//    public SimpleStringProperty sbNoProperty() {
//        return sbNo;
//    }
//
//    public void setSbNo(String sbNo) {
//        this.sbNo.set(sbNo);
//    }
