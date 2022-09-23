public class Main {

    public static void main(String[] args) {

        //electric
    ElectricPokemon pikachu = new ElectricPokemon ("pikachu",15, 120,"electric","pika pika!","thunder cakes","yellow",18 );
        //fire
    FirePokemon  charmender = new FirePokemon("charmender",12,90,"fire","fire snips","coal",5,1);
        //grass
    Grasspokemon bulbasaur = new Grasspokemon("bulbasaur",4,60,"grass", "bulba bulba!","seeds",true,"jamaica");
        //water
    WaterPokemon squirtlle = new WaterPokemon("squirtlle", 8,70,"water","blub blub..","seaweed","a",80);
    WaterPokemon staryu = new WaterPokemon("staryu",14,95,"water", "Star Star!", "Starfish","a",70);
   squirtlle.hydroCanon();
        squirtlle.hydroPump();
        squirtlle.eats();
        squirtlle.getSound();

    }

}
