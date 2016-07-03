import java.util.*;
public class hashSet_example
{
    public static void main(String args[])
    {
        HashSet h = new HashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);  
        System.out.println(h.add("Z"));    // duplicates are not allowed hence gives false
        System.out.println(h);
    }
}