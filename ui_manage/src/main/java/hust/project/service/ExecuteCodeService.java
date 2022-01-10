package hust.project.service;

import org.springframework.stereotype.Service;
import hust.project.repo.*;

@Service
public class ExecuteCodeService {
    public String execute(int week, int id, String input){

        if ( week == 1 ){
            switch(id){
                case 1: return Week1_1.run(input);
                case 2: return Week1_2.run(input);
                case 3: return Week1_3.run(input);
                case 4: return Week1_4.run(input);
                case 5: return Week1_5.run(input);
                case 6: return Week1_6.run(input);
                case 7: return Week1_7.run(input);
                case 8: return Week1_8.run(input);
                case 9: return Week1_9.run(input);
                case 10: return Week1_10.run(input);
                case 11: return Week1_11.run(input);
                case 12: return Week1_12.run(input);
            }
        }
        if ( week == 2 ){
            switch(id){
                case 1: return Week2_1.run(input);
                case 2: return Week2_2.run(input);
                case 3: return Week2_3.run(input);
                case 4: return Week2_4.run(input);
            }
        }
        if ( week == 3 ){
            switch(id){
                case 1: return Week3_1.run(input);
                case 2: return Week3_2.run(input);
                case 3: return Week3_3.run(input);
                case 4: return Week3_4.run(input);
                case 5: return Week3_5.run(input);
                case 6: return Week3_6.run(input);
                case 7: return Week3_7.run(input);
                case 8: return Week3_8.run(input);
                case 9: return Week3_9.run(input);
                case 10: return Week3_10.run(input);
                case 11: return Week3_11.run(input);
                case 12: return Week3_12.run(input);
                case 13: return Week3_13.run(input);
            }
        }
        if ( week == 4 ){
            switch(id){
                case 1: return Week4_1.run(input);
                case 2: return Week4_2.run(input);
                case 3: return Week4_3.run(input);
                case 4: return Week4_4.run(input);
                case 5: return Week4_5.run(input);
                case 6: return Week4_6.run(input);
                case 7: return Week4_7.run(input);
                case 8: return Week4_8.run(input);
                case 9: return Week4_9.run(input);
                case 10: return Week4_10.run(input);
                case 11: return Week4_11.run(input);
                case 12: return Week4_12.run(input);
                case 13: return Week4_13.run(input);
                case 14: return Week4_14.run(input);
                case 15: return Week4_15.run(input);
                case 16: return Week4_16.run(input);
            }
        }
        return "";
    }
}
