public class phraseOmatic{
    public static void main(String[] args) {
        String[] wordListOne = {"24/7","Multi Tier","30,000.00","B to B","win win","front end","web based","tervasice","smart","six-sigma","dynamic"}; // end of word list one

        String[] wordListTwo = {"empowered","oriented","distributed","aligned","accelerated","leveraged"};

        String[] wordListThree = {"process","tipping","space","vision","portal","strategy","mission"};

        int oneLength = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        // generate random numbers

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        // build the phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // print it
        System.out.println("What we need is a " + phrase);
     } // end of main
} // end class