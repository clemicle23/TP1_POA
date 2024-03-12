package Reflection;

import java.lang.reflect.*;

public class reflection {
    public static void main(String args[]){
        Object obj = new Example();
        Class classe = obj.getClass();
        System.out.println("Classe effective de obj : " + classe.toString());

        Method[] methods = classe.getDeclaredMethods();
        for (Method membre : methods){
            int accessibility = membre.getModifiers();
            Parameter[] parameters = membre.getParameters();
            int parameterCount = membre.getParameterCount();
            System.out.println("Nom de la fonction : " + membre.getName());
            System.out.println("Accessibilité : " + Modifier.toString(accessibility));
            System.out.println("Type de retour : " + membre.getReturnType());
            for (int i = 0; i < parameterCount; i++){
                System.out.println("Argument " + i + " : " + parameters[i].getType());
            }
            System.out.println("");
        }
    }
}