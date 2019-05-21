/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsd;

import java.io.Serializable;
        
public class Student implements Serializable {
    private String name;
    private int id;
    private String email;
    private String password;
    public Student()
    {
    super();
    }
    public String getName()
    {return this.name;}
    public void setName(String name)
    {
    this.name = name;
    }
}
