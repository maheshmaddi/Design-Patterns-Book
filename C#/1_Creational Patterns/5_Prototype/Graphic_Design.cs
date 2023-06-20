public interface IUIElementPrototype
{
    IUIElementPrototype CloneElement();
}

public class Button : IUIElementPrototype
{
    private string text;
    private int width;
    private int height;

    public Button(string text, int width, int height)
    {
        this.text = text;
        this.width = width;
        this.height = height;
    }

    public IUIElementPrototype CloneElement()
    {
        return new Button(this.text, this.width, this.height);
    }
}

public class TextField : IUIElementPrototype
{
    private string placeholder;
    private int width;
    private int height;

    public TextField(string placeholder, int width, int height)
    {
        this.placeholder = placeholder;
        this.width = width;
        this.height = height;
    }

    public IUIElementPrototype CloneElement()
    {
        return new TextField(this.placeholder, this.width, this.height);
    }
}

public class GraphicDesignApp
{
    public static void Main(string[] args)
    {
        Button button1 = new Button("Click me!", 100, 50);
        Button button2 = (Button)button1.CloneElement();

        TextField textField1 = new TextField("Enter text...", 200, 30);
        TextField textField2 = (TextField)textField1.CloneElement();
    }
}
