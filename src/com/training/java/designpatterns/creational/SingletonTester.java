package com.training.java.designpatterns.creational;

class ResourceManager {

    private static ResourceManager _resourceManager;
//    private static ResourceManager _resourceManager = new ResourceManager(); Early initialization

    private ResourceManager() {

    }

    public static ResourceManager getResourceManager(){
        // Lazy initialization
        if(_resourceManager == null) {
            return new ResourceManager();
        }
        return _resourceManager;
//        return new ResourceManager();
    }

}

class SingletonTester
{
    public static void main(String[] args) {

        ResourceManager resourceManager1 = ResourceManager.getResourceManager();

        ResourceManager resourceManager2 = ResourceManager.getResourceManager();

        // == or equals ?

        // check whether the objects are equal, it means check if they are having reference to same object. ==

        // we are not doing string equalsTo

        if(resourceManager1 == resourceManager2) {
            System.out.println(" They are equal");
            System.out.println(resourceManager1.hashCode());
            System.out.println(resourceManager2.hashCode());
        }


    }
}