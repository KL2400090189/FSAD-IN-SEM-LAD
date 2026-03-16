package com.klef.fsad.exam;

import javax.persistence.*;

@Entity
@Table(name="transport")
public class Transport
{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String name;
private String date;
private String status;

public Transport() {}

public Transport(String name,String date,String status)
{
this.name=name;
this.date=date;
this.status=status;
}

public int getId() { return id; }

public String getName() { return name; }

public void setName(String name) { this.name=name; }

public String getDate() { return date; }

public void setDate(String date) { this.date=date; }

public String getStatus() { return status; }

public void setStatus(String status) { this.status=status; }

}