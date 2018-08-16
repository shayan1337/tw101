package asterisk;

public class HorizontalAsteriskLine {

    int lengthOfLine;
    char character;

    public HorizontalAsteriskLine (int lengthOfLine) {
        this.lengthOfLine = lengthOfLine;
        this.character = '*';
    }

    public void draw() {

        for(int i=0; i < lengthOfLine; i++)
            System.out.print(character);
        System.out.println();
    }
}
