package tn.esprit.gestionzoo.entities;

public class Animal  {
    private String family,name;
    private int age;
    private boolean isMammal;

    public Animal(){}
    public Animal(String family,String name,int age,boolean isMammal){

        this.family=family;
        //this.name=name;
        //this.age=age;
        setName(name);
        setAge(age);
        this.isMammal=isMammal;
    }
    @Override
    public String toString(){
        return "Family:"+family+"Age :"+age;
    }

    public void setAge (int age){
        if(age>=0){
            this.age=age;
        }else
            System.out.println("age doit etre positif");
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("name ne doit pas etre vide");
        }else{
            this.name=name;
        }
    }

    public String getName(){
        return this.name;
    }

   public boolean getMammal(){
        return this.isMammal;
   }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }


}
