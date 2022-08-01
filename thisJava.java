class thisJava{
    String name;
    String college;

    thisJava(){
        System.out.println("default called");
    }

    thisJava(String name, String college){
        this();
        this.name = name;
        this.college = college;
        System.out.println("name is "+this.name+ " college "+this.college);
    }

    void getName(String name){
        this.name = name;
    }

    void getCollege(String college, String name){
        this.getName(name);
        this.college = college;
        System.out.println("name is "+this.name+ " college "+this.college);

    }
    public static void main(String a[]) {
        thisJava thisj = new thisJava("name", "college");
        thisj.getCollege("College name", "Student name");
        
    }
}