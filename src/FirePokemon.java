public class FirePokemon extends Pokemon{
    private int fireDegree;
    private int evolution;

    public FirePokemon(String name, int level, int hp, String type, String sound, String food, int fireDegree, int evolution) {
        super(name, level, hp, type, sound, food);
        this.fireDegree = fireDegree;
        this.evolution = evolution;
    }
    @Override
    public void eats(){
        System.out.println(getName() + " Says: Thats tasty! " + getFood());

    }
    @Override
    public void speaks(){
        System.out.println(getName() + " speaks " + getSound());

    }
    public void inferno(){
        System.out.println(getName() + " Uses Infernal Heat!");

    }
    public void pyroBall(){
        System.out.println(getName() + " Strikes an PyroBall!");

    }
    public void fireLash(){
        System.out.println(getName() + " Lashes Fire!");

    }
    public void flameThrower(){
        System.out.println(getName() + " Uses Flamethrower!!!");

    }

}
