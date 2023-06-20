// Prototype interface
interface UIElementPrototype {
    UIElementPrototype cloneElement();
}

// Concrete Prototype classes
class Button implements UIElementPrototype {
    private String text;
    private int width;
    private int height;

    public Button(String text, int width, int height) {
        this.text = text;
        this.width = width;
        this.height = height;
    }

    public UIElementPrototype cloneElement() {
        return new Button(this.text, this.width, this.height);
    }
}

class TextField implements UIElementPrototype {
    private String placeholder;
    private int width;
    private int height;

    public TextField(String placeholder, int width, int height) {
        this.placeholder = placeholder;
        this.width = width;
        this.height = height;
    }

    public UIElementPrototype cloneElement() {
        return new TextField(this.placeholder, this.width, this.height);
    }
}

public class GraphicDesignApp {
    public static void main(String[] args) {
        // Create an instance of Button
        Button button1 = new Button("Click me!", 100, 50);

        // Create a clone of the Button
        Button button2 = (Button) button1.cloneElement();

        // Create an instance of TextField
        TextField textField1 = new TextField("Enter text...", 200, 30);

        // Create a clone of the TextField
        TextField textField2 = (TextField) textField1.cloneElement();

        // Now button2 and textField2 are clones of button1 and textField1 respectively.
    }
}