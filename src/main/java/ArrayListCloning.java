
import java.util.Scanner;
import java.util.ArrayList;
//code accesses and prints all the elements of array list
public class ArrayListCloning {
    public static void main(String[] args){
        ArrayList<StringBuilder> list = new ArrayList<StringBuilder>();
        StringBuilder sb1 = new StringBuilder("Jan");
        StringBuilder sb2 = new StringBuilder("Feb");
        list.add(sb1);
        list.add(sb2);
        list.add(sb2);
        ArrayList<StringBuilder> assignedlist = list;
        ArrayList<StringBuilder> clonedlist = (ArrayList<StringBuilder>)list.clone();
            System.out.println(list == assignedlist);
            System.out.println(list == clonedlist);
            StringBuilder myarrayval = list.get(0);
            StringBuilder assignedarrval = assignedlist.get(0);
            StringBuilder clonearrayval = clonedlist.get(0);
        System.out.println(myarrayval == assignedarrval);
        System.out.println(myarrayval == clonearrayval);

        }

    }


