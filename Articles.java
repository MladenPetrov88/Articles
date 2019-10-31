import java.util.Scanner;

public class Articles {
    static  class Article {
        String title;
        String content;
        String authour;

        Article (String title, String content, String authour) {
            this.title = title;
            this.content = content;
            this.authour = authour;
        }

        public void edit (String newContent) {
            this.content = newContent;
        }

        public void changeAuthor(String newAuthor) {
            this.authour = newAuthor;
        }

        public void rename(String newTitle) {
            this.title = newTitle;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s",this.title ,this.content, this.authour);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleInfo = scanner.nextLine().split(", ");
        String title = articleInfo[0];
        String content = articleInfo[1];
        String author = articleInfo[2];

        Article article = new Article(title, content, author);

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String[] input = scanner.nextLine().split(": ");
            String command = input[0];
            switch (command) {
                case "Edit":
                    article.edit(input[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(input[1]);
                    break;
                case "Rename":
                    article.rename(input[1]);
                    break;
            }
        }
        System.out.println(article);
    }
}
