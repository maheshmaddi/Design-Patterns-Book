from abc import ABC, abstractmethod

class UIElementPrototype(ABC):
    @abstractmethod
    def clone_element(self):
        pass

class Button(UIElementPrototype):
    def __init__(self, text, width, height):
        self.text = text
        self.width = width
        self.height = height

    def clone_element(self):
        return Button(self.text, self.width, self.height)

class TextField(UIElementPrototype):
    def __init__(self, placeholder, width, height):
        self.placeholder = placeholder
        self.width = width
        self.height = height

    def clone_element(self):
        return TextField(self.placeholder, self.width, self.height)

if __name__ == "__main__":
    button1 = Button("Click me!", 100, 50)
    button2 = button1.clone_element()

    text_field1 = TextField("Enter text...", 200, 30)
    text_field2 = text_field1.clone_element()
