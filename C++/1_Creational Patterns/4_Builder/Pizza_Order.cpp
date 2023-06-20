#include <iostream>
#include <vector>
#include <string>

class Pizza {
public:
    class PizzaBuilder;

private:
    std::string size;
    std::string crust;
    std::string cheese;
    std::vector<std::string> toppings;

    Pizza(PizzaBuilder* builder);

public:
    class PizzaBuilder {
        friend class Pizza;
    private:
        std::string size;
        std::string crust;
        std::string cheese;
        std::vector<std::string> toppings;

    public:
        PizzaBuilder(std::string size): size(size) {}

        PizzaBuilder& crust(std::string crust) {
            this->crust = crust;
            return *this;
        }

        PizzaBuilder& cheese(std::string cheese) {
            this->cheese = cheese;
            return *this;
        }

        PizzaBuilder& addTopping(std::string topping) {
            this->toppings.push_back(topping);
            return *this;
        }

        Pizza* build() {
            return new Pizza(this);
        }
    };

    void print();
};

Pizza::Pizza(PizzaBuilder* builder): 
    size(builder->size), crust(builder->crust), cheese(builder->cheese), toppings(builder->toppings) {}

void Pizza::print() {
    std::cout << "Pizza of size " << size << ", crust " << crust << ", cheese " << cheese << " with toppings: ";
    for (std::string topping : toppings) {
        std::cout << topping << " ";
    }
    std::cout << "\n";
}

int main() {
    Pizza::PizzaBuilder builder("Large");
    Pizza* pizza = builder.crust("Thin")
        .cheese("Mozzarella")
        .addTopping("Pepperoni")
        .addTopping("Mushrooms")
        .addTopping("Onions")
        .build();

    pizza->print();
    delete pizza;
}
