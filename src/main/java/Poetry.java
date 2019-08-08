public class Poetry {

    String[] poetry = {"This is","the horse and the hound and the horn that belonged to","the farmer sowing his corn that kept","the rooster that crowed in the morn that woke","the priest all shaven and shorn that married","the man all tattered and torn that kissed","the maiden all forlorn that milked","that cow with the crumpled horn that tossed","the dog that worried","the cat that killed","the rat that ate","the malth that lay in","the house that Jack built"};
    int poetry_size;
    Poetry(){

        poetry_size = 12;
    }
    String reveal_for_day(int day)
    {
        String poetry_on_day = poetry[0] ;
        for(int i=poetry_size-day+1;i<=poetry_size;i++)
            poetry_on_day = poetry_on_day + " " + poetry[i];
        return poetry_on_day;

    }
    String unfold(String flag)
    {
        //String return_poetry = "";
        if (flag.contains("reveal"))
        {
            int day = Integer.parseInt(flag.split(" ")[1]);
            return reveal_for_day(day) ;
        }
        else if(flag.contains("recite"))
        {
            return reveal_for_day(12);
        }
        return  null;
    }
}
