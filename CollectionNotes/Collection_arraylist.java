package CollectionNotes;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_arraylist {
    public static void main(String args[]){
        Collection<Integer> obj = new ArrayList<Integer>();
            obj.add(5);
            obj.add(6);
            obj.add(9);
            obj.add(1); 
            
                System.out.println(obj);
                for (Integer inte : obj) {
                    System.out.println(inte);
                }
    }
    }

