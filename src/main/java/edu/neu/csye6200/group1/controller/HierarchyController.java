package edu.neu.csye6200.group1.controller;

import edu.neu.csye6200.group1.model.extdao.ExtHierarchy;
import edu.neu.csye6200.group1.model.service.HierarchyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HierarchyController {
    @Autowired
    HierarchyService hierarchyService;

    /**
     * for homepage hierarchy display, return ExtHierarchy objects which have attributes of classroomId, groupInfoId, studentMonth, teacherFullName, studentFullName
     * @return Map<String,Object>
     */
    @ResponseBody
    @GetMapping("/showHierarchy")
    public Map getHierarchy(){
        ArrayList<ExtHierarchy> extHierarchyList = hierarchyService.getHierarchy();
        Map<String,Object> map= new HashMap<>();
        map.put("total",extHierarchyList.size());
        map.put("rows",extHierarchyList);
        return map;
    }

    /**
     * for create new hierarchy, should be used every time after student table is updated
     */
    @ResponseBody
    @GetMapping("/createHierarchy")
    public void createHierarchy(){
        hierarchyService.createHierarchy();
    }
}