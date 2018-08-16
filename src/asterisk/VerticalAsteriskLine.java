package asterisk;

public class VerticalAsteriskLine {

    int lengthOfLine;
    char character;

    public VerticalAsteriskLine (int lengthOfLine) {
        this.lengthOfLine = lengthOfLine;
        this.character = '*';
    }

    public void draw() {

        for(int i=0; i < lengthOfLine; i++)
            System.out.println(character);
        System.out.println();
    }
}
