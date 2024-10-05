public class Zoo {
    String name,city;
    Animal[] animals;
    int nbCages;

    //public  static  final int nbCages=25;

    int nbAnimals;
    static int nbAnimalsTotal;

    public Zoo(String name,String city,int nbCages){
        this.nbCages=nbCages;
        animals =new Animal[nbCages];
        this.name=name;
        this.city=city;

    }
//hethaa ta madame ama mahebech yemchili fih mouchkla
//    public Zoo() {
//        animals =new Animal[nbCages];
//    }
//hetha taa el chat
    public Zoo() {
        this.nbCages = 10;  // Définir un nombre de cages par défaut
        animals = new Animal[nbCages];  // Initialisation du tableau d'animaux
        this.name = "Default Zoo";  // Optionnel : donner un nom par défaut
        this.city = "Default City";  // Optionnel : donner une ville par défaut
    }
    public void displayZoo(){
        System.out.println("Name : "+name);
        System.out.println("City : "+city);
        System.out.println("Nombre des cages : "+nbCages);

    }
    @Override
    public String toString(){
       String s= "Name : "+this.name+"\n" +"City : "
                +this.city+"\n"+"Nombre des cages :"+this.nbCages+"\n";
       String r="";
       for(int i=0;i<nbAnimals;i++){
           r+=animals[i]+"\n";
       }
       return s+r;
    }

    public  boolean addAnimal(Animal animal){
        if(nbAnimals<nbCages){
            animals[nbAnimals]=animal;
            nbAnimals++;
            return true;
        }
        return false;
    }
    public int searchAnimal(Animal animal){
        for(int i=0;i<nbAnimals;i++){
            if(animals[i].name==animal.name){
                return  i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        int indice=this.searchAnimal(animal);
        if(indice==-1){
            for(int i=indice;i<nbAnimals-1;i++){
                animals[i]=animals[i+1];

            }
            nbAnimals--;
            animals[nbAnimals-1]=null;
            return true;
        }
        return  false;

    }

    public static Zoo comparerZoo(Zoo z1,Zoo z2){
        if(z1.nbAnimals>z2.nbAnimals){
            return  z1;
        }
        return z2;
    }
    //methode 2 de comparaison
    public Zoo comparer (Zoo z2){
        if(this.nbAnimals>z2.nbAnimals){
            return  this;
        }
        return  z2;
    }
}
