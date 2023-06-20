using System;
using System.Collections.Generic;

public class Pizza
{
    public string Size { get; private set; }
    public string Crust { get; private set; }
    public string Cheese { get; private set; }
    public List<string> Toppings { get; private set; }

    private Pizza(PizzaBuilder builder)
    {
        Size = builder.Size;
        Crust = builder.Crust;
        Cheese = builder.Cheese;
        Toppings = builder.Toppings;
    }

    public class PizzaBuilder
    {
        public string Size { get; private set; }
        public string Crust { get; set; }
        public string Cheese { get; set; }
        public List<string> Toppings { get; private set; } = new List<string>();

        public PizzaBuilder(string size)
        {
            Size = size;
        }

        public PizzaBuilder SetCrust(string crust)
        {
            Crust = crust;
            return this;
        }

        public PizzaBuilder SetCheese(string cheese)
        {
            Cheese = cheese;
            return this;
        }

        public PizzaBuilder AddTopping(string topping)
        {
            Toppings.Add(topping);
            return this;
        }

        public Pizza Build()
        {
            return new Pizza(this);
        }
    }
}

class Program
{
    static void Main(string[] args)
    {
        var pizza = new Pizza.PizzaBuilder("Large")
            .SetCrust("Thin")
            .SetCheese("Mozzarella")
            .AddTopping("Pepperoni")
            .AddTopping("Mushrooms")
            .AddTopping("Onions")
            .Build();

        Console.WriteLine(pizza);
    }
}
