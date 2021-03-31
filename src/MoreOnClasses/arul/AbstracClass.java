package MoreOnClasses.arul;

public class AbstracClass {
    abstract class Animal {

        public int age;

        public int printAge() {
            return 0;
        }

    }

    class Dog extends Animal
    {
        public int printAge()
        {
            return age;
        }
    }
}
