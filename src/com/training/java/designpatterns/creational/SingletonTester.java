package com.training.java.designpatterns.creational;

class ResourceManager
{
    private static ResourceManager _resource;
    //We make the constructor private to prevent the use of "new"
    private ResourceManager() { }

    public static ResourceManager getResource()
    {

        // Lazy initialization
        if (_resource == null)
        { _resource = new ResourceManager();
            System.out.println("New Resource selected for our team");
        }
        else
        {
            System.out.print("You already have a Resource for your team.");
            System.out.println("Send him for the toss.");
        }
        return _resource;

//        public static synchronized ResourceManager getResource()
//        {
//            //our code
//        }

//        class ResourceManager
//        {
//            //Early initialization
//            private static ResourceManager _resource = new ResourceManager();
//            //We make the constructor private to prevent the use of "new"
//            private ResourceManager() { }
//
//            // Global point of access //ResourceManager.getResource() is a public static //method
//            public static ResourceManager getResource()
//            {
//                return _resource;
//            }
//        }
    }
}
class SingletonTester
{
    public static void main(String[] args)
    {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a Resource for our team");
        ResourceManager c1 = ResourceManager.getResource();
        System.out.println("Trying to make another Resource for our team");
        ResourceManager c2 = ResourceManager.getResource();
        if (c1 == c2)
        {
            System.out.println("c1 and c2 are same instance");
        }
    }
}