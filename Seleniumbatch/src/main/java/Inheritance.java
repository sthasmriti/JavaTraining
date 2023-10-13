public class Inheritance {
    public static void main(String[] args) {
        Father father = new Father();
        father.character();
        father.behaviour();
    }
}

class child{
    void character(){
        System.out.println("Child's character is different from father");
    }
}

class Father extends child{
    void behaviour(){
        System.out.println("Father's behaviour is different from child");
    }


    }

