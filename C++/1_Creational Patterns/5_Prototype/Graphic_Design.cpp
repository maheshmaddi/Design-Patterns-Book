#include <iostream>
#include <vector>
#include <string>

class UIElementPrototype {
public:
    virtual UIElementPrototype* cloneElement() = 0; // pure virtual function
};

class Button : public UIElementPrototype {
    std::string text;
    int width;
    int height;
public:
    Button(std::string text, int width, int height) : text(text), width(width), height(height) {}
    Button(const Button& src) : text(src.text), width(src.width), height(src.height) {} // copy constructor
    Button* cloneElement() override { return new Button(*this); }
};

class TextField : public UIElementPrototype {
    std::string placeholder;
    int width;
    int height;
public:
    TextField(std::string placeholder, int width, int height) : placeholder(placeholder), width(width), height(height) {}
    TextField(const TextField& src) : placeholder(src.placeholder), width(src.width), height(src.height) {} // copy constructor
    TextField* cloneElement() override { return new TextField(*this); }
};

int main() {
    Button* button1 = new Button("Click me!", 100, 50);
    Button* button2 = button1->cloneElement();

    TextField* textField1 = new TextField("Enter text...", 200, 30);
    TextField* textField2 = textField1->cloneElement();

    delete button1;
    delete button2;
    delete textField1;
    delete textField2;

    return 0;
}
