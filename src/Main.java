import com.Features.Contollable;

import java.util.Stack;
import java.util.Vector;

class Page{
    int last = 0;

    Vector<String> pages = new Vector<>();
    Stack<String> story = new Stack<>();

    void add(String name){
        pages.add(name);
        last++;
    }

    void add_story(){
        story.push(pages.get(last - 1));
        last--;
        story.push(pages.get(last - 1));
        last--;
        story.push(pages.get(last - 1));
        last--;
    }

    void empty_story(){
        while(!story.empty()){
            System.out.println(story.pop());
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Page p = new Page();

        System.out.println("Pages:");
        p.add("Home");
        p.add("Products");
        p.add("Product Details");
        p.add("Cart");
        p.add("Checkout");

        for (String page : p.pages) {
            System.out.println(page);
        }

        System.out.println();

        p.add_story();

        System.out.println("Last Pages: ");
        p.empty_story();

    }
}