package com.concretepage.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.concretepage.entity.Session;

public interface ISessionService {     
     Session getSessionById(String session_id);
     boolean addSession(Session session);
     void updateSession(Session session);
}
