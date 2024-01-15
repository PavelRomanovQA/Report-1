public class Main {
    public static void main(String[] args) {
        FormDate date = new FormDate();
        date.day = 15;
        date.month =5;
        date.year = 1998;

        Post post = new Post();
        post.surname = "Guzhov";
        post.name = "Pavel";
        post.patronymic = "Sergeevich";
        post.birthday = date;
        post.subscription = true;
        post.passport = "0001 070809";
        post.phone = "+7 933 335-6969";
    }
}
