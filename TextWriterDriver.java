
public class TextWriterDriver {
    public static void main(String[] args) {
        TextWriter tw1;
        tw1 = new TextWriter();
        tw1.setTextToDisplay("This line is from my first Java object!");
        tw1.display();
        TextWriter tw2 = new TextWriter("And this line is from my second object.");
        System.out.println(tw2.getTextToDisplay());
        TextWriter tw3 = new TextWriter("This is the string I'll clear out later.");
        tw3.display();
        tw3.clearTextToDisplay();
        System.out.println("The next line is the display after calling clearTextToDisplay:");
        tw3.display();
        System.out.println("The previous line was the display after calling clearTextToDisplay:");
    }
}

