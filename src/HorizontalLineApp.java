class HorizontalLine{

    int lengthOfLine;
    char character;

    HorizontalLine(int lengthOfLine, char character){
        this.lengthOfLine = lengthOfLine;
        this.character = character;
    }

    void draw(){

        for(int i=0; i<lengthOfLine; i++)
            System.out.print(character);
        System.out.println();
    }
}

class HorizontalLineApp{
    public static void main(String args[]){
        HorizontalLine horizontalLine = new HorizontalLine(8,'*');
        horizontalLine.draw();
    }
}