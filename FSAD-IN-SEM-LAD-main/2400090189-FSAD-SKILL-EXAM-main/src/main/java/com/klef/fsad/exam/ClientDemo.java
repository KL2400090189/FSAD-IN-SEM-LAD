package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class ClientDemo
{

public static void main(String[] args)
{

Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session session = sf.openSession();

Transaction tx = session.beginTransaction();

Transport t1 = new Transport("Bus","10-03-2026","Active");
Transport t2 = new Transport("Truck","11-03-2026","Inactive");

session.save(t1);
session.save(t2);

tx.commit();

String hql = "from Transport";
Query q = session.createQuery(hql);

List<Transport> list = q.list();

for(Transport t:list)
{
System.out.println(t.getId()+" "+t.getName()+" "+t.getDate()+" "+t.getStatus());
}

session.close();
sf.close();

}

}