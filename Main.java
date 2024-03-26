////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//    }
//}
//
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Mallard-------------");
        MallardDuck mallard = new MallardDuck();
        mallard.quack();
        mallard.swim();
        mallard.display();
        mallard.fly();

        System.out.println("-----------RedHead-------------");
        MallardDuck redhead = new MallardDuck();
        redhead.quack();
        redhead.swim();
        redhead.display();
        redhead.fly();

        System.out.println("-----------Rubber-------------");
        RubberDuck rubber = new RubberDuck();
        rubber.quack();
        rubber.swim();
        rubber.display();
        rubber.fly();

        System.out.println("-----------Wooden-------------");
        WoodenDuck wood = new WoodenDuck();
        wood.quack();
        wood.swim();
        wood.display();
        wood.fly();
    }
}

