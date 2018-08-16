package diamond;

public class DiamondWithName {

    int height;
    char character;
    String name;

    DiamondWithName(int height, char character, String name) {

        this.height = height;
        this.character = character;
        this.name = name;
    }

    void draw() {

        char space = ' ';
        for(int line=0; line < height-1; line++) {

            for(int spaces=0; spaces < height-line-1; spaces++)
                System.out.print(space);

            for(int characters = 0; characters < (2*line)+1; characters++)
                System.out.print(character);

            System.out.println();
        }

        System.out.println(name);

        for(int line = height-2; line >= 0; line--) {

            for(int spaces=0; spaces < height - line -1; spaces++)
                System.out.print(space);

            for(int characters = 0; characters < (2*line)+1; characters++)
                System.out.print(character);

            System.out.println();
        }
    }
}
