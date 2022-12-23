package com.bikkadit.hdemo.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bikkadit.hdemo.ManyToMany.model.Player;
import com.bikkadit.hdemo.ManyToMany.model.Sport;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        
        Player p1 = new Player();
        Player p2 = new Player();
        
        p1.setId(101);
        p1.setName("Dhoni");
        p2.setId(102);
        p2.setName("Kohli");
           
        
        Sport s1 = new Sport();
        Sport s2 = new Sport();
        
        s1.setSid(11);
        s1.setSportName("cricket");
        s2.setSid(12);
        s2.setSportName("Hockey");
        
        List<Sport> SportList = new ArrayList<Sport>();
        List<Player> PlayerList = new ArrayList<Player>();
        
        SportList.add(s1); SportList.add(s2);
        PlayerList.add(p1); PlayerList.add(p2);
        
        p1.setSport(SportList);
        p2.setSport(SportList);
        s1.setPlayer(PlayerList);
        s2.setPlayer(PlayerList);
        
        Transaction tx = session.beginTransaction();
        session.save(p1);
        session.save(p2);
        session.save(s1);
        session.save(s2);
        
        tx.commit();
        session.close();
        
    }
}
