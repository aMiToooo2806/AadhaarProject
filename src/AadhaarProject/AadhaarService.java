package AadhaarProject;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService
{
    private static Map<String,Aadhaar> aadhaarMap=new HashMap<>();
    static {
        aadhaarMap.put("11223344554",new Aadhaar("11223344554","Amit","Mr Kalyan","Jalna"));
        aadhaarMap.put("11223344556",new Aadhaar("11223344556","Abhay","Kalyan","Jalna"));
    }
    public Aadhaar getAadhaarByNumber(String aadhaarNumber)
    {
        return aadhaarMap.get(aadhaarNumber);
    }
}
