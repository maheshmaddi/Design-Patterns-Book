class Pizza:
    class PizzaBuilder:
        def __init__(self, size):
            self.size = size
            self.crust = ""
            self.cheese = ""
            self.toppings = []

        def crust(self, crust):
            self.crust = crust
            return self

        def cheese(self, cheese):
            self.cheese = cheese
            return self

        def add_topping(self, topping):
            self.toppings.append(topping)
            return self

        def build(self):
            return Pizza(self)

    def __init__(self, builder):
        self.size = builder.size
        self.crust = builder.crust
        self.cheese = builder.cheese
        self.toppings = builder.toppings

    def __str__(self):
        return f"Pizza(size='{self.size}', crust='{self.crust}', cheese='{self.cheese}', toppings={self.toppings})"

if __name__ == "__main__":
    pizza = Pizza.PizzaBuilder("Large") \
        .crust("Thin") \
        .cheese("Mozzarella") \
        .add_topping("Pepperoni") \
        .add_topping("Mushrooms") \
        .add_topping("Onions") \
        .build()

    print(pizza)
