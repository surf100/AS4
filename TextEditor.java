public class TextEditor {
    private String text;

    public void type(String newText) {
        text = (text == null ? "" : text) + newText;
    }

    public String getText() {
        return text;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        text = memento.getState();
    }
}
