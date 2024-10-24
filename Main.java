public class Main {
    public static void main(String[] args) {
        // Interpreter Pattern
        System.out.println("Interpreter Pattern");
        String expression = "5 + 2 - 3";
        int result = Interpreter.interpret(expression);
        System.out.println("Expression: " + expression);
        System.out.println("Result: " + result); // Output: 4

        // Memento Pattern
        System.out.println("\nMemento Pattern");
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.type("Hello, ");
        history.save(editor.save());

        editor.type("World!");
        System.out.println("Current text: " + editor.getText());
        history.save(editor.save());


        editor.restore(history.undo());
        System.out.println("After undo: " + editor.getText());


        editor.restore(history.undo());
        System.out.println("After second undo: " + editor.getText());

        // Observer Pattern
        System.out.println("\nObserver Pattern");
        NewsAgency agency = new NewsAgency();

        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");

        agency.addObserver(channel1);
        agency.addObserver(channel2);

        agency.setHeadline("Breaking News: Observer Pattern in Action!");
    }
}
