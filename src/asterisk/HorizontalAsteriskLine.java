package asterisk;

public class HorizontalAsteriskLine {

    int lengthOfLine;
    char character;

    HorizontalAsteriskLine (int lengthOfLine, char character) {
        this.lengthOfLine = lengthOfLine;
        this.character = '*';
    }

    void draw() {

        for(int i=0; i < lengthOfLine; i++)
            System.out.print(character);
        System.out.println();
    }
}
