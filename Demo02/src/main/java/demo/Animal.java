package demo;


public abstract class Animal implements Actions {
    protected int MAX_AGE = 5;
    protected int MIN_HEALTH_POINT = 0;

    public int healthPoint;
    public int happiness;
    public int satiety;
    public double age;
    public int purity;
    public boolean isItSick;

    public void check_stage() {
        try {
            if (this.healthPoint <= MIN_HEALTH_POINT) {
                throw new PetDiedException();
            }
            if (this.age<= MAX_AGE){
                throw new PetGrewUpException();
            }
        } catch (PetDiedException e) {
            System.out.println("Your pet is dead. Game over.");


        } catch (PetGrewUpException e) {
            System.out.println("Congratulations! Your pet has been grew up! \n Game over.");

        }
            if (this.healthPoint < 20) {
                System.out.println("I'm feeling badly, maybe I have a cold...");
                this.healthPoint -= 4; //decrease healthPoints because of illness
            }

        }


    public Animal() {
        healthPoint = 25;
        happiness = 5;
        satiety = 25;
        age = 0;
        purity = 0;
        isItSick = false;
    }

    @Override
    public void toFeed() {
        this.healthPoint += 2;
        this.happiness += 1;
        this.satiety += 10;
        this.age += 0.2;
        this.purity -= 2;
        this.check_stage(); //have to be static...

    }

    @Override
    public void toPlay() {

    }

    @Override
    public void toScold() {

    }

    @Override
    public void toStroke() {

    }

    @Override
    public void toWash() {

    }

    @Override
    public void toHeal() {

    }


}
