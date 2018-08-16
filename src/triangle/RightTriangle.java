package triangle;

public class RightTriangle {

    int height;
    char character;

    public RightTriangle(int height, char character) {
        this.height = height;
        this.character = character;
    }

    public void draw() {

        for(int i=0; i < height; i++) {
            for(int j=0; j < i+1; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
