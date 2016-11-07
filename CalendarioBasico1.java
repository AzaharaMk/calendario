
/**
 * Write a description of class CalendarioBasico1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico1
{
    // instance variables - replace the example below with your own
    private int day;
    private int month;
    private int year;

    /**
     * Constructor for objects of class CalendarioBasico1
     */
    public CalendarioBasico1()
    {
        day = 1;
        month = 1;
        year = 1;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAnio)
    {
        day = nuevoDia;
        month = nuevoMes;
        year = nuevoAnio;
    }
    
    public void avanzarFecha()
    {
        day = day + 1;
        if (day == 31)
        {
            day = 1;
            month = month + 1;
            if (month == 13)
            {
                month = 1;
                year = year + 1;
            
                if ( year == 100)
                {
                    year = 1;
                }
           }
        }
    }
    
    public String obtenerFecha()
    {
        String textoDevolver;
        
        String viewDay;
        if (day < 10)
        {
            viewDay = "0" + day;
        }
        else
        {
            viewDay = day + "";
        }
        
        String viewMonth;
        if (month < 10)
        {
            viewMonth = "0" + month;
        }
        else
        {
            viewMonth = month + "";
        }
        
        String viewYear;
        if (year < 10)
        {
            viewYear = "0" + year;
        }
        else
        {
            viewYear = year + "";
        }
        textoDevolver =viewDay + "-" + viewMonth + "-" + viewYear;
        return textoDevolver;
        
    }
}
