package homework;

public class PhraseOMatic {
    public static void main(String[] args) {
        String [] zooAnimals = {"Lion","Tiger" ,"Jaguar","Hippo"," Giraffe","Turtle", "Llama" ,"Bear", "Cheetah","Zebra", "Owl"};
        String [] petAnimals = {"Dog","Cat","Rabbit", "Guinea pig", "Chinchilla" ,"Bird","Fish","Horse"};
        String [] extinctAnimals ={"Dinosaur", "Dodo", "Mammoth","Allasaurus","Spinosaurus","Velociraptor","Moa","Quagga","Mexican Grizzly Bear","Laughing Owl"};

        int oneLength = zooAnimals.length;
        int twoLength = petAnimals.length;
        int threeLength = extinctAnimals.length;

        int randomZoo = (int) (Math .random() * zooAnimals.length);
        int randomPet = (int) (Math .random() * petAnimals.length);
        int randomExtinct = (int) (Math .random() * extinctAnimals.length);

        String phrase = zooAnimals [randomZoo] + " " + petAnimals [randomPet] + " " + extinctAnimals [randomExtinct];
        System.out.println("You must research these animals " + phrase);

    }
}
