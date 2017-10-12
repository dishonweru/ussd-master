package com.concretepage.service;

import javax.servlet.http.HttpServletRequest;

import com.concretepage.entity.Menu;

public interface IMenuService {     
     Menu getMenuById(int id);
     Menu getInitMenuXML(int id, HttpServletRequest request);
     boolean addMenu(Menu menu);
     void updateMenu(String service_id, HttpServletRequest request);
     String getMenuByStageId(HttpServletRequest request, int stage_id);
}
