public class Gorilla extends Mammal {
    private int energyLevel = 100;

    public void displayEnergy() {
        System.out.println(energyLevel);
    }
    
    public void throwSomething() {
        System.out.println("The gorilla has thrown something!");
        energyLevel = energyLevel - 5;
        System.out.println(energyLevel);
    }

    public void throwManyItems(int items) {
        for (int i = 0; i < items; i++) {
            this.throwSomething();
        }
    }

    public void eatBananas() {
        System.out.println("The gorilla is happy!");
        energyLevel = energyLevel + 10;
        System.out.println(energyLevel);
    }

    public void eatManyBananas(int bananas) {
        for (int i= 0; i <bananas; i++) {
            this.eatBananas();
        }
    }

    public void climb(){
        System.out.println("The gorilla has climbed a tree!");
        energyLevel = energyLevel - 10;
        System.out.println(energyLevel);
    }

    public void climbManyTrees(int trees) {
        for (int i= 0; i <trees; i++) {
            this.climb();
        }
    }
}
