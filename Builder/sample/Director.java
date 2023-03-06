public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("一般的な挨拶");
        builder.makeItems(new String[] {
            "How are you?",
            "Hello.",
            "Hi.",
        });
        builder.makeString("時間帯に応じた挨拶");
        builder.makeItems(new String[] {
            "Good Morning.",
            "Good afternoon.",
            "Good evening",
        });
        builder.makeItems(new String[] {
            "name: Jinya Miyazaki",
            "email: sample@gmail.com",
        });
        builder.close();
    }
}
