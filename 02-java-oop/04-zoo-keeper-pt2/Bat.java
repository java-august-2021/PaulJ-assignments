public class Bat extends Mammal {
    private int energyLevel = 300;

    public void displayEnergy() {
        System.out.println(energyLevel);
    }
    
    public void fly() {
        System.out.println("WEEEEEE!");
        energyLevel = energyLevel - 50;
        System.out.println(energyLevel);
    }

    public void flyManyTimes(int flight) {
        for (int i = 0; i < flight; i++) {
            this.fly();
        }
    }

    public void eatHumans() {
        System.out.println("so-well, nevermind");
        energyLevel = energyLevel + 25;
        System.out.println(energyLevel);
    }

    public void eatManyHumans(int humans) {
        for (int i= 0; i <humans; i++) {
            this.eatHumans();
        }
    }

    public void attackTown(){
        System.out.println("AHHHHHH!");
        energyLevel = energyLevel - 100;
        System.out.println(energyLevel);
    }

    public void attackManyTowns(int towns) {
        for (int i= 0; i <towns; i++) {
            this.attackTown();
        }
    }
}