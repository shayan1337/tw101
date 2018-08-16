package diamond;

public class Diamond {

    int height;
    char character;

    public Diamond(int height, char character) {
        this.height = height;
        this.character = character;
    }

    public void draw() {
        char space = ' ';
        for(int line=0; line < height; line++) {

            for(int spaces=0; spaces < height-line-1; spaces++)
                System.out.print(space);

            for(int characters = 0; characters < (2*line)+1; characters++)
                System.out.print(character);

            System.out.println();
        }

        for(int line = height-2; line >= 0; line--) {

            for(int spaces=0; spaces < height - line -1; spaces++)
                System.out.print(space);

            for(int characters = 0; characters < (2*line)+1; characters++)
                System.out.print(character);

            System.out.println();
        }
    }
}
