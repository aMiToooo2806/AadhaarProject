package AadhaarProject;

import java.util.HashMap;
import java.util.Map;

public class PanService {
    private static Map<String,Pan> panMap = new HashMap<>();
    static {
        panMap.put("cnjpn1234",new Pan("cnjpn1234","11223344554",
                "SBI Bank","Stocks"));
        panMap.put("cnjpn112233",new Pan("cnjpn112233","11223344556",
                "HDFC Bank","FD"));
    }
    public Pan getPanByAadhaarNumber(String aadhaarNumber)
    {
        for(Pan pan:panMap.values())
        {
            if(pan.getAadhaarNumber().equals(aadhaarNumber))
            {
                return pan;
            }
        }
        return null;
    }
}
