package task3;

public class TextRunner {
    public static void main(String[] args) {
        Word word = new Word("quote");
        Text text = new Text(word);

        Word word1 = new Word("quote's");
        Word word2 = new Word("Les");
        Word word3 = new Word("Brawn");

        Phrase phrase = new Phrase();
        phrase.addValue(word1);
        phrase.addValue(word2);
        phrase.addValue(word3);

        text.addBody(phrase);

        System.out.println("Head: "+text.getHeader());
        System.out.println("Body: "+text.getBody());

    }
}