public class WaterPokemon extends Pokemon{
    private String swimDivision;
    private int h20Worth;

    public WaterPokemon(String name, int level, int hp, String type, String sound, String food, String swimDivision, int h20Worth) {
        super(name, level, hp, type, sound, food);
        this.swimDivision = swimDivision;
        this.h20Worth = h20Worth;
    }
    @Override
    public void eats(){
        System.out.println(getName() + " eats " + getFood());

    }
    @Override
    public void speaks(){
        System.out.println(getName() + " Screams " + getSound());

    }
    public void surf(){
        System.out.println(getName() + " Uses Surf!");

    }
    public void hydroPump(){
        System.out.println(getName() + " Uses Hydropump. Pump it!");

    }
    public void hydroCanon(){
        System.out.println(getName() + " Uses Hydrocanon. Boom Baby");

    }
    public void rainDance(){
        System.out.println(getName() + " Uses Raindance. make it Rain!");

    }

}
