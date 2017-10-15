package controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultListModel;
import models.ModelOrdenar;
import views.ViewOrdenar;


public class ControllerOrdenar {
    DefaultListModel model = new DefaultListModel();
    List<Integer> lista = new ArrayList<Integer>();
    ModelOrdenar model_ordenar;
    ViewOrdenar view_ordenar;
    
    public ControllerOrdenar(ModelOrdenar model_ordenar, ViewOrdenar view_ordenar){
        this.model_ordenar = model_ordenar;
        this.view_ordenar = view_ordenar;   
        view_ordenar.jbtn_agregar.addActionListener(e->jbtn_agregar_click());
        view_ordenar.jbtn_asc.addActionListener(e->jbtn_asc_click());        
        initView();
    }
    public void initView(){
        view_ordenar.setVisible(true);
    }                    
    public void jbtn_agregar_click(){
        model_ordenar.setNum(Integer.parseInt(view_ordenar.jtf_num.getText()));
        model.addElement(model_ordenar.getNum());
        lista.add(model_ordenar.getNum());
        view_ordenar.jl_lista.setModel(model);
    }
    public void jbtn_asc_click(){
        model.removeAllElements();
        Collections.sort(lista);
        for (int i=0; i<lista.size();i++){
            Integer val = lista.get(i);
            model.addElement(val);
        }                        
    }    
}
