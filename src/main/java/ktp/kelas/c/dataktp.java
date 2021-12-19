/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp.kelas.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Lenovo
 */
@Controller
public class dataktp {
  @RequestMapping("/dataktp")
    public String getTable(Model tiki){
        
        
        ArrayList<List<String>> data = new ArrayList();
        
        data.add(Arrays.asList("01", "ilham", "134528","jogja"));
        data.add(Arrays.asList("02", "ardy", "902356","sleman")); 
        data.add(Arrays.asList("03", "pratama","346790","jogja"));
        data.add(Arrays.asList("04", "sella", "130976","Jakarta"));   
        data.add(Arrays.asList("05", "putri", "435987","Bandung"));   
        data.add(Arrays.asList("06", "hanum", "340976","jogja"));
        data.add(Arrays.asList("07", "fadil", "350812","jogja"));
        data.add(Arrays.asList("08", "joko", "778243","bali"));
        data.add(Arrays.asList("09", "andre", "345200","jogja"));
        data.add(Arrays.asList("010", "simon", "678011","sleman"));
        data.add(Arrays.asList("011", "aji", "699032","jakarta"));
        data.add(Arrays.asList("012", "ojol", "653390","sleman"));
        data.add(Arrays.asList("013", "andri", "009854","bali"));
        data.add(Arrays.asList("014", "Amir", "975432","manado"));
        data.add(Arrays.asList("015", "udil", "963425","bali"));
        data.add(Arrays.asList("016", "Bowo", "653420","Bandung"));
        data.add(Arrays.asList("017", "saleh", "349887","riau"));
        data.add(Arrays.asList("018", "roger", "890778","jateng"));
        data.add(Arrays.asList("019", "miya", "774420","sleman"));
        data.add(Arrays.asList("020", "liliya", "334509","jogja"));
        tiki.addAttribute("table", data);
        
        return "table";
    }  
}
