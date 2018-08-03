class VerticalLine{

    int lengthOfLine;
    char character;

    VerticalLine(int lengthOfLine, char character){
        this.lengthOfLine = lengthOfLine;
        this.character = character;
    }

    void draw(){

        for(int i=0; i<lengthOfLine; i++)
            System.out.println(character);
    }
}


class VerticalLineApp{
    public static void main(String args[]){
        VerticalLine verticalLine = new VerticalLine(8,'*');
        verticalLine.draw();
    }
}