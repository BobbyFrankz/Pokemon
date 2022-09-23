public class ElectricPokemon extends Pokemon{

    private String lightningColor;
    private int ampere;

    public ElectricPokemon(String name, int level, int hp, String type, String sound, String food, String lightningColor, int ampere) {
        super(name, level, hp, type, sound, food);
        this.lightningColor = lightningColor;
        this.ampere = ampere;
    }
    @Override
    public void eats(){
        System.out.println(getName() + " eats " + getFood());

    }
    @Override
    public void speaks(){
        System.out.println(getName() + " Screams " + getSound());

    }
    public void thunderPunch(){
        System.out.println(getName() + " Strikes a thunder punch!");

    }
    public void electroBall(){
        System.out.println(getName() + " Strikes an electroball!");

    }
    public void thunder(){
        System.out.println(getName() + " Strikes Thunder");

    }
    public void voltTackle(){
        System.out.println(getName() + " Strikes Volt tackle!");

    }

}
