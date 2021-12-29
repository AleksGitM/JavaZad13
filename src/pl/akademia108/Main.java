package pl.akademia108;

public class Main {

    public static void main(String[] args) {
        Post post = new Post(3213, "lorem ipsum", true);

        Post post2 = new Post(3213, "lorem ipsum", true);

        post.printPost();
        if (post.equals(post2)){
            post2 = null;
        } else {
            post2.printPost();
        }
    }
}
