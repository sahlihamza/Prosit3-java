public class ZooManagement {
    public static void main(String[] args) {
        //  Scanner sc = new Scanner(System.in);
        // System.out.println("Merci de saisir le nbr des cages");
        // int nbrCages = sc.nextInt();
        //System.out.println("Merci de saisir le nom ");
        // String name= sc.next();
        // System.out.println(name+" comporte "+nbrCages+" cages");

        Animal lion = new Animal();
        lion.isMammal=true;
        lion.age=3;
        Zoo myZoo = new Zoo();
        myZoo.city="bardo";
        myZoo.name="zoo";
        myZoo.nbCages=30;
        Animal dog = new Animal("chien","bobo",3,true);
        Animal chat = new Animal("siamoi","chat",5,true);
        //  myZoo.displayZoo();
        System.out.println(dog);
        System.out.println(myZoo.toString());
        Zoo z=new Zoo("zoo","ariana",50);

        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog);
        System.out.println( myZoo.addAnimal(dog));
        System.out.println( myZoo.addAnimal(lion));
        System.out.println("------------");
        System.out.println("myZoo"+myZoo);
        System.out.println("------------");
        System.out.println("myZoo"+z);
        System.out.println(myZoo.searchAnimal(dog));

        System.out.println(myZoo.nbAnimalsTotal);
        System.out.println(z.comparer(myZoo));
        System.out.println(Zoo.comparerZoo(z,myZoo));







    }
}

