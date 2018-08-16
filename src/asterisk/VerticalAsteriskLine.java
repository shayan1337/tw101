package asterisk;

public class VerticalAsteriskLine {

    int lengthOfLine;
    char character;

    VerticalAsteriskLine (int lengthOfLine, char character) {
        this.lengthOfLine = lengthOfLine;
        this.character = '*';
    }

    void draw() {

        for(int i=0; i < lengthOfLine; i++)
            System.out.println(character);
        System.out.println();
    }
}
