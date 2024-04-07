/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter12.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class NullValidator {
    public static void main(String[] args) {
        Human h = new Human();
        //h.name = "TK";
        
        Object obj = h;
        Field[] fields = obj.getClass().getDeclaredFields();
        
        for(Field field : fields)
        {
            //System.out.println("Filed Name "+ field.getName() + " Type "+field.getType());
            
            Annotation annos[] = field.getDeclaredAnnotations();
            //System.out.println("Anono "+annos.length);
            for(Annotation anno : annos)
            {
                if(anno instanceof NotNull)
                {
                    String name = field.getName();
                    //System.out.println("NotNull field "+name);
                    Object value;
                    try {
                        value = field.get(obj);
                        if(value == null)
                        {
                            NotNull notNull = (NotNull)anno;
                            String message = notNull.message();
                            if(message.isEmpty())
                            {
                                System.err.println("Field "+name+" is null");
                            }
                            else
                            {
                                System.err.println(message);
                            }
                            
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    
                }
            }
        }
    }
}
