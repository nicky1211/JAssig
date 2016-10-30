class staff {

	String code;
 	String name;
 
 	public staff(String c, String n) {
   		this.code = c;
   		this.name = n;
  	}

 	public void setCode(String c) {
 		this.code = c;
 	}
 

 	public String getCode() {
   		return this.code;
  	}
 	
 	public void setName(String n) {
 		this.name = n;
 	}
 
 	public String getName() {
  		return this.name;
 	}
}


class teacher extends staff {

 	private String subject;
 	private String publication;
 	String code;

 	public teacher(String c, String n) {
   		super(c, n);
  	}
 
 	public teacher(String c, String n, String sub, String pub) {
  		super(c, n);
  		this.subject = sub;
  		this.publication = pub;
 	}
 

 	public void setCode(String s) {
   		super.setCode(s);
  	}
  

 	public void setSubject(String s) {
  		this.subject = s;
 	}
 
 	public String[] getSubject() {
   		return this.subject;
  	}
  
 	public void setPublication(String p) {
  		this.publication = p;
 	}
 
 	public String getPublication() {
  		return this.publication;
 	}
}


class typist extends staff {
 	int speed;
 
 	public typist(String c, String n, int s) {
   		super(c, n);
   		this.speed = s;
  	}
 
 	public void setSpeed(int s) {
 		 this.speed = s;
 	}
 
 	public int getSpeed() {
  		return speed;
 	}
}



class officer extends staff {
	int grade;

 	public officer(String c, String n, int g) {
   		super(c, n);
   		this.grade = g;
  	}
  

 	public void setGrade(int g) {
  		this.grade = g;
 	}
 
 	public int getGrade() {
  		return this.grade;
 	}
}

class regular extends typist {

 	public regular(String c, String n, int s) {
 		super(c, n, s);
 	}
}



class casual extends typist {
	float dailywages;
 
 	public casual(String c, String n, int s, float w) {
   		this.super(c, n, s);
   		this.dailywages = w;
  }
  

 	public void setWages(float w) {
   		this.dailywages = w;
  }
  
 	public float getWages() {
  		return this.dailywages;
 	}
}