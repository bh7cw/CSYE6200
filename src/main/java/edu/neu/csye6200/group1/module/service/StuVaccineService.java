package edu.neu.csye6200.group1.module.service;

import edu.neu.csye6200.group1.module.dao.ImmunizationRecord;
import edu.neu.csye6200.group1.module.mapper.VaccineRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

@Service
public class StuVaccineService {
    @Autowired
    VaccineRecordMapper vaccineRecordMapper;

    public ImmunizationRecord getVaccineRecord(int n){
        return vaccineRecordMapper.getStuVaccine(n);
    }



    /**
     *
     *  dose001: only need 2 doses injection
     */
    public Map inject001(int id, Date date, Map<String, Object> map){

        int times = vaccineRecordMapper.getTimes001(id);
        if(times == 0){
            vaccineRecordMapper.updateInject001(id, date);
            vaccineRecordMapper.updateDose001(id, times+1);
            map.put("msg", "Inject Successful!");
            return map;
        }
        // get the next validate inject date
        Date lastInject = vaccineRecordMapper.getInjectDate001(id);
        Calendar cal = Calendar.getInstance();
        cal.setTime(lastInject);
        cal.add(Calendar.DATE, 15);
        System.out.print(cal.getTime());
        System.out.print(date);

        if ( times < 2){
            if (cal.getTime().after(date)){
                map.put("msg","Sorry, you should inject at " + cal.getTime());
            }else{
                vaccineRecordMapper.updateInject001(id, date);
                vaccineRecordMapper.updateDose001(id, times+1);
                map.put("msg", "Inject Successful!");

            }
        }
        return map;

    }



    /**
     *
     *  dose002: only need 4 doses injection
     */
    public Map inject002(int id, Date date, Map<String, Object> map){
        int times = vaccineRecordMapper.getTimes002(id);
        if(times == 0){
            vaccineRecordMapper.updateInject002(id, date);
            vaccineRecordMapper.updateDose002(id, times+1);
            map.put("msg", "Inject Successful!");
            return map;
        }

        // get the next validate inject date
        Date lastInject = vaccineRecordMapper.getInjectDate002(id);
        Calendar cal = Calendar.getInstance();
        cal.setTime(lastInject);


        if ( times < 3 ){
            cal.add(Calendar.DATE, 17);
            if (cal.getTime().after(date)){
                map.put("msg","Sorry, you should inject at " + cal.getTime());

            }else{
                vaccineRecordMapper.updateInject002(id, date);
                vaccineRecordMapper.updateDose002(id, times+1);
                map.put("msg", "Inject Successful!");

            }
        }else if(times < 4){
            cal.add(Calendar.DATE, 25);
            if (cal.getTime().after(date)){
                map.put("msg","Sorry, you should inject at " + cal.getTime());

            }else{
                vaccineRecordMapper.updateInject002(id, date);
                vaccineRecordMapper.updateDose002(id, times+1);
                map.put("msg", "Inject Successful!");
            }
        }
        return map;

    }

    /**
     *
     *  dose003 only need 3 doses injection
     */
    public Map inject003(int id, Date date, Map<String, Object> map){
        int times = vaccineRecordMapper.getTimes003(id);

        if(times == 0){
            vaccineRecordMapper.updateInject003(id, date);
            vaccineRecordMapper.updateDose003(id, times+1);
            map.put("msg", "Inject Successful!");
            return map;
        }
        // get the next validate inject date
        Date lastInject = vaccineRecordMapper.getInjectDate003(id);
        Calendar cal = Calendar.getInstance();
        cal.setTime(lastInject);
        cal.add(Calendar.DATE, 15);
        System.out.print(cal.getTime());
        System.out.print(date);

        if ( times < 3) {
            if (cal.getTime().after(date)) {
                map.put("msg", "Sorry, you should inject at " + cal.getTime());
            } else {
                vaccineRecordMapper.updateInject003(id, date);
                vaccineRecordMapper.updateDose003(id, times + 1);
                map.put("msg", "Inject Successful!");

            }
        }
        return map;

    }

    /**
     *
     *  dose004 only need 3 doses injection
     */
    public Map inject004(int id, Date date, Map<String, Object> map){
        int times = vaccineRecordMapper.getTimes004(id);
        //update the date and times/dose
        if(times == 0){
            vaccineRecordMapper.updateInject004(id, date);
            vaccineRecordMapper.updateDose004(id, times+1);
            map.put("msg", "Inject Successful!");
            return map;
        }

        // get the next validate inject date
        Date lastInject = vaccineRecordMapper.getInjectDate004(id);
        Calendar cal = Calendar.getInstance();
        cal.setTime(lastInject);


        if ( times < 2 ){
            cal.add(Calendar.DATE, 30);
            if (cal.getTime().after(date)){
                map.put("msg","Sorry, you should inject at " + cal.getTime());

            }else{
                vaccineRecordMapper.updateInject004(id, date);
                vaccineRecordMapper.updateDose004(id, times+1);
                map.put("msg", "Inject Successful!");

            }
        }else if(times < 3){
            cal.add(Calendar.DATE, 35);
            if (cal.getTime().after(date)){
                map.put("msg","Sorry, you should inject at " + cal.getTime());

            }else{
                vaccineRecordMapper.updateInject004(id, date);
                vaccineRecordMapper.updateDose004(id, times+1);
                map.put("msg", "Inject Successful!");

            }
        }
        return map;

    }

    /**
     *
     *  dose005 only need 1 doses injection
     */
    public Map inject005(int id, Date date, Map<String, Object> map){
        int times = vaccineRecordMapper.getTimes005(id);
        //update the date and times/dose
        if(times == 0) {
            vaccineRecordMapper.updateInject005(id, date);
            vaccineRecordMapper.updateDose005(id, times + 1);
            map.put("msg", "Inject Successful!");
            return map;
        }
        return map;

    }



    /**
     *
     *  dose006 only need 1 doses injection
     */
    public Map inject006(int id, Date date, Map<String, Object> map){
        int times = vaccineRecordMapper.getTimes006(id);
        //update the date and times/dose
        if(times == 0) {
            vaccineRecordMapper.updateInject006(id, date);
            vaccineRecordMapper.updateDose006(id, times + 1);
            map.put("msg", "Inject Successful!");
            return map;
        }
        return map;

    }
}
