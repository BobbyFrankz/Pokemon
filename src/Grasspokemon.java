public class Grasspokemon extends Pokemon{

    private boolean isPlant;
    private String roots;

    public Grasspokemon(String name, int level, int hp, String type, String sound, String food, boolean isPlant, String roots) {
        super(name, level, hp, type, sound, food);
        this.isPlant = isPlant;
        this.roots = roots;
    }
    @Override
    public void eats(){
        System.out.println(getName() + " eats " + getFood());

    }
    @Override
    public void speaks(){
        System.out.println(getName() + " Screams " + getSound());

    }
    public void leafStorm(){
        System.out.println(getName() + " Strikes a leaf Storm!");

    }
    public void leechSeed(){
        System.out.println(getName() + " Leeches a Seed!");

    }
    public void leafBlade(){
        System.out.println(getName() + " Strikes leaf Blade");

    }
    public void solarBeam(){
        System.out.println(getName() + " Strikes SolarBeam");

    }
}


